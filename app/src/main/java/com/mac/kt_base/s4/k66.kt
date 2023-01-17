package com.mac.kt_base.s4

import android.os.Build
import androidx.annotation.RequiresApi

// TODO 66.Kotlin语言的读取Map的值
// 方式一 [] 找不到会返回null
// 方式二 getOrDefault
// 方式三 getOrElse
// 方式四 与Java一样 会奔溃
@RequiresApi(Build.VERSION_CODES.N)
fun main() {
    val map : Map<String, Int> = mapOf("Derry" to 123, "Kevin" to 654)

    // 方式一 [] 找不到会返回null
    println(map["Derry"]) // 背后对[] 运算符重载了
    println(map["Kevin"])
    println(map.get("Kevin")) // get 与 [] 完完全全等价的
    println(map["XXXXX"]) // map通过key找 如果找不到返回null，不会奔溃

    println()

    // 方式二 getOrDefault
    println(map.getOrDefault("Derry", -1))
    println(map.getOrDefault("Derry2", -1))

    // 方式三 getOrElse
    println(map.getOrElse("Derry") {-1})
    println(map.getOrElse("Derry2") {-1})

    println()

    // 方式四 getValue 与 Java一样 会奔溃  尽量不要使用此方式
    // 方式四 与Java一样 会奔溃
    println(map.getValue("Derry"))
    println(map.getValue("XXX"))

    // 小结：map获取内容，尽量使用  方式二  或者 方式三
}