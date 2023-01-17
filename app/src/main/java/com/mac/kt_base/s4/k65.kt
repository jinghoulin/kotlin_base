package com.mac.kt_base.s4

// TODO 65.Kotlin语言的Map的创建
fun main() {
    // 第一种方式
    val map1 : Map<String, Double> = mapOf<String, Double>("Derry1" to(545.5), "Derry2" to 353.4)

    // 第二种方式
    val map2 : Map<String, Double> = mapOf(Pair("Derry3", 6465.6), Pair("Derry4", 64432.4))

    // 结论：上面的两种方式 是等价的
}