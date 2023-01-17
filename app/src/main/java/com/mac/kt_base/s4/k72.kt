package com.mac.kt_base.s4

/* 伪代码：

class Students2 (_name: String, _sex: Char, _age: Int, _info: String)
{
    var name = _name
    val sex = _sex
    val age = _age
    var info = _info

    fun show() {
        println(name)
        println(sex)
        println(age)
        println(info)
    }
}

 */

// var name : String 就相当于 var name = _name   只是 你看不到这个过程而已
// 一步到位，不像我们上一篇是分开写的
class Students2(var name: String, val sex: Char, val age: Int, var info: String) // 主构造函数 ()
{

  fun show() {
    println(name)
    println(sex)
    println(age)
    println(info)
  }
}

// TODO 72.Kotlin语言的主构造函数里定义属性
fun main() {
  val student = Students2(name = "Zhangsan", info = "AAFDFDFSD", age = 88, sex = 'M')
  student.show()
}