package com.mac.kt_base.s3

// TODO 40.在Kotlin语法中异常处理与自定义异常特点
fun main() {
    try {
        var info: String? = null
        info = "Derry老师"

        checkException(info)

        println("长度是:${info!!.length}") // 同学们思考下：为什么我敢写断言，因为到 12行的时候，明确保证绝对有值

    } catch (e: Exception) {
        println("啊呀:$e")
    }
}

fun checkException(info: String?) {
    info ?: throw CustomException()
}

class CustomException : IllegalArgumentException("你的代码不太严谨哦")