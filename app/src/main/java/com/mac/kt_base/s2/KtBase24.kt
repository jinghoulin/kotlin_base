package com.mac.kt_base.s2

// TODO 24.Kotlin的函数参数讲解
fun main() {

    // 第一步：函数 输入 和 输入 声明   第二步：对声明的实现
    val methodAction: (Int, Int, Int) -> String = { number1, number2, number3 ->
        val inputString = 754757
        "$inputString Derry 参数1:$number1,参数2:$number2,参数三:$number3"
    }

    // 第三步：调用上面 变量所描述的函数
    println(methodAction(1, 2, 3))

    // TODO ==================================

    // 可以调用下面 真正的函数
    println(methodAction2(4, 5, 6))
}

// 下面是真正的函数
fun methodAction2(number1: Int, number2: Int, number3: Int): String {
    val inputString = 754757
    return "$inputString Derry 参数1:$number1,参数2:$number2,参数三:$number3"
}