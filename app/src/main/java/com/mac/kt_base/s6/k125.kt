package com.mac.kt_base.s6

// TODO 125-Kotlin的过滤函数-filter
// 原理：filter {true,false}  true他会加入到新的集合 进行组装新集合 返回，  否则false，过滤掉，不加入，返回空集合
fun main() {
    val names = listOf("黄晓明", "李连杰", "李小龙", "刘军", "李元霸", "刘明", "刘俊", "黄家驹", "黄飞鸿")

    val newNames : List<String> = names.filter {
        // it == 每一个元素 String == 黄晓明  李连杰
        false
        true
    }
    println(newNames) // newNames 新集合 把过滤后的元素 加入新集合，  if(true) 新集合.add(it)  return 新集合

    println()

    val newNames2 : List<String> = names.filter {
        // it == 每一个元素 String == 黄晓明  李连杰
        it.contains('刘')
    }
    println(newNames2) // newNames2 新集合 把过滤后的元素 加入新集合，  if(true) 新集合.add(it)  return 新集合

    println()

    names.filter {
        // it == 每一个元素 String == 黄晓明  李连杰
        it.contains('黄')
    }.map {
        print("$it  ")
    }
}