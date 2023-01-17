package com.mac.kt_base.s6

class K106<T> (vararg objects : T, var isMap: Boolean) {
    // out 我们的T只能被 读取，不能修改   T只能读取
    private val objectArray : Array<out T> = objects

    fun showObj(index: Int) : T ? = objectArray[index].takeIf { isMap }

    fun <O> mapObj(index: Int, mapAction: (T ?) -> O) : O = mapAction( objectArray[index].takeIf { isMap } )
}

// TODO 106-Kotlin的vararg关键字(动态参数)
fun main() {
    // 由于你使用了 太多类型的混合了，真正的类型是：<{Comparable<*> & java.io.Serializable}?>
    // 由于不允许我们这样写 : K106<{Comparable<*> & java.io.Serializable?}>  所以我们用父类 Any? 代替
    val p: K106<Any?> = K106("Derry", false, 53454, 4543.3f, 4554.54, null, 'C', isMap = true)

    println(p.showObj(0))
    println(p.showObj(1))
    println(p.showObj(2))
    println(p.showObj(3))
    println(p.showObj(4)) // 4554.54
    println(p.showObj(5) ?: "你是null值哦") // null
    println(p.showObj(6)) // C

    println()

    val p2: K106<String> = K106("AAA", "BBB", "CCC", isMap = true)
    // String ---> String
    val r2 : String = p2.mapObj(2) {
        // it == CCC               // 输入类型区域 String

        "我要把你变成String类型 it:$it" // 输入类型区域 String
    }
    println(r2)
}