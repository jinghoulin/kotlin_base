package com.mac.kt_base.s5

// public final class Person  -- KT所有的类，默认是final修饰的，不能被继承，和Java相反
// open 去除 final修饰
open class Person(private val name: String) {
    private fun showName() = "父类 的姓名是【$name】"

    // public final void myPrintln -- KT所有的函数，默认是final修饰的，不能被重写，和Java相反
    // open 去除 final修饰
    open fun myPrintln() = println(showName())
}

class Student(private val subName: String) : Person(subName) {
    private fun showName() = "子类 的姓名是【${subName}】"

    override fun myPrintln() = println(showName())
}

// TODO 82.Kotlin的继承与重载的open关键字
fun main() {
    val person : Person = Student("Derry1")
    person.myPrintln()
}