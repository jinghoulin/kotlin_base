package com.mac.kt_base.s2

import kotlin.math.log

// TODO 31.Kotlin的函数引用讲解
fun main() {

    // 方式一：这种方式属于，把匿名函数 给了  responseResult变量Lambda的声明
    login("Derry2", "123456") { msg, code ->
        println("用户 1 最终登录的成果如下: msg:$msg, code:$code")
    }

    println()

    // 方式二：
    // responseResult 声明处这里 Lambda属于函数类型的对象，
    // 需要把 responseResult_FunImpl 实实在在的函数 通过"函数引用" :: 来变成 函数类型的对象
    // :: 把普通函数 变成  函数类型的对象
    login("Derry", "123456", ::responseResult_FunImpl)

    println()

    val funTypeObject1 = :: responseResult_FunImpl
    val funTypeObject2 = funTypeObject1
    val funTypeObject3 = funTypeObject2
    login("XXX", "3333", funTypeObject3)
}

// KT实实在在的函数本身
fun responseResult_FunImpl(msg: String, code: Int) : Unit {
    println("用户 2 最终登录的成果如下: msg:$msg, code:$code")
}

// 模拟：数据库SQLServer
const val USER_NAME_SAVE_DB4 = "Derry"
const val USER_PWD_SAVE_DB4 = "123456"

/**
 * responseResult Lambda函数声明，他需要 函数类型的对象
 */
inline fun login(name: String, pwd: String, responseResult: (String, Int) -> Unit) {
    if (USER_NAME_SAVE_DB4 == name && USER_PWD_SAVE_DB4 == pwd) {
        // 登录成功
        // 做很多的事情 校验成功信息等
        // ...
        responseResult("login success data{有JSON数据}", 200)
    } else {
        // 登录失败
        // 做很多的事情 登录失败的逻辑处理 上传日志 ...
        // ...
        responseResult("login error data{}", 444)
    }
}
