package com.mac.kt_base.s2

// TODO 29.Kotlin的简略写法讲解
fun main() {
    // 第一种方式：
    loginAPI2("Derry3", "123456", responseResult = { msg, code ->
        println("用户 最终登录的成果如下: msg:$msg, code:$code")
    })

    // 第二种方式：
    loginAPI2("Derry3", "123456", { msg, code ->
        println("用户 最终登录的成果如下: msg:$msg, code:$code")
    })

    // 第三种方式：
    // 用户
    loginAPI2("Derry3", "123456") { msg, code ->
        println("用户 最终登录的成果如下: msg:$msg, code:$code")
    }

    // 真正的发展历史过程 四个版本的发展过程
    // 1 具名参数
    loginAPI3(responseResult = { msg, code ->
        println("用户 最终登录的成果如下: msg:$msg, code:$code")
    })

    // 2 省略具名参数
    loginAPI3({ msg, code ->
        println("用户 最终登录的成果如下: msg:$msg, code:$code")
    })

    // 3 lambda作为最后一个参数时，可以移到()外
    loginAPI3() { msg, code ->
        println("用户 最终登录的成果如下: msg:$msg, code:$code")
    }

    // 4 最终的版本 lambda作为唯一参数时，可以省略()
    loginAPI3 { msg, code ->
        println("用户 最终登录的成果如下: msg:$msg, code:$code")
    }

}

fun loginAPI3(responseResult: (String, Int) -> Unit) {}


// 模拟：数据库SQLServer
const val USER_NAME_SAVE_DB2 = "Derry"
const val USER_PWD_SAVE_DB2 = "123456"

// 模拟：登录API 前端
public fun loginAPI2(username: String, userpwd: String, responseResult: (String, Int) -> Unit) {
    // KT === 引用的比较    Java ==
    // KT == 值的比较      Java equals
    if (username == null || userpwd == null) {
        TODO("用户名或密码是null") // 出现问题，终止程序
    }

    // 很多很多的校验 前段的校验
    if (username.length > 3 && userpwd.length > 3) {
        if (webServiceLoginAPI2(username, userpwd)) {
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
private fun webServiceLoginAPI2(username: String, userpwd: String): Boolean {

    // kt的if是表达式（非常灵活的）     java的if语句（有局限性）

    // 做了很多的事情 登录逻辑的处理
    // ....

    return if (username == USER_NAME_SAVE_DB && userpwd == USER_PWD_SAVE_DB) true else false
}
