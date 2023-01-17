package com.mac.kt_base.s2

// TODO 30.Kotlin的函数内联讲解
fun main() {

    // 用户 - main函数调用处
    loginAPI3("Derry3", "123456") { msg, code ->
        println("用户 最终登录的成果如下: msg:$msg, code:$code")
    }
}

// 模拟：数据库SQLServer
const val USER_NAME_SAVE_DB3 = "Derry"
const val USER_PWD_SAVE_DB3 = "123456"

// 此函数有使用lambda作为参数，所以就就需要声明内联
// TODO 如果此函数没有内联，在调用端，会生成多个对象来完成Lambda的调用（会造成性能的损耗）
// TODO 如果此函数使用内联，在调用端，C++ #define 定义宏 宏替换，会把代码替换到调用处，好处（没有任何函数开辟，对象开辟 等 的损耗）
// TODO 小结：如果函数参数有Lambda，尽量使用inline关键字修饰，这样内部会做优化，减少，函数开辟，对象开辟 等损耗

// 模拟：登录API 前端
public inline fun loginAPI3(username: String, userpwd : String, responseResult: (String, Int) -> Unit) {
    // KT === 引用的比较    Java ==
    // KT == 值的比较      Java equals
    if (username == null || userpwd == null) {
        TODO("用户名或密码是null") // 出现问题，终止程序
    }

    // 很多很多的校验 前段的校验
    if (username.length > 3 && userpwd.length > 3) {
        if (webServiceLoginAPI3(username, userpwd)) {
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
    } else {
        TODO("用户名或密码 不合格 长度 不大于3") // 出现问题，终止程序
    }
}

// 模拟：后端
// 登录的API的暴露者 服务器
fun webServiceLoginAPI3(username: String, userpwd : String) : Boolean {

    // kt的if是表达式（非常灵活的）     java的if语句（有局限性）

    // 做了很多的事情 登录逻辑的处理
    // ....

    return if (username == USER_NAME_SAVE_DB && userpwd == USER_PWD_SAVE_DB) true else false
}
