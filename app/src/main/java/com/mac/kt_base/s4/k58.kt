package com.mac.kt_base.s4

import android.os.Build
import androidx.annotation.RequiresApi

// TODO 58.Kotlin语言的mutator函数学习
@RequiresApi(Build.VERSION_CODES.N)
fun main() {
    // 1.mutator += -= 操作
    val list: MutableList<String> = mutableListOf("Derry", "DerryAll", "DerryStr", "Zhangsan")
    list += "李四" // mutator的特性 +=   -+ 其实背后就是 运算符重载
    list += "王五"
    list -= "Derry"
    println(list)

    println()

    // 2.removeIf
    // list.removeIf { true } // 如果是true，自动遍历整个可变集合，一个元素 一个元素 的 删除
    // println(list)
    list.removeIf { it.contains("Derr") } // 过滤所有的元素，只要是有 Derr 的元素，就是true 删除
    println(list)
}