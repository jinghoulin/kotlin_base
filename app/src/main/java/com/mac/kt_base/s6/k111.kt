package com.mac.kt_base.s6

// TODO >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> start
class Object1
class Object2
class Object3

inline fun <reified T> showTypeInfo(item: T) {
    if (Object1() is T) {
        println("原来你是 Object1")
    } else if (Object2() is T) {
        println("原来你是 Object2")
    } else if (Object3() is T) {
        println("原来你是 Object3")
    } else {
        println("不是 Object1 Object2 Object3， 你传递进来类型的名称是：${T::class.java.simpleName}")
    }
}

// reified 真泛型类型的监测
fun mainDerry() {
    showTypeInfo('C')
    showTypeInfo("Derry")
    showTypeInfo(23543)
    showTypeInfo(5345.45)
    showTypeInfo(535.5f)
    showTypeInfo(true)

    showTypeInfo(Object1())
}
// TODO >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> end




// 1.定义3个Obj类
data class ObjectClass1(val name: String, val age: Int, val study: String)
data class ObjectClass2(val name: String, val age: Int, val study: String)
data class ObjectClass3(val name: String, val age: Int, val study: String)

class K111 {

    // <T> 让外界传递进来的 备用对象 ObjectClass1
    inline fun <reified T> randomOrDefault(defaultLambdaAction: () -> T ) : T ? {
        val objList: List<Any> = listOf(
            ObjectClass1("obj1 李四", 22, "学习C"),
            ObjectClass2("obj2 王五", 23, "学习C++"),
            ObjectClass3("obj3 赵六", 24, "学习C#"))

        val randomObj : Any? = objList.shuffled().first() // 随机获取 ObjectClass1 ObjectClass2 ObjectClass3 的其中一个

        println("您随机产生的对象 幸运儿是:$randomObj")

        // 如果  it随机产生的对象 等于 T类型的(备用对象)，就会走 as T 直接返回了

        // 精妙绝伦： takeIf { false }  返回 null    null as T 奔溃了     null as T ?
        // T ?  可以接收 T， 也可以接收 null
        // T   就只能接收T，接收null 会奔溃
        return randomObj.takeIf { it is T } as T ?
             // 如果  it随机产生的对象 不等于 T类型的，就会走下面这个备用环节
            ?: defaultLambdaAction()
    }

}

// TODO 111-Kotlin的reified关键字讲解
// 1.定义3个Obj类
// 2.randomOrDefault函数 备用机制的lambda
// 3.lists.shuffled()
fun main() {
    // ObjectClass1 == 备用对象
    val finalResult : ObjectClass1 ? = K111().randomOrDefault<ObjectClass1> {
        println("由于随机产生的对象 和 我们指定的ObjectClass1不一致，所以启用备用对象")
        ObjectClass1("备用对象被激活 obj1 李四", 22, "学习C") // 最后一行的返回
    }
    println("客户端最终结果:$finalResult")
}
