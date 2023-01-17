package com.mac.kt_base.s4

import java.io.File

// TODO 64.Kotlin中的数组类型
/*
    Kotlin语言中的各种数组类型，虽然是引用类型，背后可以编译成Java基本数据类型
     数组的类型      数组的创建方式     【常规数组区域】
    IntArray        intArrayOf
    DoubleArray     doubleArrayOf
    LongArray       longArrayOf
    ShortArray      shortArrayOf
    ByteArray       byteArrayOf
    FloatArray      floatArrayOf
    BooleanArray    booleanArrayOf

    数组的类型               数组的创建方式     【对象数组区域】
    Array<Student>      arrayOf(Student实例)         对象数组
    Array<Person>       arrayOf(Person实例)          对象数组
    Array<File>         arrayOf(File实例)            对象数组
*/
// 1.intArrayOf 常规操作的越界奔溃
// 2.elementAtOrElse elementAtOrNull
// 3.List集合转 数组
// 4.arrayOf Array<File>
fun main() {
    // TODO 1.intArrayOf 常规操作的越界奔溃
    val intArray : IntArray = intArrayOf(100, 200, 300, 400, 500)
    println(intArray[0])
    println(intArray[1])
    println(intArray[2])
    println(intArray[3])
    println(intArray[4])
    // println(intArray[5]) // 奔溃：会越界异常

    println()

    // TODO 2.elementAtOrElse elementAtOrNull
    println(intArray.elementAtOrElse(0) { -1 })
    println(intArray.elementAtOrElse(100) { -1 })

    println(intArray.elementAtOrNull(0))
    println(intArray.elementAtOrNull(200))

    // xxxOrNull + 空合并操作符 配合一起来用
    println(intArray.elementAtOrNull(346456) ?: "你越界啦啦啦啦啦")

    println()

    // TODO 3.List集合 转 数组
    val charArray : CharArray = listOf<Char>('A', 'B', 'C', 'D').toCharArray()
    println(charArray)

    // TODO 4.arrayOf Array<File> 对象数组
    val objectArray : Array<File> = arrayOf<File>(
        File("1.txt"), File("2.txt"), File("3.txt"))

}