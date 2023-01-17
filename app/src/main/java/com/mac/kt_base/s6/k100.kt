package com.mac.kt_base.s6

interface IUSB2 {
    // 接口的成员，是不可能有实现的（并不是这样，我们有特殊手段（val get函数    var get/set函数））
    val usbVersionInfo: String
        get() = (1..100).shuffled().last().toString() // 接口的默认实现
        // val 不需要set
}

// 鼠标UBS 的 实现类
class Mouse2 : IUSB2 {
    override val usbVersionInfo: String
        get() = super.usbVersionInfo
}

// TODO 100-Kotlin的接口的默认实现讲解
// 1.注意：这样做是不对的，因为接口成员本来就是用来声明标准的，不应该有实现
//        但是可以在接口成员声明时，完成对接口成员的实现(只是告诉你，有这样一个功能而已，以后用得少)
fun main() {
    val iusb1 : IUSB2 = Mouse2()
    println(iusb1.usbVersionInfo)
}