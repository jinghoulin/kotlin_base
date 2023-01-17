package com.mac.kt_base.s4

class Person (name: String) // 唯一的主构造
{
    // 如果想完成多个构造函数重载的话，就不行 用 次构造 才能做到

    // 2个参数的次构造函数，必须要调用主构造函数，否则不通过， 为什么次构造必须调用主构造？答：主构造统一管理 为了更好的初始化设计
    constructor(name: String, sex: Char) : this(name) {
        println("2个参数的次构造函数 name:$name, sex:$sex")
    }

    // 3个参数的次构造函数，必须要调用主构造函数，否则不通过
    constructor(name: String, sex: Char, age: Int) : this(name) {
        println("3个参数的次构造函数 name:$name, sex:$sex, age:$age")
    }

    // 4个参数的次构造函数，必须要调用主构造函数，否则不通过
    constructor(name: String, sex: Char, age: Int, info: String) : this(name) {
        println("4个参数的次构造函数 name:$name, sex:$sex, age:$age, info:$info")
    }
}

// TODO 73.Kotlin语言的次构造函数学习
fun main() {
    // 调用的时候，有一个原则，优先寻找主构造，如果主构造没有，才会寻找次构造
    // 调用的顺序，例如：调用四个参数的次构造，在调用次构造的时候，先调用主构造，只有主构造调用完成后，再打印次构造里面的代码

    val p = Person("李小龙") // 主构造

    Person("张三", '男') // 调用 2个参数的次构造函数

    Person("张三", '男', 99) // 调用 3个参数的次构造函数

    Person("张三", '男', 99, "KT Study") // 调用 4个参数的次构造函数
}