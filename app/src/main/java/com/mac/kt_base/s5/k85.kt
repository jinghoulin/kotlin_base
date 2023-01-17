package com.mac.kt_base.s5

// 在KT中，   所有的类，都隐士继承了 : Any() ,      你不写，默认就有
// 在Java中，所有的类，都隐士继承了 extends Object ,你不写，默认就有
// Any类在KT设计中：只提供标准，你看不到实现，实现在各个平台处理好了
class Obj1 : Any()
class Obj2 : Any()
class Obj3 : Any()
class Obj4 : Any()
class Obj5 : Any()
class Obj6 : Any()
// ....

// TODO 85.Kotlin的Any超类
// Any == Java Object
// Any? == Java Object 这个是最准确的
fun main() {
    println(Obj1().toString())
}