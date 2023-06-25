package com.mac.kt_base.s3

// TODO 39.在Kotlin空合并操作符
fun main() {
    var info: String? = "李小龙"
    info = null
    info = "Derry"

    // 空合并操作符 xxx ?: "原来你是null啊"      （如果 xxx 等于null，就会执行 ?: 后面的代码区域）与?相反
    println(info ?: "原来你是null啊1")
    // 与 ?. 相反，?. 是前面为null则不执行后面，?: 是前面为null则执行后面

    // let函数 + 空合并操作符
    println(info?.let { "你info的内容是:${it}" } ?: "原来你是null啊2")
}