package com.mac.kt_base.s3

// TODO 51.Kotlin语言的run内置函数
fun main() {
    // 1.run函数的特点 字符串演示
    val str : String = "Derry is Successful"

    val r1 : Float = str.run {
        // this == str本身  调用者本身
        true
        535553.5
        'C'
        43443.4f
    }
    println(r1)

    // 2.具名函数判断长度 isLong

    // 这个是属于 匿名函数 配合 run
    str.run {
        // this == str本身 调用者本身
    }

    println("------------")

    // 下面是 具名函数 + run函数 的 配合
    // 这个就是 具名函数isLong
    str.run(::isLong) // this == str本身
        .run(::showText) // this == isLong函数的返回类型 Boolean 的值 本身
        .run(::mapText) // this == mapText函数的返回类型 String 的值 本身
        // 下面是 匿名函数 的 输出
        /*.run {  // this == mapText函数的返回类型 String 的值 本身
            println("run最后拼接的值是:$this")
        }*/
        // 下面是 具名函数 的 输出
        .run { "run最后拼接的值是:$this" }   // {}匿名的
        .run(::println) // 具名println
        // 调用的是println(this)，参数自动传入函数类型对象的函数中

    println()

    str.let(::isLong) // it == str本身
        .let(::showText) // it == isLong函数的返回类型 Boolean 的值 本身
        .let(::mapText) // it == mapText函数的返回类型 String 的值 本身
         // 下面是 匿名函数 的 输出
         /*.let { // it == mapText函数的返回类型 String 的值 本身
            println("let最后拼接的值是:$it")
        }*/
        // 下面是 具名函数 的 输出
        .let { "let最后拼接的值是:$it" }     // {}匿名的
        .let(::derryShowPrintln) // 具名println

    println()

    // >>>>>>>>>>>>>>>>>>>> 上面全部大部分都是 具名函数调用给run运行   下面全部都是 匿名函数调用给run运行
    str

        .run { // this == str本身
            if (length > 5) true else false
        }
        .run { // this == 上面的run返回类型 Boolean 的值 本身
            if (this) "你的字符串合格" else "你的字符串不合格"
        }
        .run { // this == 上面的run返回类型 String 的值 本身
            "【$this】"
        }
        .run {  // this == 上面的run返回类型 String 的值 本身
            println("run最后拼接的值是:$this")
        }
}

// 3.具名函数监测合格 showText
fun isLong(str: String) = if (str.length > 5) true else false

// 4.具名函数增加一个括号 mapText
fun showText(isLong: Boolean) = if (isLong) "你的字符串合格" else "你的字符串不合格"

// 5.具名函数输出内容
fun mapText(returnString: String) = "【$returnString】"

// 自己写一个 具名函数的 输出
fun derryShowPrintln(returnMapText: String) = println("let最后拼接的值是:$returnMapText")