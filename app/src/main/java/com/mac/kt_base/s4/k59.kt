package com.mac.kt_base.s4

// TODO 59.Kotlin语言的List集合遍历学习
fun main() {
    val mList: List<Int> = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    println(mList) // 输出list详情而已，这个不是遍历集合

    // 第一种 遍历方式：
    for (item: Int in mList) {
        print("item:$item  ")
    }

    println()

    // 第二种 遍历方式：
    mList.forEach {
        // it == 每一个元素  1   2   3   4   5   6
        print("item:$it  ")
    }

    println()

    // 第三种 遍历方式：
    mList.forEachIndexed { index, item ->
        print("下标:$index, 元素:$item    ")
    }
}