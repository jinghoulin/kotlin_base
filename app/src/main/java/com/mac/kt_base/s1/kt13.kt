package com.mac.kt_base.s1

// TODO Kotlin的range表达式讲解
fun main() {
    val number = 60

    // range表达式 范围 从哪里 到 哪里。都是闭区间

    if (number in 10..59) {
        println("分数不及格")
    } else if (number in 0..9) {
        println("分数不及格并且分数很差")
    } else if (number in 60..100) {
        println("分数合格")
    } else if (number !in 0..100) {
        println("分数不在0到100范围内")
    }
}