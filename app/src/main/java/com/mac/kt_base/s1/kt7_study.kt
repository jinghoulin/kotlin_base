package com.mac.kt_base.s1

// TODO Kotlin内置数据类型和声明变量
fun main() {
    println("Derry")

    // TODO ================================= 声明变量
    /*
        可读可改     变量名            类型                  值
        var         name     :      String      =       "Derry"
     */
    var name : String = "Derry"
    name = "DerryXXX"
    println(name)

    /*
        只读          变量名            类型                  值
        val          name2     :      String      =       "Derry2"
     */
    val name2 : String = "Derry2"
    // name2 = "XXX"
    println(name2)


    // TODO ================================= 内置数据类型
    /*
        String.kt      字符串
        Char.kt        单字符
        Boolean.kt     true、false
        Int         整数
        Double      小数
        List        元素集合
        Set         无重复的元素集合
        Map         键值对的集合

        Int.kt   ---> java int
        Float    ---> java float

        Java:  double      Double
        KT :   Double.kt ---->  java double
     */
}