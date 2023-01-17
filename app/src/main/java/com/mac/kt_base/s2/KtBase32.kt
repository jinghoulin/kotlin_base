package com.mac.kt_base.s2

// TODO 32.Kotlin的函数类型作为返回类型
// ()()()
fun main() {
    val r = show("DerryOK")
    // r的返回类型： Boolean
    println(r)

    val rFunObjectType /*: (String) -> Boolean*/ = ::show
    // rFunObjectType的 :: 函数类型对象 是什么 : (String) -> Boolean

    // TODO =======================================

    val result = showFun("DerryInfo...")
    // result的返回类型：(String, Int) -> String
    println(result("Derry", 38))

    val resultFunObjectType /*: (String) -> (String, Int) -> String*/ = ::showFun
    // 面试题 resultFunObjectType 的 :: 函数类型对象是什么类型? (String) -> (String, Int) -> String
}

// showFun函数  再返回一个 匿名函数
fun showFun(info: String)
        : (String, Int) -> String  // 函数的声明
{
    println("我是show函数 info:$info")

    // return 了 一个函数 匿名函数
    // 函数的实现
    return { name, age ->
        "最终登录的成果如下: name:$name, age:$age"
    }
}

fun show(info: String) : Boolean {
    println("我是show函数 info:$info")
    return true
}

fun show2(info: String) : String {
    println("我是show函数 info:$info")
    return "Derry"
}

fun show3(info: String) : Char {
    println("我是show函数 info:$info")
    return 'C'
}

