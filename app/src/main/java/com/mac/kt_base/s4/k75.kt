package com.mac.kt_base.s4

class K75 (username: String, userage: Int, usersex: Char) // 主构造
{
    // 这个不是Java的 static{}
    // 相当于是Java的 {} 构造代码块
    // 初始化块，init代码块，主构造代码块 ...
    init {
        println("主构造函数被调用了 $username, $userage, $usersex")

        // 判断name是不是空值 isNotBlank   ""
        require(username.isNotBlank()) { "你的username空空如也，异常抛出" }

        require(userage > 0) { "你的userage年龄不符合，异常抛出" }

        require(usersex == '男' || usersex == '女') { "你的性别很奇怪了，异常抛出" }
    }

    constructor(username: String) : this(username, 78, '男') {
        println("次构造函数被调用了")
    }

    fun show() {
        // println(username) // 用不了，必须要二次转换，才能用
    }
}

// TODO 75.Kotlin语言的初始化块学习
fun main() {
    K75("李四", userage = 88, usersex = '女')  // 调用主构造

    K75("AA", userage = 88, usersex = '女')  // 调用主构造

    K75("AA", userage = 88, usersex = '男')  // 调用主构造

    println()

    K75("李元霸")

    // 小结：在企业开发过程中， 主构造的 init代码块里面， require监测，必须传递的值，要有
}