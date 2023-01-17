package com.mac.kt_base.s6

// TODO 134-用前面所学Kotlin高阶技能-手写RxJava
fun main() {
    create {  // create是起点，他没有输入源
        "Derry"
        123
        true
        "AAAAAAAA"
        5435.54f // 最后一行，【create输出源 5435.54f】
    }.map {
       // it 或者 this == 5435.54f            【map的输入源 5435.54f】
        "Derry"
        123
        true
        "AAAAAAAA"
        "你的值是:$this" // 最后一行，          【map的输出源 "你的值是:$this"】
    }.map {
        // it 或者 this ==  "你的值是:$this"   【map的输入源  "你的值是:$this"】
        // .... 省略 ，万能类型，无数种类型，其实都一样的
        "[$this]"      // 最后一行，【map的输出源 "[$this]"】
    }.map {
        // it 或者 this ==  "[$this]"        【map的输入源   "[$this]"】
        // .... 省略 ，万能类型，无数种类型，其实都一样的
        "@@$this@@"    // 最后一行，【map的输出源 "@@$this@@"】
    }.observer {
        // 只需要把输入的内容，打印输出即可，所以不需要管输出
        println("最终消费：$this")
    }
}

// 中转站，保存我们的记录
class RxJavaCoreClassObject<T>(var valueItem : T)
// 1 valueItem 保存  5435.54f
// 2 valueItem 保存 "你的值是:$this"

inline fun<INPUT, OUTPUT> RxJavaCoreClassObject<INPUT>.map(mapAction: INPUT.() -> OUTPUT) : RxJavaCoreClassObject<OUTPUT> // 是为了 链式调用（.map .observer）
{
    val mapResult = mapAction(this.valueItem)
    // mapResult == "你的值是:$this"
    return RxJavaCoreClassObject(mapResult)
}

inline fun <INPUT>  RxJavaCoreClassObject<INPUT>.observer(observerAction: INPUT.() -> Unit) : Unit {
    observerAction(this.valueItem)
}

inline fun <CREATE_OUTPUT> create(createLambda : () -> CREATE_OUTPUT) : RxJavaCoreClassObject<CREATE_OUTPUT> // 是为了 链式调用（.map .observer）
{
    val createResult : CREATE_OUTPUT = createLambda()
    // createResult ==  5435.54f
    return RxJavaCoreClassObject(createResult)
}