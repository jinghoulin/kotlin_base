package com.mac.kt_base.s3

// TODO 37.Kotlin语言中的非空断言操作符特点
fun main() {
   var name: String? = null

   var r = name ?.capitalize() // name是可空类型的，可能是null，想要使用name，必须给出 补救措施1 ?
   println("r1 :$r")

   name = "Derry" // 绝对有值的，你就可以负责的使用 !! 补救措施2

   // 这个断言 和 Java非常相似,   补救措施2
   r = name !!.capitalize() // !!断言 不管name是不是null，都执行.capitalize()，所以就空指针异常了
   println("r2 :$r")

   // 结论：规矩：如果百分百能够保证name是有值的，才能使用!!(否则有Java 空指针异常的风险),
   // 否则，进来使用 ?
}