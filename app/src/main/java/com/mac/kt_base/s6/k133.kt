package com.mac.kt_base.s6

class MyObject {
    companion object {
        @JvmField
        val TARGET = "梅溪湖公园"
        @JvmStatic
        fun showAction(name: String) = println("$name 要去 $TARGET 玩")
    }
}

// TODO 133-注解@JvmStatic与Kotlin关系
fun main() {
    // KT端
    println(MyObject.TARGET)
    MyObject.showAction("Derry")
}