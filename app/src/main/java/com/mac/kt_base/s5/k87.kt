package com.mac.kt_base.s5

interface RunnableKT { // KT的接口
    fun runKT()
}

open class K87 { // TODO 1.add del println
    open fun add(info: String) = println("K87 add:$info")
    open fun del(info: String) = println("K87 del:$info")
}

// TODO 87.Kotlin的对象表达式
// 1.add del println
// 2.匿名对象表达式方式
// 3.具名实现方式
// 4.对Java的接口 用对象表达式方式
fun main() {
    // TODO 2.匿名 对象表达式 方式
    val p: K87 = object : K87() {
        override fun add(info: String) {
            // super.add(info)
            println("我是匿名对象 add:$info")
        }

        override fun del(info: String) {
            // super.del(info)
            println("我是匿名对象 del:$info")
        }
    }
    p.add("李元霸")
    p.del("李连杰")

    println()

    // TODO 3.具名实现方式
    val p2 : K87 = K87Impl()
    p2.add("张三")
    p2.del("李四")

    println()

    // TODO 4.对Java的接口 用对象表达式方式

    // 对Java的接口 用   KT[对象表达式方式]  方式一
    val p3: Runnable = object : Runnable {
        override fun run() {
            println("Java Runnbale run 方式一 ...")
        }
    }
    p3.run()

    // 对Java的接口 用   简洁的方式 方式二
    val p4: Runnable = Runnable {
        println("Java Runnbale run 方式二 ...")
    }
    p4.run()

    println()

    // 对KT的接口 用   KT[对象表达式方式]  方式一
    object : RunnableKT {
        override fun runKT() {
            println("KT Runnbale run 方式一 ...")
        }
    }.runKT()

    // 对KT的接口 用   简洁的方式 方式二  【失败了，不支持了】
    /*RunnableKT {

    }*/
}

// 小结：Java接口，有两种方式  1（object : 对象表达式）  2简洁版
//       KT接口，只有一种方式 1（object : 对象表达式）  没有简洁版

// 具名实现  具体名字 == K87Impl
class K87Impl : K87() {
    override fun add(info: String) {
        // super.add(info)
        println("我是具名对象 add:$info")
    }

    override fun del(info: String) {
        // super.del(info)
        println("我是具名对象 del:$info")
    }
}