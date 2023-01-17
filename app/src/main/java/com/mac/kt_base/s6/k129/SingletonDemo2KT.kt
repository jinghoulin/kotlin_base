package com.mac.kt_base.s6.k129

// 2.懒汉式的实现 KT版本
class SingletonDemo2KT private constructor(){

    companion object { // 只有在派生里面，才是static的效果
        private var instance: SingletonDemo2KT? = null
            get() {
                if (field == null) {
                    field = SingletonDemo2KT()
                }
                return field
            }
            private set(value) {
                field = value
            }
        fun getInstanceAction() : SingletonDemo2KT = instance !!
    }

    fun show() = println("我是show函数")
}

fun main() {
    SingletonDemo2KT.getInstanceAction().show()
}