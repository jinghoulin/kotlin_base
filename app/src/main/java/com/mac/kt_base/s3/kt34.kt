package com.mac.kt_base.s3

// TODO 34.Kotlin语言的可空性特点
fun main(args: Array<String>) {
    // TODO 第一种情况：默认是不可空类型，不能给null，否则编译不通过
    var name: String = "Derry"

    // name = null
    // 提示：Null can not be a value of a non-null type String
    //       name 不能是 空类型的String的值，说白了，就是不能是 null 的值 空的值

    println(name)
    println("name的长度:${name.length}")

    // TODO 第二种情况，声明时候 指定 为 可空类型
    var name2: String? = "DerryOK"
    name2 = "李元霸"
    name2 = null
    println(name2)
    println("name的长度:${name2?.length}") // ? 如果name2真的是null，就不执行 ?后面的区域.length}

}