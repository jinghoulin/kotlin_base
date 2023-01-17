package com.mac.kt_base.s2

// TODO 23.Kotlin的函数类型和隐式返回讲解
fun main() {
    // 第一步：函数 的 输入 与 输出 的 声明区域
    val methodAction : () -> String

    // 第二步：上面代码的 函数 的 输入 与 输出 的 实现区域
    methodAction = {
        "Derry老师"
        "Derry老师"
        "Derry老师"
        999
        true
        "Derry老师"
        "Derry老师"
        "Derry老师"
        val inputString = 754757
        "$inputString Derry" // 匿名函数不要写return，最后一行作为返回值  背后隐式：return inputString + "Derry" ;
        // 23535.4f // 自动类型推断 断定 这个最后一行的返回，就是 Float类型，这其实就属于 隐式返回
    }

    // 第三步：调用此函数
    println(methodAction())
    println(methodAction.invoke())

    // TODO ==================================

    // 调用下面的函数
    println(methodAction2())
    // println(methodAction2.invoke()) // 因为下面是真正的函数
}

// 下面是声明区域
fun methodAction2()      : String

// 下面是实现区域
{
    return "Derry老师"
}
