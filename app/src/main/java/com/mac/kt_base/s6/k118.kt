package com.mac.kt_base.s6

// 自定义的中缀表达式 + 扩展函数 一起用的      使用的时候： 1.go("一")  == 1 go "一"
// 1.条件一  对第一个参数 C1.go  函数扩展
// 2.条件二  需要在 括号(c2: C2) 参数里面，传递一个参数
private infix fun <C1, C2> C1.go(c2: C2) {
    // 做很多的逻辑
    // ...
    // 省略几万行代码
    print("我们的中缀表达式，对一个参数的内容是:$this")
    print("，对二个参数的内容是:$c2")
    println()
}

// TODO 118-Kotlin的infix关键字
// 小结：infix == 中缀表达式 可以简化我的代码   C++也有中缀表达式
fun main() {
    mapOf("零".to(0))
    mapOf("零" to 0) // 看起来 更加舒服

    println()

    123.go("Derry")
    123 go "Derry"
    "Derry" go 35345345.5
    true go "OK"
    // 省略几万行代码
    // ...
}