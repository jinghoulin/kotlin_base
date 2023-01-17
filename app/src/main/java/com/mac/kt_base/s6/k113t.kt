package com.mac.kt_base.s6

// 1.扩展函数不允许被重复定义
// fun Any.showPrintlnContent() = println("当前内容是:$this")

// TODO 113-Kotlin的超类上定义扩展函数
fun main() {

    "Derry1".showPrintlnContent()
    "Kevin1".showPrintlnContent()
    val number1 = 999999
    number1.showPrintlnContent()
    val number2 = 645654.6
    number2.showPrintlnContent()
    val number3 = 544354.5f
    number3.showPrintlnContent()
    val sex = '男'
    sex.showPrintlnContent()
    false.showPrintlnContent()
    // 省略几亿个类 ....

    '女'.showPrintlnContent2().showPrintlnContent2().showPrintlnContent2()

    "DerryOK".showPrintlnContent2().showPrintlnContent2().showPrintlnContent2().showPrintlnContent2()
}