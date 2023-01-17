package com.mac.kt_base.s6

import com.mac.kt_base.s6.com.derry.randomItemValue as g // as g 重命名扩展操作
import com.mac.kt_base.s6.com.derry.randomItemValuePrint as p // as p 重命名扩展操作
import com.mac.kt_base.s6.com.derry.MyIsRandomCreateObjectItemValueToYou as randomObj

// TODO 120-Kotlin的重命名扩展讲解
fun main() {
    val list : List<String> = listOf("李元霸", "李连杰", "李小龙")
    val set : Set<Double> = setOf(545.5, 434.5, 656.6)

    // 第二种方式：使用 扩展文件
    println(list.g())
    println(set.g())

    println()

    list.p()
    set.p()

    println()

    println(list.randomObj())
}