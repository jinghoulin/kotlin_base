package com.mac.kt_base.s3

// TODO 41.Kotlin语言的先决条件函数
fun main() {
    val value1 : String ? = null
    var value2 : Boolean = false

    // checkNotNull(value1) //  IllegalStateException(Required value was null.)
    // requireNotNull(value1) // IllegalArgumentException( Required value was null.)

    // require(value2) // IllegalArgumentException("Failed requirement.")
    require(value2) { "你的Value2是false呀" }
}