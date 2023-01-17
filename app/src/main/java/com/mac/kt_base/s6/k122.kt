package com.mac.kt_base.s6

import java.io.File

class Context {
    val info = "我就是Derry Teacher"
    val name = "Derry老师"
    fun toast(str: String) = println("toast:$str")
}

// 其实apply5函数，就是DSL编程范式，定义输入输出等规则：
// 1.定义整个lambda规则标准，输入 必须是Context这个类，才有资格调用apply5函数，匿名函数里面 持有this==Context调用者本身  持有 it==String
// 2.定义整个lambda规则标准，输出 我们会始终返回Context本身，所以你可以链式调用（永远是返回 调用者本身）
inline fun Context.apply5(lambda: Context.(String) -> Unit) : Context {
    // lambda(this, this.info)
    lambda(info) // this可以省略 this是隐式的
    return this
}

// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

// 其实applyFile函数，就是DSL编程范式，定义输入输出等规则：
// 1.定义整个lambda规则标准，输入 必须是File类，才有资格调用applyFile函数，匿名函数里面持有 fileName，data
// 2.定义整个lambda规则标准，输出 我们始终返回File对象本身，所以你可以链式调用（永远是返回 调用者本身）
inline fun File.applyFile(action: (String, String ?)-> Unit) : File {
    setWritable(true)
    setReadable(true)
    action(name, this.readLines()[0])
    return this
}

// TODO 122-Kotlin的DSL学习
// DSL简介 所谓DSL领域专用语言(Domain Specified Language/ DSL)     Gradle，JSON，XML 等，是非常成功成熟的 领域专用语言
fun main() {
    // 其实apply5函数，就是DSL编程范式，定义输入输出等规则：
    // 1.定义整个lambda规则标准，输入 必须是Context这个类，才有资格调用apply5函数，匿名函数里面 持有this==Context调用者本身  持有 it==String
    // 2.定义整个lambda规则标准，输出 我们会始终返回Context本身，所以你可以链式调用（永远是返回 调用者本身）
    // 然后main函数就可以根据DSL编程方式标准规则，来写具体的实现，这就是DSL编程范式
    val context : Context = Context().apply5 {
        // this == Context == Context() 调用者本身
        // it == String
        println("输入规则：我的it是:$it，我的this是:$this")
        toast(it) //  it == val info = "我就是Derry Teacher"
        this.toast(name) //  name == val name = "Derry老师"
        true
        34543
        'C'
    }.apply5 {  } .apply5 {  } .apply5 {  } // 省略...
    println()
    println("我始终是输出Context本身：" + context.info)

    // "Derry".apply5 {}
    // "Derry".applyFile

    println()

    // 其实applyFile函数，就是DSL编程范式，定义输入输出等规则：
    // 1.定义整个lambda规则标准，输入 必须是File类，才有资格调用applyFile函数，匿名函数里面持有 fileName，data
    // 2.定义整个lambda规则标准，输出 我们始终返回File对象本身，所以你可以链式调用（永远是返回 调用者本身）
    // 然后main函数就可以根据DSL编程方式标准规则，来写具体的实现，这就是DSL编程范式
    val file: File = File("D:\\Derry.txt").applyFile { fileName, data ->
        println("你的文件名是:$fileName, 你的文件里面的数据是:$data")
        true
        53454
        'C'
    }.applyFile{fileName, data ->} .applyFile { fileName, data ->  } // 省略...
    println("我始终是输出File本身：${file.name}")
}