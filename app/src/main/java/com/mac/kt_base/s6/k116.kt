package com.mac.kt_base.s6

// TODO 116-Kotlin 内置函数全面复习 与
/*
fun main() {

    var r: String = "Derry".apply {
        this.length // 输入 String

        true
        34545
        432432.4
    }

    var r2 : String = "Derry".also {
        it.length // 输入 String

        true
        34545
        432432.4
    }

    val r3  = "Derry".run {
        this.length // this 输入 String 等同于 apply

        true
        88
        'A'
        true
        34545
        432432.4 // 输出 Double

    }

    val r4  = "Derry".let {
        it.length // it 输入 String 等同于 apply

        true
        88
        'A'
        true
        34545
        432432.4 // 输出 Double
    }

    // with 和 run 一模一样，只是调用的时候不同，     info.run     with(info)
    val r5 = with("Derry") {
        this.length // this 输入 String 等同于 apply

        true
        88
        'A'
        true
        34545
        432432.4 // 输出 Double
    }
}*/

// 你必须把前面的普通方式（普通属性）学会：
val myStr : String = "AAA"
/* 背后代码：
    public final class K116Kt {
       @NotNull
       private static final String myStr = "AAA";

       @NotNull
       public static final String getMyStr() {
            return myStr;
       }
    }
 */

// 扩展属性
val String.myInfo : String
    get() = "调用者你是:$this  Derry老师"
/* 背后代码：
    public final class K116Kt {

       @NotNull
       public static final String getMyInfo(@NotNull String $this$myInfo) {
            Intrinsics.checkParameterIsNotNull($this$myInfo, "$this$myInfo"); // 监测 ...
            return "Derry老师";
       }
    }
 */

// 打印输出 并且 链式调用 (只有String有资格这样)
fun String.showPrintln() : String {
    println("打印输出 并且 链式调用 (只有String有资格这样)：内容$this")
    return this
}

// 再次定义 扩展属性
val String.stringAllInfoValueVal
    get() = "当前${System.currentTimeMillis()}这个时间点被调用了一次，当前的值是:$this，当前字符串长度是:${this.length}"

// TODO 扩展属性
fun main() {
    val str : String = "ABC"
    println(str.myInfo)
    println("KKK".myInfo)
    println("AAA".myInfo)
    println("ZZZ".myInfo)

    println()

    println("李元霸".stringAllInfoValueVal) // 扩展属性

    println()

    "李元霸".stringAllInfoValueVal // 扩展属性
        .showPrintln().showPrintln().showPrintln().showPrintln().showPrintln().showPrintln()
}