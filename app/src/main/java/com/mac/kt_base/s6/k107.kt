package com.mac.kt_base.s6

class K107 <INPUT> (vararg objects: INPUT, val isR: Boolean = true) {
    private val objectArray: Array<out INPUT> = objects // 开启INPUT泛型的只读模式，不能修改

    // TODO 1.5种返回类型变化的解释

    // true:Array<out INPUT>    false:null
    fun getR1() : Array<out INPUT> ? = objectArray.takeIf { isR }

    // true:Array<out INPUT>    false:"你是null了" String  两个类型 就用顶级父类接收Any
    fun getR2() : Any = objectArray.takeIf { isR } ?: "你是null了"

    // true:Array<out INPUT>    false:"你是null了" String     ?类型      三个类型 就用顶级父类接收Any
    fun getR3() : Any ? = objectArray.takeIf { isR } ?: "你是null了" ?: null

    // true:INPUT    false:null     INPUT ?
    fun getR4(index: Int) : INPUT ? = objectArray[index].takeIf { isR } ?: null

    // INPUT  "AAA" 546 6445.546f 'C' false null = Any ?
    fun getR5(index: Int) : Any ? = objectArray[index].takeIf { isR } ?: "AAA" ?: 546 ?: 6445.546f ?: 'C' ?: false ?: null

    // TODO 2.运算符重载 [0] [1]
    operator fun get(index: Int) : INPUT ? = objectArray[index].takeIf { isR }
}

// TODO 3.给泛型传入null后，直接操作
// 泛型是很大的范围类型，可以接收很多类型，当然也可以接收null，但是接收null后，要处理好
fun <INPUT> inputObj(item: INPUT) {
    // println("你传递进来的长度是：${(item as String).length}")
    println("你传递进来的长度是：${(item as String?)?.length ?: "你个货传递的泛型数据是null啊" } ")
}

// TODO 107-Kotlin的[ ]操作符讲解
// 1.5种返回类型变化的解释
// 2.给泛型传入null后，直接操作
fun main() {
    val p1: K107<String ?> = K107("张三", "李四", "王五", null)
    val r1: String? = p1[0]
    val r2: String? = p1[1]
    val r3: String? = p1[2]
    val r4: String? = p1[3]
    println(r3)
    println(r4)

    println()

    inputObj("Derry")
    inputObj("KevinAAA")
    inputObj(null)
}