package com.mac.kt_base.s3

// TODO 44.Kotlin语言的replace完成加密解码操作
// ABCDEFGHIJKLMNOPQRSTUVWXYZ
fun main() {
    val sourcePwd = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    println("原始密码:$sourcePwd")

    // 加密操作：就是把字符串给替换成数字，打乱了，就属于加密
    val newPwd = sourcePwd.replace(Regex("[AKMNO]")) {
        // println("it:${it.value}") // it.value == A K M N O
        // it.value // 这样写，没有意义，相当于 啥事没有做

        when (it.value) {
            "A" -> "9"
            "K" -> "3"
            "M" -> "5"
            "N" -> "1"
            "O" -> "4"
            else -> it.value // 啥事不做，直接返回 字符本身  A B C D ...
        }
    }
    println("加密后的密码:$newPwd")

    // 解密操作
    val sourcePwdNew = newPwd.replace(Regex("[93514]")) {
        when (it.value) {
            "9" -> "A"
            "3" -> "K"
            "5" -> "M"
            "1" -> "N"
            "4" -> "O"
            else -> it.value // 啥事不做，直接返回 字符本身  A B C D ...
        }
    }
    println("解密后的密码:$sourcePwdNew")
}