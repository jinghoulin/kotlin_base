package com.mac.kt_base.s3

// TODO 35.Kotlin语言的安全调用操作符
fun main(args: Array<String>) {

    var name : String ? = "zhangsan"
    name = null
    name = "lixiaolong"
    name = null
    name = "aaaa"

    // ?.capitalize 如果这个name真的是null，就不会执行 ?后面这个区域代码，所以就不会奔溃
    val r = name ?.capitalize() // name是可空类型的，可能是null，想要使用name，必须给出补救措施
    println(r)

    var a = {}
}