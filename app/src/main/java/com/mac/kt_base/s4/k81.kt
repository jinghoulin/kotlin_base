package com.mac.kt_base.s4

// 小陷阱
class K81s(_info : String) {
    val info: String = _info

    fun getInfox() : String = info
}

class K81(_info : String) {

    private val info = _info // 类成员放最前面，就能够被保证 初始化成功

    val content : String = getInfoMethod() // 只有他能够被外界访问

    // private val info = _info // 把这种 转换info的代码，写到最前面，这样保证，就不会出现这种问题

    private fun getInfoMethod() = info // 当此函数调用info变量的时候，你以为是赋值好了，但是还没有赋值

    // 小结：为了以后不出现 陷阱三， 所有的类成员都放最前面就行了
}

// TODO 81.Kotlin语言的.初始化陷阱三学习
fun main() {
    println("最终的成果长度是:${K81("Derry").content.length}")
}