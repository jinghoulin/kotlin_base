package com.mac.kt_base.s3

const val INFO = "Derry---is Success Result"

// TODO 42.Kotlin语言的substring
fun main() {
    val indexOf = INFO.indexOf('i')
    println(INFO.substring(0, indexOf))
    // Kotlin特有的until，与上面效果一样
    println(INFO.substring(0 until indexOf))
}