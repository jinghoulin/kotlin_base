package com.mac.kt_base.s5

// 普通类
class Student1(var name: String , var age: Int, var sex: Char) {
    // 注意事项：component0是不行的  顺序必须是 component1 component2 component3 和成员一一对应，顺序下来的
    operator fun component1() = name
    operator fun component2() = age
    operator fun component3() = sex
}

// 数据类
data class StudentData(var name: String , var age: Int, var sex: Char)
// set get 构造函数 copy克隆 解构操作 toString hashCode equals   结论：数据类 生成 更加丰富

// TODO 92.Kotlin的解构声明
fun main() {
    /*val list: List<Int> = listOf(100, 200, 300)
    val (v1, v2, v3) = list // 这个时候 我们之前 List集合的 解构操作
    println("List集合的 解构操作 v1:$v1,v2:$v2,v3:$v3")*/

    val(name, age, sex)  = Student1("李四", 89, '男')
    println("普通类 解构后:name:$name, age:$age, sex:$sex")

    val(name1, age1, sex1)  = StudentData("李四", 89, '男')
    println("数据类 解构后:name:$name1, age:$age1, sex:$sex1")

    // 补充
    // _ 拒收，可以节约性能
    val(_, age2, _) = Student1("李四", 89, '男')
    println("数据类 结构后: age2:$age2")
}