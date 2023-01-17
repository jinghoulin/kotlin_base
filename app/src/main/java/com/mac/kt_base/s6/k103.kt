package com.mac.kt_base.s6

// 1.万能对象返回器 Boolean来控制是否返回 运用 takeIf
class K103<T> (private val isR: Boolean, private val obj: T) {
    fun getObj() : T ? = obj.takeIf { isR } // 万能返回器
}

// TODO 103-Kotlin内置函数与泛型综合实战
// 1.万能对象返回器 Boolean来控制是否返回 运用 takeIf
// 2.四个对象打印
// 3.对象打印 + run + ?:
// 4.对象打印 + apply + ?:
// 5.show(t: T) + apply + ?:
fun main() {
    val stu1 = Student("张三", 88, '男')
    val stu2 = Student("李四", 78, '女')
    val tea1 = Teacher("王五", 77, '男')
    val tea2 = Teacher("赵六", 89, '女')

    // 2.四个对象打印
    println(K103(true, stu1).getObj())
    println(K103(true, stu2).getObj())
    println(K103(true, tea1).getObj())
    println(K103(false, tea2).getObj() ?: "大哥，你万能对象返回器，是返回null啊")

    println()

    // 3.对象打印 + run + ?:
    val result: Any = K103(true, stu1).getObj() ?.run {
        // 如果 getObj 返回有值，就会进来
        // this == getObj本身
        println("万能对象是:$this") // 返回 Unit类型
        64643.5 // 返回 Double类型
    } ?: println("大哥，你万能对象返回器，是返回null啊") // 返回 Unit类型
    println(result)

    println()

    // 4.对象打印 + apply + ?:
    val result2 : Student = K103(true, stu2).getObj().apply {  } !!
    println(result2)

    println()

    // 5.show(t: T) + apply + ?:
    show("Derry")
    show("Kevin")
    show("OK")
    show(null)

    println()

    show2("Derry")
    show2("Kevin")
    show2("OK")
    show2(null)
}

// 5.show(t: T) + apply + ?:
fun <B> show(item: B) : Unit {
    item ?.also {
        // it == item本身 B泛型
        println("万能对象是:$it")
    } ?:  println("大哥，你万能对象返回器，是返回null啊")
}

fun <B> show2(item: B) : Unit {
    val result : B ? = item ?.also {
        // it == item本身 B泛型
        if (it == null) {
            println("大哥，你万能对象返回器，是返回null啊")
        } else {
            println("万能对象是:$it")
        }
    } ?:  null
    println("show2 传递进来的值是:$result")
}