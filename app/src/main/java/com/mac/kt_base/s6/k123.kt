package com.mac.kt_base.s6

// TODO 123-Kotlin的变换函数-map
fun main() {
    val list : List<String> = listOf("李元霸", "李连杰", "李小龙")
    // T T T --->  新的集合(R R R)
    // 原理：就是把你 匿名函数，最后一行的返回值 加入到新的集合里面去，新的集合的泛型是R，然后在返回新的集合
    val list2: List<Int> = list.map {
        // it == T == 每一个元素 == String  李元霸  李连杰  李小龙 【输入的规则】

        "**【$it】**"

        88 //【最后一行的 输出的规则】
    }
    println(list2) // 打印的是，变换后的  新的集合(R R R)

    println()

    // 用途： 和 RxJava的思路，一模一样
    val list3: List<String> = list.map {
        // 做了很多公司项目的业务
        // ... 省略几千行代码
        "姓名是:$it" //【最后一行的 输出的规则】
    }.map {
        // 做了很多公司项目的业务
        // ... 省略几千行代码
        "$it，文字的长度是:${it.length}" //【最后一行的 输出的规则】
    }
    list3.forEach {
        print("$it  ")
    }

    println()

    list.map {
        // 做了很多公司项目的业务
        // ... 省略几千行代码
        "姓名是:$it" //【最后一行的 输出的规则】
    }.map {
        // 做了很多公司项目的业务
        // ... 省略几千行代码
        "$it，文字的长度是:${it.length}" //【最后一行的 输出的规则】
    }.map {
        print("$it  ")
    }
}