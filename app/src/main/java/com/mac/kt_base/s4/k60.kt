package com.mac.kt_base.s4

// TODO 60.Kotlin语言的解构语法过滤元素学习
fun main() {
    val list: List<String> = listOf("李元霸", "李小龙", "李连杰")

    val (value1: String, value2: String, value3: String) = list
    // value1 = "李小小" val是只读的，所以不能修改
    println("value1:$value1, value2:$value2, value3:$value3")

    var (v1, v2, v3) = list
    v1 = "元霸"
    println("value1:$v1, value2:$v2, value3:$v3")

    // 用_内部可以不接收赋值，那么就可以节约一点点性能
    val (_, n2: String, n3: String) = list
    // println(_) _不是变量，是 用来过滤解构赋值的， 拒收 值， 不接收赋值给我
    println("n2:$n2, n3:$n3")
}