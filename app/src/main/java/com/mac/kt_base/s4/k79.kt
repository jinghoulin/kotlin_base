package com.mac.kt_base.s4

class K79 {

    var number = 9 // 由于你是写在 init代码块前面，所以先生成你， 其实类成员 和 init代码块 是同时生成

    init {
        number = number.times(9);
        // number2 = number2.times(8)
    }

    var number2 = 8 // 由于你是写在 init代码块后面，所以先生成init， 其实类成员 和 init代码块 是同时生成
}

// TODO 79.Kotlin语言的初始化陷阱一学习
fun main() {
    println(K79().number)
}