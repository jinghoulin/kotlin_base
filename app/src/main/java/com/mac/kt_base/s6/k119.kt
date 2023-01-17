package com.mac.kt_base.s6

// 导入扩展文件
// 在工作中非常有用，可以把很多的扩展操作，写到某一个地方，到时候引入过来用，比较独立化
import com.mac.kt_base.s6.com.derry.randomItemValue
import com.mac.kt_base.s6.com.derry.randomItemValuePrint

// TODO 119-Kotlin的定义扩展文件
fun main() {
    val list : List<String> = listOf("李元霸", "李连杰", "李小龙")
    val set : Set<Double> = setOf(545.5, 434.5, 656.6)

    // 第一种方式：如果不使用 扩展文件
    println(list.shuffled().first()) // 此功能是我们自己写的
    println(set.shuffled().first()) // 此功能是我们自己写的

    println()

    // 第二种方式：使用 扩展文件
    println(list.randomItemValue())
    println(set.randomItemValue())

    println()

    list.randomItemValuePrint()
    set.randomItemValuePrint()
}