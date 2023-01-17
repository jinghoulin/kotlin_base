package com.mac.kt_base.s5

import java.io.File

open class Person2(private val name: String) {
    fun showName1() = "父类 的姓名是【$name】"

    open fun myPrintln() = println(showName1())
}

class Student2(private val subName: String) : Person2(subName) {
    fun showName2() = "子类 的姓名是【${subName}】"

    override fun myPrintln() = println(showName2())
}

// TODO 83.Kotlin的类型转换
fun main() {
    val person : Person2 = Student2("Derry1")
    person.myPrintln()

    println(person is Person2)
    println(person is Student2)
    println(person is File)

    // is + as 来配合一起使用
    if (person is Student2) {
        (person as Student2).myPrintln()
    }

    if (person is Person2) {
        // println((person as Person2).myPrintln()) // myPrintln已经被子类重写了，就算调用到父类，还是会执行到子类
        println((person as Person2).showName1()) // as 转换成了父类，父类.showName1() 当然是父类
    }
}