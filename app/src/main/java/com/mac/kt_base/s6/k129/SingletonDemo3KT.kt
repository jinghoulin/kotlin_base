package com.mac.kt_base.s6.k129

// 3.懒汉式的实现 安全 KT版本
class SingletonDemo3KT private constructor(){

    companion object {
        private var instance: SingletonDemo3KT? = null
            get() {
                if (field == null) {
                    field = SingletonDemo3KT()
                }
                return field
            }
            private set(value) {
                field = value
            }

        @Synchronized
        fun getInstanceAction() : SingletonDemo3KT = instance !!
    }

    fun show() = println("我是show函数")
}

fun main() {
    SingletonDemo3KT.getInstanceAction().show()
}