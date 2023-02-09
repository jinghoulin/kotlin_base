package com.mac.kt_base.s2

// TODO 19.Kotlin的Unit函数特点讲解
fun main() /*: Unit*/ {
    val r: Unit = doWork()
    println(r) //  kotlin.Unit

    var r2 = doWork2()
    println(r2) //  kotlin.Unit
    // 可以判断是否为Unit类型
}

// Java语言的void关键字(void是 "无参数返回 忽略类型")但是他是关键字啊，不是类型，这个很矛盾
// : Unit 不写，默认也有， Unit代表  "无参数返回 忽略类型" == Unit类类型
private fun doWork() : Unit {
    return println(123)
}

private fun doWork2() {
    return println(456)
}