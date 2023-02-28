package com.mac.kt_base.s3

// TODO 52.Kotlin语言的with内置函数
fun main() {
    val str: String = "李连杰"

    /*with(str) {
        // this == str本身
    }*/

    // 具名操作
    val result1: Int = with(str, ::getStrLenAction)
    val result2: String = with(result1, ::getLenInfoAction)
    val result3: String = with(result2, ::getInfoMap)
    with(result3, ::show)

    println()

    // 匿名操作
    with(with(with(with(str) {
        str.length
    }
    ) {
        "你的字符串长度是:$this"
    }) {
        "【$this】"
    }) {
        println("匿名操作 打印:$this")
    }

    // TODO 使用时不同（run可以链式调用，with不可以）
    var name: String? = "Derry"
    name = null

    name?.run {

    }

    // 虽然功能和 run 一模一样，但是在使用时，区别很大，无法使用 ?补救措施
    /*with(name) {

    }*/
}

fun getStrLenAction(str: String): Int = str.length
fun getLenInfoAction(len: Int): String = "你的字符串长度是:$len"
fun getInfoMap(info: String): String = "【$info】"
fun show(text: String) = println("具名操作 打印:$text")