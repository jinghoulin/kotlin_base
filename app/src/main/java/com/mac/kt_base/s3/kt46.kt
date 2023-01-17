package com.mac.kt_base.s3

// TODO 46.Kotlin语言的字符串遍历操作
// "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
fun main() {
    val str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    str.forEach { item: Char ->
        // it == str的每一个字符 A B C D ...
        println("字符是:$item")
    }
}