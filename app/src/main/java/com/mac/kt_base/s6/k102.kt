package com.mac.kt_base.s6

class K102<T> (private val obj: T) {
    fun show() = println("万能输出器:$obj")
}

data class Student(val name: String , val age: Int, val sex: Char)
data class Teacher(val name: String , val age: Int, val sex: Char)

// TODO 102-Kotlin的定义泛型类讲解
fun main() {
    val stu1 = Student("张三", 88, '男')
    val stu2 = Student("李四", 78, '女')

    val tea1 = Teacher("王五", 77, '男')
    val tea2 = Teacher("赵六", 89, '女')

    K102(stu1).show()
    K102(stu2).show()
    K102(tea1).show()
    K102(tea2).show()

    K102(String("李丽丽".toByteArray())).show()

    K102(5345).show()
    K102(53425.5).show()
    K102(3554.5f).show()
    K102('女').show()
}