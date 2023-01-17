package com.mac.kt_base.s6

import java.io.File
import java.nio.charset.Charset
import java.util.ArrayList

data class ResponseResult1(val msg: String, val code: Int)
data class ResponseResult2(val msg: String, val code: Int)
data class ResponseResult3(val msg: String, val code: Int)
data class ResponseResult4(val msg: String, val code: Int)
// 省略几亿个类 ....

// 最超类进行 一个函数 扩展
/*private*/ fun Any.showPrintlnContent() = println("当前内容是:$this")

// 最超类进行 一个函数 扩展
fun Any.showPrintlnContent2() : Any {
    println("当前内容是:$this")
    return this
}

// TODO 113-Kotlin的超类上定义扩展函数
// 1.扩展函数不允许被重复定义
// 2.对超类扩展函数的影响(整个公司项目，亿万个类型，都有 showPrintlnContent)
// 3.扩展函数 链式调用
fun main() {
    ResponseResult1("login success", 200).showPrintlnContent()
    ResponseResult2("login success", 200).showPrintlnContent()
    ResponseResult3("login success", 200).showPrintlnContent()
    ResponseResult4("login success", 200).showPrintlnContent()
    // 省略几亿个类 ....
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

    println(File("D:\\Derry.txt").readLines())

    '女'.showPrintlnContent2().showPrintlnContent2().showPrintlnContent2()

    "DerryOK".showPrintlnContent2().showPrintlnContent2().showPrintlnContent2().showPrintlnContent2()

    // 以前：JAVA 如果 Java设计，不出现这个api，我们用不了
    // 现在：KT 以用户为主动，你可以自己设计
}

// 第一点：如果我们自己写了两个一样的扩展函数，编译不通过
// 第二点：KT内置的扩展函数，被我们重复定义，属于覆盖，而且优先使用我们自己定义的扩展函数
public fun File.readLines(charset: Charset = Charsets.UTF_8): List<String> {
    val result = ArrayList<String>()
    forEachLine(charset) { result.add(it); }
    return result
}