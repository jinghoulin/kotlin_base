package com.mac.kt_base.s4

// TODO 61.Kotlin语言的Set创建与元素获取
// 1.set 定义 不允许重复
// 2.普通方式elementAt 会越界奔溃
// 3.elementAtOrElse elementAtOrNull
fun main() {
    val set: Set<String> = setOf("lisi", "wangwu", "zhaoliu", "zhaoliu") // set集合不会出现重复元素的
    println(set)

    println(set.elementAt(0)) // list[0]
    println(set.elementAt(1))
    println(set.elementAt(2))
    // println(set.elementAt(3)) // [3] 奔溃 会越界
    // println(set.elementAt(4)) // [4] 奔溃 会越界

    println()

    // 结论：使用 list 或 set 集合，尽量使用  此方式，防止找不断奔溃异常，尽量不要奔溃，而是我们自己可控
    println(set.elementAtOrElse(0) {"找不到此元素"})
    println(set.elementAtOrElse(100) {"找不到此元素"})

    println(set.elementAtOrNull(0))
    println(set.elementAtOrNull(111))
    // xxxOrNull + 空合并操作符 一起使用
    println(set.elementAtOrNull(68868) ?: "找不到此元素")
}