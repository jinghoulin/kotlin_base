package com.mac.kt_base.s2

// TODO 22.Kotlin的匿名函数讲解
fun main() {
    var derryLength: Int = "Derry".count()
    println("Derry名字长度是:$derryLength")

    derryLength = "Derry".count() {
        // 为什么要给这个匿名函数 传递一个Char类型进来 D e r r y
        // 由于没有名字，会默认给这个Char类型 一个名字，一般情况下，在KT中，都是 it

        it == 'r' // 如果 it 等于 r 字符，就返回true， 最终返回两个true
    }
    println("Derry r 长度是:$derryLength")
}