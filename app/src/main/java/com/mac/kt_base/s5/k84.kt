package com.mac.kt_base.s5

open class Person3(val name: String) {
    fun methodPerson() = println("我是父类的方法...") // 父类独有的函数
}

class Student3(private val nameSub: String) : Person3 (nameSub) {
    fun methodStudent() = println("我是子类的方法...") // 子类独有的函数
}

// TODO 84.Kotlin的智能类型转换
fun main() {
    val p : Person3 = Student3("李四")

    // 智能类型转换
    (p as Student3).methodStudent()

    p.methodStudent()
    p.methodStudent()
    p.methodStudent()
    p.methodStudent()
    p.methodStudent()

    // 智能类型转换：会根据上面的 as 转换成类型，自动明白，你现在的类型就是 as Student3 的类型了
    // 16行，记录你转换的过程，保存给了编译器一样， 所以后面编译器就非常聪明， p == Student3的类型了
    // 所以就可以 调用 Student3 的 子类 独有函数了methodStudent
}