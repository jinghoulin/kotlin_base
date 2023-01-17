package com.mac.kt_base.s3

// TODO 47.Kotlin语言中数字类型的安全转换函数
fun main() {
    val number: Int = "666".toInt()
    println(number)

    // 字符串里面放入 Double类型，无法转换成Int的，会奔溃
    // val number2: Int = "666.6".toInt()

    // 解决上面奔溃的问题
    // 如果转换成Int成功，就返回Int
    // 如果转换Int失败，就返回null   所以是 Int?（可以是 Int 也可以是 null ）
    val number2: Int? = "666.6".toIntOrNull()
    println(number2)

    val number3: Int? = "888.7".toIntOrNull()
    println(number3 ?: "转换失败，没有拿到成果") // 合并操作符

    // 小结：以后字符串转整形的操作的时候，尽量用toIntOrNull此函数来完成
}