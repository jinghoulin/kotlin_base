package com.mac.kt_base.s2

// TODO 27.Kotlin的Lambda表达式
fun main() {
    // 前面我们说他是匿名函数，是正确的， 但是随着 匿名函数里面的特性越来越多，其实特性是Lambda的
    // 所以就慢慢的转变成了 Lambda表达式
    // 匿名函数
    val fun1 = {
        "发生发顺丰"
        // Lambda的特性1
        // Lambda的特性2
        // Lambda的特性3
        // ...
    }

    // 匿名函数 等价于 我们后面要讲的 Lambda表达式

    val addResultFun /*: (Int, Int) -> String*/ = { number1: Int, number2: Int ->
        "两个数相加的结果是:${number1 + number2}"
    } // 面试你，addResultFun变量的类型是什么？ (Int, Int) -> String
    println(addResultFun(999, 999999))

    // java Object    kt Any?(null的值都可以)  Any(非null)
    val weekResultFun : (Int)-> Any? = { number: Int ->
        val r : Any? = when(number) {
            1 -> "星期1"
            2 -> "星期2"
            3 -> "星期3"
            4 -> "星期4"
            5 -> "星期5"
            6 -> null
            else -> -1
        }
        r
        // 面试你，weekResultFun变量的类型是? (Int)-> Any?
    }
    println(weekResultFun(100))

    // 小结：{} 确实是匿名函数， 只不过在这个{} Lambda表达式的特性越来越多，就改口叫 Lambda表达式了
    // Kotlin 匿名函数 == Lambda表示
}