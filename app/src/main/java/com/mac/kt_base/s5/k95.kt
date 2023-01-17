package com.mac.kt_base.s5

// data class 只是为了 我就是为了方便toString打印  四肢信息class
data class LimbsInfo (var limbsInfoName: String, var length: Int) {
    fun show() = println("${limbsInfoName}的长度是:$length")
}

// 同学们思考，为什么，要写 private？
// 答：因为是 枚举值 调用的主构造，属于内部成员 调用主构造，而且 private 不会对 枚举值调用主构造 有影响，
// 不给外界调用，所以可以私有
enum class Limbs(private var limbsInfo: LimbsInfo) // 主构造
 {
    LEFT_HAND(LimbsInfo("左手", 88)), // 左手
    RIGHT_HAND(LimbsInfo("右手", 88)), // 右手

    LEFT_FOOT(LimbsInfo("左脚", 140)), // 左脚
    RIGHT_FOOT(LimbsInfo("右脚", 140)), // 右脚

    /*星期一(LimbsInfo("左手", 88)),
    星期二,
    星期三,
    星期四,
    星期五,
    星期六,
    星期日*/

    // 结论
    // 1. WEEK 这个时候 再定义单调的 枚举值，就报错了   所有枚举值 必须 保持 与主构造参数 一致的效果
    // 2. 枚举的 主构造的参数 必须和 枚举(的参数) 保持一致

    ; // 结束枚举值

     fun show() = "四肢是:${limbsInfo.limbsInfoName}的长度是:${limbsInfo.length}"

     fun updateData(limbsInfoUpdate: LimbsInfo) {
         println("更新前的数据是:${this.limbsInfo}")

         // 更新操作
         this.limbsInfo.limbsInfoName = limbsInfoUpdate.limbsInfoName
         this.limbsInfo.length = limbsInfoUpdate.length

         println("更新后的数据是:${this.limbsInfo}")
     }
}

// TODO 95-Kotlin的枚举类定义函数
fun main() {
    // 显示枚举值
    // 一般不会这样用
    /*println(Limbs.show())
    println(Limbs().show())*/

    // 枚举定义函数 正确的用法 一般的用法如下：
    // Limbs 的 主构造参数，你不要管，是枚举值负责 实例化 参数 然后调用 主构造
    println(Limbs.LEFT_HAND.show())
    println(Limbs.RIGHT_HAND.show())
    println(Limbs.LEFT_FOOT.show())
    println(Limbs.RIGHT_FOOT.show())

    println()

    // 更新枚举值
    Limbs.RIGHT_HAND.updateData( LimbsInfo("右手2Update", 99) )
    Limbs.LEFT_HAND.updateData(LimbsInfo("左手2Update", 99))
    Limbs.LEFT_FOOT.updateData(LimbsInfo("左脚2Update", 199))
    Limbs.RIGHT_FOOT.updateData(LimbsInfo("右叫2Update", 199))
}