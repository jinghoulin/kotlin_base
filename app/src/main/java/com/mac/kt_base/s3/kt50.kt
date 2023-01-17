package com.mac.kt_base.s3

// TODO 50.Kotlin语言的let内置函数
// 普通方式 对集合第一个元素相加
// let方式 对集合第一个元素相加
// 普通方式 对值判null，并返回
// let方式 对值判null，并返回
fun main() {
    // TODO 普通方式 对集合第一个元素相加
    val list: List<Int> = listOf(5, 6, 7, 4, 2)
    val value1 = list.first()
    println(value1 + value1)

    println()

    // TODO let方式 对集合第一个元素相加
    val result : Int = listOf(5, 6, 7, 4, 2).let {
        // it == 集合本身
        // Lambda的最后一行，作为放回值，let内置函数的特点     但是我们前面学的apply永远都是返回调用者本身

        true
        53454.4f
        'n'

        it.first() + it.first()
    }
    println(result)

    println()

    // TODO 普通方式 对值判null，并返回
    println(get1(/*null*/ "Derry"))

    println()

    // TODO let方式 对值判null，并返回   let+空合并操作符 完成的效果
    println(get4(null /*"Derry2"*/))
}

// 普通方式 对值判null，并返回
fun get1(value: String?) : String {
    return if (value == null) "你传递是null" else "欢迎${value}回来"
}

// 普通方式 对值判null，并返回  简化版本
fun get2(value: String?) = if (value == null) "你传递是null" else "欢迎${value}回来"

// let方式 对值判null，并返回
fun get3(value: String?) : String {
    return value ?.let {
        "欢迎${value}回来"
    } ?: "你传递是null"
}

// let方式 对值判null，并返回 简化版本
fun get4(value: String?) =
     value ?.let {
        "欢迎${value}回来" // value不是null
    } ?: "你传递是null" // value是null

