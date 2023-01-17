package com.mac.kt_base.s3

// TODO 36.在Kotlin中使用带let的安全调用
fun main() {
    var name : String ? = null
    name = ""
    name = null
    name = "Derry"

    // 如果name真的是null，就不执行 ?.let {} 这一大块区域的代码
    val r = name ?.let {
        // it == name本身，所以是String类型的

        // 如果name是空值 "" 没有内容
        if (it.isBlank())  "Default"  else  "[$it]"

        // 如果能够进入 let { 里面，这里面的代码，代表 it绝对是有值，值才能进来 }
    }
    println(r)
}