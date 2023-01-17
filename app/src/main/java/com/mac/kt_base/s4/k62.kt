package com.mac.kt_base.s4

// TODO 62.Kotlin语言的可变Set集合
fun main() {
    val set : MutableSet<String> = mutableSetOf("李元霸", "李连杰")
    set += "李俊"
    set += "李天"
    set -= "李连杰"
    set.add("刘军")
    set.remove("刘军")
    println(set)

    // 小结：如果需要对set集合， 添加，删除 等可变操作时，才用 MutableSet
    // 否则建议尽量使用 不可变的 Set<String> 只读的，    尽量val 只读的
}