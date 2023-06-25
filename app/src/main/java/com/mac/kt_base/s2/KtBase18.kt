package com.mac.kt_base.s2

// TODO 18.Kotlin的具名函数参数讲解
fun main() {
    // 具名函数参数 用法
    // 函数的参数顺序，是调用者 自定义 决定的
    loginAction(age = 99, userpwd = "123456", username = "Derry", phonenumber = "1788683434")

    // 具名函数参数+默认参数 用法
    createAction(i9 = 99, i14 = 888)

    // loginAction2("", "", "", 88, "", "")
    loginAction2(
        usernam = "",
        uesername = "",
        username = "",
        userpwd = "",
        age = 99,
        phonenumber = ""
    )
}

private fun loginAction(username: String, userpwd: String, phonenumber: String, age: Int) {
    println("uername:$username, userpwd:$userpwd, phonenumber:$phonenumber, age:$age")
}

private fun loginAction2(
    username: String,
    userpwd: String,
    phonenumber: String,
    age: Int,
    usernam: String,
    uesername: String
) {
    println("uername:$username, userpwd:$userpwd, phonenumber:$phonenumber, age:$age")
}