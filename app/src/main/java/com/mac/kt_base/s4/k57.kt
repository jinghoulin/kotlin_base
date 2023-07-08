package com.mac.kt_base.s4

// TODO 57.Kotlin语言的可变List集合学习
// 可变的集合
// 不可变集合 to 可变集合
// 可变集合 to 不可变集合
fun main() {
    // TODO 可变集合
    val list: MutableList<String> = mutableListOf("Derry", "Zhangsna", "Wangwu")
    // 可变的集合，可以完成 可变的操作(增加，删除 操作等)
    list.add("赵六")
    list.remove("Wangwu")
    println(list)

    // TODO 不可变集合
    val list2: List<Int> = listOf(123, 456, 789)
    // 不可以的集合，无法完成 可变的操作(增加，删除 操作等)
    // list2.add
    // list2.remove
    println(list2)

    // TODO 不可变集合 to 可变集合
    val list3: MutableList<Int> = list2.toMutableList()
    // 可变的集合，可以完成 可变的操作(增加，删除 操作等)
    list3.add(111)
    list3.remove(123)
    println(list3)

    // TODO 可变集合 to 不可变集合
    val list4: MutableList<Char> = mutableListOf('A', 'B', 'C')
    // 可变的集合，可以完成 可变的操作(增加，删除 操作等)
    list4.add('Z')
    list4.remove('A')
    println(list4)

    val list5: List<Char> = list4.toList()
    // 不可以的集合，无法完成 可变的操作(增加，删除 操作等)
    /*list5.add
    list5.remove*/

    // 小结：KT语言中，分为 可变集合  与  不可变集合
    // Kotlin更加推荐你用   不可变集合（只读的），val（只读的）  这样数据更安全 只读的
    // 除非万不得已，要修改，才使用 可变集合 或 var
}