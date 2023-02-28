package com.mac.kt_base.s3

// TODO 38.Kotlin语法中对比使用if判断null值情况
fun main() {
    // ?(补救措施1)，    !!(补救措施2)        if判空(补救措施3)

    var name : String ? = null

    // name.capitalize() // name是可空类型的，可能是null，想要使用name，必须给出 补救措施

    // if(补救措施3)
    if (name != null) { // if也算是补救措施，和 Java一样，只是 官方文档没有看到这种说明而已
        var r = name.capitalize()
        println(r)
    } else {
        println("name is null")
    }

}