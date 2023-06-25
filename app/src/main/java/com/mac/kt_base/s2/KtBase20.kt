package com.mac.kt_base.s2

// TODO 20.Kotlin的Nothing类型特点讲解
fun main() {
    show(71)

    val usb = USBImpl()
    usb.insert()
}

private fun show(number: Int) {
    when (number) {
        -1 -> TODO("没有这种分数") // 可以终止行为执行下去，抛出一个异常
        // Java的todo不同。这个TODO是个函数会throw NotImplementedError，并返回Nothing类型
        in 0..59 -> println("分数不及格")
        in 60..70 -> print("分数及格")
        in 71..100 -> print("分数优秀")
    }
}

interface USB {
    fun insert()
}

class USBImpl : USB {
    override fun insert() {
        // 下面这句话，不是注释的提示， 内部 有 Nothing类型（抛出一个错误）让程序终止
        TODO("Not yet implemented 我确实没有实现")
    }
}