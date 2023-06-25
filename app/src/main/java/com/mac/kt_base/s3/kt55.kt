package com.mac.kt_base.s3

// TODO 55.Kotlin语言的takeUnless内置函数
// takeIf 和 takeUnless （true/false功能是相反的），其他的特点全部一样
// name.takeIf { true/false }  true:返回name本身，false返回null
// name.takeUnless { true/false }  false:返回name本身，true返回null

// 为什么有 takeUnless 的出现，一个 takeIf 不就够了吗？

class Manager {

    private var infoValue: String? = null

    fun getInfoValue(): String? = infoValue

    fun setInfoValue(infoValue: String) {
        this.infoValue = infoValue
    }
}

fun main() {
    val manager: Manager = Manager()

    // 补充点
    /*"Derry1".takeIf { *//*it == "Derry1"*//* }
    "Derry2".takeUnless { *//*it == "Derry2"*//* }*/

    // manager.setInfoValue("DerryOK is SuccessFul")

    // it == null || it == ""  { true }
    val result = manager.getInfoValue().takeUnless { it.isNullOrBlank() } ?: "未经过任何初始化的值"
    // manager.getInfoValue().takeUnless { true/false }  false:返回getInfoValue值本身， true返回null
    println("result:$result")

    println()

    val result2 = manager.getInfoValue().takeIf { !it.isNullOrBlank() } ?: "未经过任何初始化的值"
    println("result2:$result2")
}