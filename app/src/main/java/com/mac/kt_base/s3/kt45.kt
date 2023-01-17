package com.mac.kt_base.s3

// TODO 45.Kotlin语言的==与===比较操作
fun main() {
    // TODO ==  值 内容的比较   相当于Java的equals  OK
    val n1 : String = "Derry"
    val n2 : String = "Derry"
    val n3 : String = "A"

    // 小结：n1.equals(n2)  等价于  n1 == n2  都是属于 值内容的比较
    println(n1.equals(n2)) // Java的写法风格
    println(n1 == n2) // Kt的写法风格

    // TODO === 引用的比较
    println(n1 === n2) // true:字符串常量池 n1 n2 指向同一个
    println(n1 === n3) // n1与n2指向的区域不同，所以引用不同，所以是 false

    // 引用的比较 ，难度高一点点
    val n4 : String = "derry".capitalize() // 修改成 Derry
    println(n4 === n1)
    // "derry".capitalize() 把 d 修改成 大写的D，并不是复用了    n1/n2的 字符串常量池里面的 “Derry”
    // 所以是false
}