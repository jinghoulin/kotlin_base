package com.mac.kt_base.s3

import java.io.File

// TODO 49.Kotlin语言的apply内置函数
fun main() {
    val info: String = "Derry Is Successful"

    // TODO 普通的传统方式
    println("info字符串长度是:${info.length}")
    println("info最后一个字符是:${info[info.length - 1]}")
    println("info全部转化成小写:${info.toLowerCase()}")

    println()

    // TODO apply内置函数方式
    // info.apply特点：apply函数始终是返回info本身 String类型
    val infoNew: String = info.apply {
        // 一般大部分情况下，匿名函数，都会持有一个it，但是apply函数中不会持有it，却会持有this == info本身
        // this == info    info == this    谁点出apply函数，this == 谁
        println(this)
        8
        true

        println("info字符串长度是:${length}")// this可以省略
        println("info最后一个字符是:${this[length - 1]}")
        println("info全部转化成小写:${this.toLowerCase()}")

        7575
    }
    println("apply的返回值是:$infoNew")

    println()

    // TODO 真正使用apply函数的写法规则如下：
    // info.apply特点：apply函数始终返回 “info本身”，所以可以链式调用（而且在企业开发过程中，都是链式调用）
    info.apply {
        println("info字符串长度是:${length}")
        6464
        true
        5345.5f
    }.apply {
        println("info最后一个字符是:${this[length - 1]}")
    }.apply {
        println("info全部转化成小写:${this.toLowerCase()}")
    }
    // ...... 可以一直点下去，会发现 非常像 RxJava 链式调用， 分层特别清晰

    println()

    // TODO 普通传统的写法 读取文件功能
    val file: File = File("D:\\Derry.txt")
    file.setExecutable(true)
    file.setReadable(true)
    println(file.readLines())

    println()

    // TODO apply内置函数的写法 读取文件功能
    // 一个apply只做一个功能实现
    /*val file2: File =*/ file.apply {
        setExecutable(true)
    }.apply {
        setReadable(true)
    }.apply {
        println(readLines())
    }

    // TODO apply内置函数的结论：
    // 1.xxx.apply的返回值是， xxx点apply，返回xxx本身
    // 2.xxx.apply里面没有it，只有this，this == xxx本身
    // 3.使用中，不需要用apply的返回值，而是尽量链式调用，功能分层
}