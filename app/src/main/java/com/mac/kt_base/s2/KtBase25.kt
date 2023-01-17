package com.mac.kt_base.s2

// TODO 25.Kotlin的it关键字用途讲解
fun main() {
    val methodAction : (Int, Int, Int) -> String = { n1, n2, n3 -> // 参数3  大于1，就不会有it
        val number = 5234535
        "$number n1:$n1,n2:$n2,n3:$n3"
    }
    println(methodAction(1, 2, 3))

    println()

    val methodAction3 : (String) -> String = { "$it Derry" }
    println(methodAction3("你好啊"))

    val methodAction4 : (Double) -> String = { "$it Derry" }
    println(methodAction4(234534.5))

    // 两个输入参数，it 自动失效
    val methodAction5 : (Double, String) -> String = { v1, v2 -> "$v1 Derry $v2" }
    println(methodAction5(234534.5, "DDD"))

}

// it 值针对一个参数，如果是两个参数，it就不会自动增加了

fun methodAction2(it: String) {

}