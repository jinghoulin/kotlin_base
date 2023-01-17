package com.mac.kt_base.s6

// TODO 128-Kotlin的互操作性与可空性
fun main() {
    // 下面是 Java 与 KT 交互 ，错误的案例
    // : String! Java 与 KT 交互的时候，Java给KT用的值，都是 : String! 这种类型
    val info1  = k128().info1
    val info2 = k128().info2
    println(info1.length)
    // println(info2.length) // 引发空指针异常

    println()

    // 下面是 Java 与 KT 交互 ，正确的案例1
    // : String! Java 与 KT 交互的时候，Java给KT用的值，都是 : String! 这种类型
    // 只要是看到有  String! 的类型，在使用的时候，必须 ?.length，这个是规则1 这个规则1不好，如果忘记写，就有风险
    val info1s  = k128().info1
    val info2s = k128().info2
    println(info1s?.length)
    println(info2s?.length)

    // 下面是 Java 与 KT 交互 ，正确的案例2(极力推荐)
    // : String! Java 与 KT 交互的时候，Java给KT用的值，都是 : String! 这种类型
    // 只要是看到有  String! 的类型，在使用的时候，必须 String? 来接收Java值，这个是规则2（直接限定你不会出错了）
    val info1ss : String ?  = k128().info1
    val info2ss : String ? = k128().info2
    println(info1ss?.length)
    println(info2ss?.length)
}