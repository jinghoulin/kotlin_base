package com.mac.kt_base.s3

// TODO 54.Kotlin语言的takeIf内置函数
fun main() {
    val result: String? = checkPermissionAction("Root", "@@@")
    if (result != null) {
        println("欢迎${result}超级用户，登录权限系统")
    } else {
        println("权限不够，被拒绝访问")
    }

    // 小结：
    // name.takeIf { true/false }
    // true: 直接返回name本身 有值
    // false: 直接返回null

    println()

    // TODO 企业中，真正的用法 （takeIf + 空合并操作符）
    println(checkPermissionAction2("Root444", "@@@"))

    // 总结：一般大部分情况下，都是 takeIf + 空合并操作符 来 一起使用， 功能直接完美实现
}

// 前端
// : String ?  两种情况  true 有值 返回name     false 返回 null
public fun checkPermissionAction(name: String, pwd: String): String? {
    // 假设这里做了很多的工作
    // ....
    return name.takeIf { permissionSystemServer(name, pwd) }
    // name.takeIf { true/false }  true:返回name本身，  false:返回null
}

// 企业中，真正的用法（takeIf + 空合并操作符）
public fun checkPermissionAction2(name: String, pwd: String): String {
    // 假设这里做了很多的工作
    // ....
    return name.takeIf { permissionSystemServer(name, pwd) } ?: "权限不够，被拒绝访问"
}

// 后端 权限系统环节
private fun permissionSystemServer(username: String, userpwd: String): Boolean {
    return if (username == "Root" && userpwd == "@@@") true else false
}