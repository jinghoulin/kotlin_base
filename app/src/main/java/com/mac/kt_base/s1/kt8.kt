package com.mac.kt_base.s1

// TODO Kotlin的只读变量
fun main() {
    // var 默认提示：变量永远不会被修改，建议修改成val == 不可改变的（只读）
    val infoValue : String = "DerryOK"
    // infoValue = "Derry2" // val 定义的 不能修改
    println(infoValue) // 读取

    /*
      只读     变量名   类型     值
      val     age     : Int = 99
     */
    val age: Int = 89
    // age = 99 // val 定义的 不能修改
    println(age)

    // 原则：在开发过程中，尽量使用 val，除非是要修改，才变成var
}