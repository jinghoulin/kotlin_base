package com.mac.kt_base.s4

// TODO 63.Kotlin语言的集合转换与快捷函数学习
// 1.定义可变list集合
// 2.List 转 Set 去重
// 3.List 转 Set 转 List 也能去重
// 4.快捷函数去重 distinct
fun main() {
    // 1.定义可变list集合
    // list集合可以 有重复的元素
    val list: MutableList<String> = mutableListOf("Derry", "Derry", "Derry", "wangwu", "zhangsan", "lisi")
    println(list)

    // 2.List 转 Set 去重
    val set : Set<String> = list.toSet()
    println(set)

    // 3.List 转 Set 转 List 也能去重
    val list2: List<String> = list.toSet().toList()
    println(list2)

    // 4.快捷函数去重 distinct
    println(list.distinct()) // 内部做了：先转变成 可变的Set集合， 再转换成 List集合
    println(list.toMutableSet().toList()) // 和上面代码等价

    // 小结：一般在公司开发过程中，如果你是List集合，先快速去重，尽量直接 （快捷函数去重 distinct）
}