package com.mac.kt_base.s2

// TODO 33.Kotlin语言的匿名函数与具名函数
fun main() {
    // 匿名函数
    showPersonInfo("Derry", 38, '男', "学习KT语言中") {
        println("匿名函数 显示结果:$it")
    }

    println()

    // 具名函数
    showPersonInfo("Derry", 38, '男', "学习KT语言中", ::showResultImpl)
}

// showResultImpl 是 实实在在的函数名 所以叫具名
fun showResultImpl(it: String) {
    println("具名函数 显示结果:$it")
}


inline fun showPersonInfo(name: String, age: Int, sex: Char, study: String, showResult: (String) -> Unit) {
    val str = "name:$name, age:$age, sex:$sex, study:$study"
    showResult(str)
}