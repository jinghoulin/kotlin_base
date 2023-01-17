package com.mac.kt_base.s6

// 1.类 isMap map takeIf  map是什么类型
class K104<T> (val isMap: Boolean, val inputType: T) {
    // false：返回 null
    // true：返回调用者本身 R
    inline fun <R> map(mapAction: (T) -> R) : R ? = mapAction(inputType).takeIf { isMap }
}

// 5.手写简化版本的 RxJava map变换函数
inline fun<I, O> map(inputType: I, isMap: Boolean = true, mapActionLambda: (I) -> O) : O ? =
    if (isMap) mapActionLambda(inputType) else null

// TODO 104-Kotlin的泛型变换实战
// 1.类 isMap map takeIf  map是什么类型
// 2.map int -> str 最终接收是什么类型
// 3.map per -> stu 最终接收是什么类型
// 4.验证是否是此类型 与 null
// 5.手写简化版本的 RxJava map变换函数
fun main() {
    val p1 : K104<Int> = K104(isMap = true, inputType = 64564)

    // 2.map Int -> String 最终接收是什么类型? String ?
    // Int ---> String
    val r: String ? = p1.map {
        // int == T map的输入
        it.toString()
        "[我的it是:$it]" // String -- R  map输出
    }
    println("map变换后的是:$r")

    println()

    // 3.map Persons -> Student 最终接收是什么类型? Students ?
    // Persons --- Students
    val p2 : K104<Persons> = K104(isMap = false, inputType = Persons("李四", 99) )
    val r2: Students ? = p2.map {
        // it == Persons == T map的输入

        Students(it.name, it.age) // Students -- R  map输出
    }
    println("map变换后的是:$r2")

    println()

    // 4.验证是否是此类型 与 null，   String 与 String? 是两个不同的类型，不是同一个类型（补充点）
    val str1: String = "OK1"
    val str2: String? = null
    println(str2 is String)
    println(str2 is String?)
    println(str2 ?: "你是null")

    println()

    // Int ---> String
    // 5.手写简化版本的 RxJava map变换函数
    val r3: String ? = map(123) {
        // it == 123 Int  I map的输入
        "【map包裹的String $it】" // String -- O  map输出  // lambda表达式最后一行，就是返回值
    }
    println("map函数变换后的是:$r3")

    // Double ---> Int
    var r4 : Int ? = map(4645.5) {
        // it == 4645.5 Double  I map的输入
        it.toInt() // Int -- O  map输出  // lambda表达式最后一行，就是返回值
    }
    println("map函数变换后的是:$r4")
    println(r4 is Int?)
}

data class Persons(val name: String, val age: Int)
data class Students(val name: String, val age: Int)