package com.mac.kt_base.s4

// 第一步：生成 val sex: Char
class K76(_name: String, val sex: Char) // 主构造
{
    // 其实 init代码块 与 类成员 是没有固定顺序，
    // 只不过，name 写在了 init代码块的前面，所有name是第二步
    // init代码块是 第三步

    // 第二步：生成 name
    val name : String = _name // 类的成员

    init {
        val nameValue = _name // 第三步：init代码块细节 nameValue 等等
        println("init代码块打印:nameValue:$nameValue")
    }

    // 次构造 三个参数的  必须调用主构造
    constructor(name: String, sex: Char, age: Int) : this(name, sex) {
        // 第五步：生成次构造的细节（最后一步 第五步）
        println("次构造 三个参数的, name:$name, sex:$sex, age:$age")
    }

    // 第四步：生成derry
    val derry = "DerryIsSuccessFul"  // 类的成员

    // 纠结网上优秀博客的错误： 类成员先初始化生成   在init代码块初始化生成  【错误的说法】
    // Derry正确的说法：init代码块 和 类成员 是同时生成的， 只不过你把name写在 init代码块的前面，所有才先生成你
    // val derry 类成员 写在 init代码块的后面，那就是 后生成了
}

// TODO 76.Kotlin语言的构造初始化顺序学习
// 1.main 调用次构造 name sex age
// 2.主构造的 val 变量
// 3.var mName = _name
// 4.init { nameValue 打印 }
fun main() {
    // 调用次构造
    K76("李元霸", '男', 88)  // 调用次构造
}