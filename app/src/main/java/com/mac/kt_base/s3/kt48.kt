package com.mac.kt_base.s3

import kotlin.math.roundToInt

// TODO 48.Kotlin语言中Double转Int与类型格式化
// 65.4645654 65.8343433
fun main() {
    println(65.4645654.toInt()) //  65 取低位的（没有四舍五入的效果）
    println(65.8343433.toInt()) // 65 取低位的（没有四舍五入的效果）

    println(65.4645654.roundToInt())  // 65四舍五入 （有四舍五入的效果）
    println(65.8343433.roundToInt()) // 66四舍五入 （有四舍五入的效果）

    // 结论：用 roundToInt函数，保证 Double -> 转换到 Int，保持有 四舍五入的效果

    // 了解的，工作中，看能用得上
    val r: String = "%.3f".format(65.8343433)
    println(r)


}