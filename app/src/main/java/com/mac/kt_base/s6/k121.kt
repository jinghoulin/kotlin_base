package com.mac.kt_base.s6

import java.io.File

fun fun1() {}

// TODO 121-Kotlin手写apply内置函数
fun main() {
    val r : File = File("D:\\Derry.txt").mApply {
        // 输入的是 this == File对象本身(调用者本身)
        setReadable(true)
        setWritable(true)
        println("1 ${readLines()}")
    }.mApply {
        // 输入的是 this == File对象本身
        setReadable(true)
        setWritable(true)
        println("2 ${readLines()}")
    }.apply {
        // 输入的是 this == File对象本身
        setReadable(true)
        setWritable(true)
        println("3 ${readLines()}")
        true
        2345.5
    }
    // ... 省略

    println()

    val r2 : File = File("D:\\Derry.txt").apply {
        // 输入的是 this == File对象本身(调用者本身)
        setReadable(true)
        setWritable(true)
        println("1 ${readLines()}")
    }.apply {
        // 输入的是 this == File对象本身
        setReadable(true)
        setWritable(true)
        println("2 ${readLines()}")
    }.apply {
        // 输入的是 this == File对象本身
        setReadable(true)
        setWritable(true)
        println("3 ${readLines()}")
    }
    // ... 省略

    123.mApply {  }
    true.mApply {  }
    fun1().mApply {  }
    null.mApply {}
    // 省略几亿个类型
    // ...
}

// 精华： fun INPUT .() 【对INPUT泛型扩展一个匿名的函数】              fun INPUT.abc() 对泛型INPUT 函数扩展 【对INPUT泛型扩展 一个具名abc的函数】
// private私有
// inline 因为我们的函数是高阶函数，需要使用内联对 lambda进行优化处理，提高性能
// fun <INPUT> 函数中声明一个泛型
// INPUT.mApply 让所有的类型，万能类型，全部都可以 xxx.myApply  泛型扩展
//  INPUT.()  让我们的匿名函数里面持有 this ,                    -> Unit 在lambda里面不需要返回值，因为永远都是返回INPUT本身
// lambda(this) 默认就有this
// 返回this的目的是可以链式调用
private inline fun <INPUT> INPUT.mApply (lambda : INPUT.() -> Unit) : INPUT {
    lambda() // 省略this
    return this
}

