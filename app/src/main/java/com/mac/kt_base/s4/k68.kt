package com.mac.kt_base.s4

// TODO 68.Kotlin语言的可变Map集合学习
// 1.可变集合的操作 += [] put
// 2.getOrPut 没有的情况
// 3.getOrPut 有的情况
fun main() {
    // TODO 1.可变集合的操作 += [] put
    val map : MutableMap<String, Int> = mutableMapOf(Pair("Derry1", 123), "Derry2" to 456, Pair("Derry3", 789))
    // 下面是可变操作
    map += "AAA" to(111)
    map += "BBB" to 222
    map -= "Derry2"
    map["CCC"] = 888
    map.put("DDD", 999) // put 和 [] 等价的

    // TODO 2.getOrPut 没有的情况
    // 如果整个map集合里面 没有找到 FFF的key元素， 1.我就帮你 先添加此元素（FFF，555）添加到map集合中去  2.然后再从map里面获取FFF key的元素
    val fffValue : Int = map.getOrPut("FFF") {555}
    println(fffValue)
    println("整个map集合的内容是:${map}")
    println(map["FFF"]) // 他已经帮你加入map集合里面进去了，所以你可以获取

    // TODO 3.getOrPut 有的情况
    val derry3Value = map.getOrPut("Derry3") {6666666}
    println(derry3Value)

    // 发现Derry3的key在map集合中是有的，那么就直接获取出来， 相当于 6666666备用值 就没用了，用不上了
    println("整个map集合的内容是:${map}")

    // 小结：在企业开发过程中，尽量使用 getOrPut 来增加， 内部已经帮你做了工作（如果有 直接获取，   如果没有 增加元素进去 再获取）
}