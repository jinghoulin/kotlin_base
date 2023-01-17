package com.mac.kt_base.s4

// TODO 56.Kotlin语言的List创建与元素获取学习
// 普通取值方式：    索引
fun main() {

    val list: List<String> = listOf("Derry", "Zhangsan", "Lisi", "Wangwu")

    // 普通取值方式：    索引  内部是运算符重载 [] == get
    println(list[0])
    println(list[1])
    println(list[2])
    println(list[3])
    // println(list[4]) // 奔溃  java.lang.ArrayIndexOutOfBoundsException: 4

    println()

    // 我们写KT代码，一定不会再出现，空指针异常，下标越界异常， 那么就需要按照下面这样写

    println(list.getOrElse(3) {"越界"})
    println(list.getOrElse(4) {"越界了"})
    println(list.getOrElse(6734745) {"你越界了啊"})

    println()

    println(list.getOrNull(1))
    println(list.getOrNull(4))
    println(list.getOrNull(146456))
    // getOrNull + 空合并操作符
    println(list.getOrNull(5737) ?: "你越界了哦")

    // 总结：开发过程中，尽量使用 getOrElse 或者 getOrNull，才能体现KT语言的亮点（不用不崩溃）
}