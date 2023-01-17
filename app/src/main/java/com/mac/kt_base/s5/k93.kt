package com.mac.kt_base.s5

class AddClass(var number1: Int, var number2: Int) {
    // operator fun +  C++
    operator fun plus(p1: AddClass) = (number1 + p1.number1) + (number2 + p1.number2)

    // 查看 整个KT可以用的  运算符重载 技巧方式
    // operator fun AddClass.
}

// TODO 93-Kotlin的运算符重载
fun main() {
    // C++语言    +运算符重载就行了  -运算符重载就行了
    // KT语言     plus代表 + 运算符重载
    println(AddClass(1, 1) + AddClass(2, 2))
}