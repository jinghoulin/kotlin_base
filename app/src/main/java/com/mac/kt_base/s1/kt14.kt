package com.mac.kt_base.s1

// TODO Kotlin的when表达式讲解
fun main() {
    val week = 100

    // Java if 语句    执行语句代码
    // KT   if 是"表达式" 能够有返回值的
    // 表达式 比 语句 拥有语句所有共 并且 比语句 更强大

    // (Any? Any) == java Object
    // Windows: Ctrl +    S + P
    // Mac : Control +    S + P
    val resultInfo = when(week) {
        1 -> "今天是星期一，非常忙碌的一天开会，听老板画大饼，吹牛逼"
        2 -> "今天是星期二，非常辛苦的写需求，被 UI设计 和 测试 折磨的死去活来"
        3 -> "今天是星期三，努力写Bug中，写的Bug越来越多，测试 越来越开心"
        4 -> "今天是星期四，发布版本到凌晨，头发又少了一大半"
        5 -> "今天是星期五，淡定喝茶，一个Bug改一天，还很自豪"
        6 -> "今天是星期六，稍微加加班，稍微学习下技术" // String
        7 -> "今天是星期七，看剧中，游玩中，思考人生"
        8 -> 800 // Int
        9 -> 900.88f // Float
        10 -> null // null
        // else-> "养猪去了，种田去了，忽略星期几"
        else -> {
            println("养猪去了，种田去了，忽略星期几") // println 返回类型 Unit
        }
    }
    println(resultInfo)
}