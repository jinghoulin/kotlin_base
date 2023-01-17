package com.mac.kt_base.s5

data class K91 (var name: String, var age: Int) // 主构造
{
    var coreInfo : String = ""

    init {
        println("主构造被调用了")
    }

    // 次构造 只有一个参数
    constructor(name: String) : this(name, 99) {
        println("次构造被调用")
        coreInfo = "增加非常核心的内容信息"
    }

    override fun toString(): String { // 3个参数了
        return "toString name:$name, age:$age, coreInfo:$coreInfo"
    }
}

// 生成的toString 为什么只有两个参数？
//答：默认生成 toString 或者 hashCode equals 等等... 主管主构造 两个参数， 不管次构造 那个 coreInfo 参数

// TODO 91.Kotlin的copy函数
fun main() {
    val p1: K91 = K91("李小龙") // 调用 次构造 只有一个参数
    println(p1) // 默认调用 Any()父类 的 toString ---> 子类的 data class 生成 的 toString（复写了父类的toString）

    val newP2: K91 = p1.copy("李连杰", 89) // Copy一个新的对象出来
    println(newP2) // toString 全部打印三个参数，为什么 我们的 coreInfo 是空的，因为 copy只管主构造， 不管次构造

    // copy toString hashCode equals 等等... 主管主构造，不管次构造
    // 注意事项：使用copy的时候，由于内部代码只处理主构造，所以必须考虑次构造的内容
}