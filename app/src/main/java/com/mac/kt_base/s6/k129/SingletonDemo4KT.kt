package com.mac.kt_base.s6.k129

// 4.懒汉式的实现 双重校验安全 KT版本
class SingletonDemo4KT private constructor(){

    companion object {
        val instance: SingletonDemo4KT by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) { SingletonDemo4KT() }
    }

    fun show() = println("我是show函数")
}

fun main() {
    SingletonDemo4KT.instance.show()
}