package com.mac.kt_base.s3

// TODO 43.Kotlin语言的split操作
fun main() {
    val jsonText = "Derry,Derry2,Derry3,Derry4"

    // split里面也是挨个add进List的
    val list: List<String> = jsonText.split(',')

    println("分割后的list里面的元素有:${list}")

    list.forEach { println(it) }

    // C++解构   KT也有解构
    val (v1: String, v2, v3, v4) = list
    println("解构四个只读变量的值是:v1:$v1, v2:$v2, v3:$v3, v4:$v4")
}