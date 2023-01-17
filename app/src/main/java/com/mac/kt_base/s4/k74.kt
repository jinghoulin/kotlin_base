package com.mac.kt_base.s4

class Person2 (name: String = "李小龙") // 唯一的主构造
{
    init {
        println("你调用了唯一主构造")
    }

    // 2个参数的次构造函数，必须要调用主构造函数，否则不通过
    constructor(name: String = "李连杰", sex: Char = 'M') : this(name) {
        println("2个参数的次构造函数 name:$name, sex:$sex")
    }

    // 3个参数的次构造函数，必须要调用主构造函数，否则不通过
    constructor(name: String = "李军军", sex: Char = 'M', age: Int = 99) : this(name) {
        println("3个参数的次构造函数 name:$name, sex:$sex, age:$age")
    }

    // 4个参数的次构造函数，必须要调用主构造函数，否则不通过
    constructor(name: String = "李丽丽", sex: Char = 'N', age: Int = 89, info: String = "Study KT") : this(name) {
        println("4个参数的次构造函数 name:$name, sex:$sex, age:$age, info:$info")
    }
}

// TODO 74.Kotlin语言的构造函数中默认参数学习
fun main() {

    // 主构造
    val p = Person2("李小龙") // 主构造

    println()

    // 主构造  次构造
    Person2("张三", '男') // 调用 2个参数的次构造函数

    println()

    // 主构造  次构造
    Person2("张三", '男', 99) // 调用 3个参数的次构造函数

    println()

    // 主构造  次构造
    Person2("张三", '男', 99, "KT Study") // 调用 4个参数的次构造函数

    println()

    // 调用的时候，有一个原则，优先寻找主构造，如果主构造没有，才会寻找次构造
    // 小结：主构造 与 次构造，全部都有默认参数时，优先还是主构造的调用
    // 主构造
    Person2()
}