package com.mac.kt_base.s6

// fun String.outpuStringValueFun(defaultValue: String) = println(if (this == null) this else defaultValue)
// fun String.outpuStringValueFun(defaultValue: String) = println(this ?: defaultValue) // 此扩展函数 只能处理 非 可空类型的
fun String? . outpuStringValueFun(defaultValue: String) = println(this ?: defaultValue) // 此扩展函数 能处理非可空类型的 也能处理 可空类型的

// 编译器非常智能：能够监测到你做了if判断（能够对你代码逻辑监测），就知道后续类型
fun String? . outputStringValueFunGet(defaultValue: String) : String = if (this == null) defaultValue else this

// TODO 117-Kotlin的可空类型扩展函数
fun main() {
    var infoValue : String ? = null // infoValue是可空的类型  String  String?==可空类型的
    infoValue = "Derry"
    infoValue.outpuStringValueFun("我是默认值啊1")

    // String? 前面已经说过了，可以接收 可空数据  也可以接收 有值数据
    // String  前面已经说过了，只能接收 有值数据
    // String? = String  OK
    // String = String? 不允许的

    println()

    val name = "Derry老师啊"
    println(infoValue.outputStringValueFunGet("我是默认值啊3"))
    println(name.outputStringValueFunGet("我是默认值啊4"))
    println(null.outputStringValueFunGet("我是默认值啊5 null")) // String? . 函数outputStringValueFunGet

}