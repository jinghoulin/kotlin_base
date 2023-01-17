package com.mac.kt_base.s4

class Kt80() {

    val info: String

    init {
        info = "DerryOKSuccessful"
        getInfoMethod()
    }

    fun getInfoMethod() = println("info的第一个字符是:${info[0]}")
}

// TODO 80.Kotlin语言的初始化陷阱二学习
fun main() {
    Kt80()
        .getInfoMethod()
}