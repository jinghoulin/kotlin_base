package com.mac.kt_base.s3

import java.io.File

// TODO 53.Kotlin语言的also内置函数
fun main() {
    val str: String = "Derry"
    val r1: String = str.also {
        true
        5345325.5f
        535
        'C'
    }

    val r2: Int = 123.also {
        true
        5345325.5f
        535
        'C'
        false
    }

    str.also {
        // it == str本身
    }

    // 真正使用alos函数的写法规则如下：
    str.also {
        println("str的原本值是:$it")
    }.also {
        println("str全部转换成小写后的效果是:${it.toLowerCase()}")
    }.also {
        println("结束了")
    }

    println()

    val file: File = File("D:\\Derry.txt")
    file.also {
        it.setReadable(true)
    }.also {
        it.setWritable(true)
    }.also {
        println(it.readLines())
    }.also {
        // 假设 这里做了很多很多的事情工作
        // ...
    }.also {
        // 假设 这里做了很多很多的事情工作
        // ...
    }.also {
        // 假设 这里做了很多很多的事情工作
        // ...
    }.also {
        println("文件绝对路径是:${it.absolutePath}")
    }.also {
        // 假设 这里做了很多很多的事情工作
        // ...
    }
}