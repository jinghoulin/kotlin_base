package com.mac.kt_base.s6

// TODO 115-Kotlin的标准函数与泛型扩展函数

// private 私有化
// inline  我们的函数是高阶函数，所以用到内联，做lambda的优化，性能提高
// fun<I, O> 在函数中，申明两个泛型，函数泛型  I输入Input， O输出Output
// I.mLet 对I输入Input进行函数扩展，扩展函数的名称是 mLet，意味着，所有的类型，万能类型，都可以用 xxx.mLet   null.mLet
// lambda : (I) -> O   (I输入参数)   ->   O输出(最后一行返回的值 就给了 O)
//  : O  会根据用户的返回类型，变化而变化  O输出(最后一行返回的值 就给了 O)
// lambda(this) I进行函数扩展，在整个扩展函数里面，this == I本身   this == 调用者本身（I本身）(null)("Derry")(123)
private inline fun<I, O> I.mLet(lambda: (I) -> O) : O = lambda(this)

fun main() {
    null.mLet {
        // it == 调用者本身（null）
        println("null 这里面的it是 $it")
    }

    val r: Boolean = "Derry".mLet {
        // it == 调用者本身（"Derry"）
        // it

        646
        'C'
        5345.5
        "S"
        true
    }
    println("我们自己写的 mLet r:$r")

    val r2: String = 123.mLet {
        // it == 调用者本身（123）
        it

        "XXX"
    }
    println("我们自己写的 mLet r2:$r2")

    // 万能类型，任何类型，所有类型，都可以使用我的 mLet
    // 省略几万种类型 ...

    val r3: Int = "Derry2".let {
        true
        "XXX"
        3245435
    }
    println("官方的 mLet r3:$r3")
}

