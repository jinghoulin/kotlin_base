package com.mac.kt_base.s4

// 主构造函数：规范来说，都是增加_xxx的方式，  临时的输入类型，不能直接用，需要接收下来 成为变量才能用
// _name 等等，都是临时的类型，不能直接使用， 如果要用 需要转化一下才能用 val name = _name
class Students(_name: String, _sex: Char, _age: Int, _info: String) // 主构造函数 ()
{

  var name : String = _name
      get() = field // get不允许私有化
      private set(value:String) {
        field = value
      }

  val sex: Char = _sex
    get() = field
    // set(value) {} 只读的，不能修改的，不能set函数定义

  val age: Int = _age
    get() = if (field < 0 || field > 200) -111 else field

  val info: String = _info
    get() = field.toLowerCase() // 输出：给外界小写

  fun show() {
    // println(_name) // 临时的输入类型，不能直接用，需要接收下来 成为变量才能用
    println(name)
    println(sex)
    println(age)
    println(info)
  }
}

// TODO 71.Kotlin语言的主构造函数学习
fun main() {
  val student = Students(_name = "Zhangsan", _info = "AAFDFDFSD", _age = 88, _sex = 'M')
  // student.name = "XXX" 被私有化了，不能调用

  student.show()
}