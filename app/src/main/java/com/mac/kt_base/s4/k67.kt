package com.mac.kt_base.s4

import android.os.Build
import androidx.annotation.RequiresApi

// TODO 67.Kotlin语言的遍历Map学习
// 四种方式遍历
@RequiresApi(Build.VERSION_CODES.N)
fun main() {
    val map : Map<String, Int> = mapOf(Pair("Derry1", 123), Pair("Derry2", 456), Pair("Derry3", 789))

    // 第一种方式
    map.forEach {
        // it == 每一个元素（K 和 V）   每一个元素（K 和 V）   每一个元素（K 和 V）
        // it 类型 Map.Entry<String, Int>
        println("K:${it.key} V:${it.value}")
    }

    println()

    // 第二种方式：
    map.forEach { key: String, value:Int ->
        // 把默认的it给覆盖了
        println("key:$key, value:$value")
    }

    println()

    // 第三种方式：
    map.forEach { (key, value) ->
        // 把默认的it给覆盖了
        println("key:$key, value:$value")
    }

    println()

    // 第四种方式：
    for (item: Map.Entry<String, Int> in map) {
        // item == 每一个元素（K 和 V）   每一个元素（K 和 V）   每一个元素（K 和 V）
        // item 类型 Map.Entry<String, Int>
        println("K:${item.key} V:${item.value}")
    }

    // 小结： 第四种 第一种（推荐） 是一类的，
    //       第三种 和 第二种 是一类的
}