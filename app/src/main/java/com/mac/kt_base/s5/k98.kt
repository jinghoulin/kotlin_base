package com.mac.kt_base.s5

data class LoginRequestBean(var info: String) // 请求

data class LoginResponseBean(val data: String, val code: Int) // 响应

 data class LoginData(val data: String)

// TODO 98-数据类使用条件
// 条件一：服务器请求回来的响应的 JavaBean  LoginResponseBean 基本上可以使用 数据类
// 条件二：数据类至少必须有一个参数的主构造函数
// 条件三：数据类必须有参数， var val 的参数
// 条件四：数据类不能使用 abstract，open，sealed，inner 等等 修饰 （数据类，数据载入的事情 数据存储的事情）
// 条件五：需求 比较，copy，toString，解构，等等 这些丰富的功能时，也可以使用数据类

fun main() {}