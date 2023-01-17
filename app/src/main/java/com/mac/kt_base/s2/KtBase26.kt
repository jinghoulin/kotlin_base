package com.mac.kt_base.s2

// TODO 26.Kotlin的匿名函数的类型断定讲解
fun main() {
    // 匿名函数：返回值类型 自动类型推断为 String
    // fun1 : 必须指定  参数类型 -> 返回类型    类似于 (Int) -> Double
    // fun1 = 类型推断返回类型
    val fun1 = {v1: Double, v2: Float, v3: Int ->
        "v1:$v1, v2:$v2, v3:$v3"
    }
    // fun1变量 请问是什么类型？ 面试题 答：(Double, Float, Int) -> String
    println(fun1(5345.5, 35345.4f, 888999))

    val fun2 = {

    }
    // fun2变量 请问是什么类型？ 面试题 答：() -> Unit

    val fun3 = {
        53253.5f
    }
    // fun3变量 请问是什么类型？ 面试题 答：() -> Float
    println(fun3())

    val fun4 /*: (Int) -> Int*/ = { number: Int ->
        number // 匿名函数的最后一行  Int类型
    }
    // fun4变量 请问是什么类型？ 面试题 答：(Int) -> Int
    println(fun4(99899))
}