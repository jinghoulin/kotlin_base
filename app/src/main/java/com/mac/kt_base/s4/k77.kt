package com.mac.kt_base.s4

class K77 {

    // lateinit val AAA: String 无法后面在修改了，因为是只读，我还怎么延迟初始化啊

    lateinit var responseResultInfo: String // 我等会儿再来初始化你，我先定义再说，所以没有赋值

    // 模拟服务器加载
    fun loadRequest() { // 延时初始化，属于懒加载，用到你在给你加载
        responseResultInfo = "服务器加载成功，恭喜你"
    }

    fun showResponseResult() {
        // lateinit property responseResultInfo has not been initialized
        // 由于responseResultInfo还没有初始化，谁都不能用，哪怕是读取都不行，哪怕是if判断都不行，否则就是不能碰
        // if (responseResultInfo == null) println()
        // println("responseResultInfo:$responseResultInfo")

        // 直接拿 responseResultInfo 字段的 内部属性isInitialized
        if (::responseResultInfo.isInitialized) {
            println("responseResultInfo:$responseResultInfo")
        } else {
            println("你都没有初始化加载，你是不是忘记加载了")
        }
    }
}

// TODO 77.Kotlin语言的延迟初始化lateinit学习
// 1.lateinit responseResultInfo 定义
// 2.request 懒加载
// 3.showResponseResult
// 4.main 先请求 在显示
fun main() {
    val p =K77()

    // 先 使用他之前，加载一下（用到它才加载，就属于，懒加载）
    p.loadRequest()

    // 再使用他
    p.showResponseResult()

    // 小结：我们在使用 延迟初始化字段的时候，一定一定要用  if (::responseResultInfo.isInitialized) 来判断，
    // 因为 延迟初始化字段，碰都不碰，一碰就会奔溃，所以才用 :: 取出 字段里面的 内部属性isInitialized 来判断，才避免奔溃
}