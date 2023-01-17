package com.mac.kt_base.s1

// TODO 15.Kotlin语言的String模版
fun main() {
    val garden = "梅溪湖公园"
    val time = 6

    println("今天天气很晴朗，去玩" + garden + "，玩了" + time + "小时") // Java的写法
    println("今天天气很晴朗，去玩$garden，玩了${time}小时") // String模版的写法

    // KT是表达式 if 是表达式，所有可以这样写，能够返回 也能 写在 字符串摸版里面 非常灵活
    // Java if 不是表达式  if是语句，所有这个效果，Java有局限性
    val isLogin = false
    println("response result:${if (isLogin) "恭喜你，登录成功" else "不恭喜，你登录失败了，请检查信息"}")
}