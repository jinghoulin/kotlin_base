package com.mac.kt_base.s2

// TODO 17.Kotlin的默认参数
fun main() {
    action01("zhangsan", 89)
    action02("wangwu")
    action03()

    // java的解决是： 是用 建造者设计模式 你自己去builder 我不管了
    // KT中解决可以用：默认参数 也可以 建造者设计模式
    createAction()
}

private fun action01(name: String, age: Int) {
    println("name:$name, age:$age")
}

private fun action02(name: String, age: Int = 88) {
    println("name:$name, age:$age")
}

private fun action03(name: String = "李元霸", age: Int = 66) {
    println("name:$name, age:$age")
}

// 模拟Java痛点
fun createAction(
    i1: Int = 1,
    i2: Int = 2,
    i3: Int = 3,
    i4: Int = 4,
    i5: Int = 5,
    i6: Int = 6,
    i7: Int = 7,
    i8: Int = 8,
    i9: Int = 9,
    i10: Int = 10,
    i11: Int = 11,
    i12: Int = 12,
    i13: Int = 13,
    i14: Int = 14,
    i15: Int = 15,
    i16: Int = 16
) {

}
