package com.mac.kt_base.s6

// 生产者 out T  协变 [out T 此泛型能够被获取 读取 所以是out]
interface  Producer<out T> {  // <out T> == 叫法：声明处协变 out

    // out T  代表整个生产者里面  这个T  只能被读取， 不能被修改了（编译不通过）

    // 不能被修改了 （编译不通过）
    /*fun consumer(itme: T)
    fun updateT(value:T)
    fun setT(v: T)*/

    // 只能被读取
    fun producer() : T
    // fun getT() : T
}

// 消费者 in T  逆变 [in T 此泛型只能被修改 更新 插入 修改 所以是in]
interface Consumer <in T> { // <in T> 声明处逆变

    // int T  代表整个消费者里面  这个T  只能被修改，  不能被读取了（编译不通过）

    // 只能被修改了
    fun consumer(itme: T)
    /*fun updateT(value:T)
    fun setT(v: T)*/

    // 不只能被读取（编译不通过）
    /*fun producer() : T
    fun getT() : T*/
}

// TODO >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

open class Animal // 动物
open class Humanity : Animal() // 人类
open class Man : Humanity() // 男人
open class WoMan : Humanity() // 女人

// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  只管生产者
class ProducerAnimal : Producer<Animal> {
    override fun producer(): Animal {
        println("生产者 Animal")
        return Animal()
    }
}

class ProducerHumanity : Producer<Humanity> {
    override fun producer(): Humanity {
        println("生产者 Humanity")
        return Humanity()
    }
}

class ProducerMan : Producer<Man> {
    override fun producer(): Man {
        println("生产者 Man")
        return Man()
    }
}

class ProducerWoMan : Producer<WoMan> {
    override fun producer(): WoMan {
        println("生产者 WoMan")
        return WoMan()
    }
}

// TODO 108-Kotlin的out-协变讲解 - KT
fun main() {
    val p1 : Producer<Animal> = ProducerAnimal() // ProducerAnimal他本来就是 传递 Animal ，当然是可以的

    // <out Animal> == 叫法：使用处协变 out
    val p2 : Producer<Animal> = ProducerHumanity() // ProducerHumanity他本来就是 传递 Humanity，居然也可以，因为out
    val p3 : Producer<Animal> = ProducerMan() // ProducerMan他本来就是 传递 Man，居然也可以，因为out
    val p4 : Producer<Animal> = ProducerWoMan() // ProducerWoMan他本来就是 传递 WoMan，居然也可以，因为out

    // 多个叫法
    // 泛型默认情况下是：泛型的子类对象        不可以赋值给    泛型的父类对象
    // 泛型默认情况下是：泛型具体处的子类对象   不可以赋值给    泛型声明处的父类对象
    // 泛型默认情况下是：父类 泛型声明处       不可以接收     子类泛型具体处

    // 多个叫法
    // out: 泛型的子类对象       可以赋值给   泛型的父类对象
    // out: 泛型具体出的子类对象  可以赋值给   泛型声明处的父类对象
    // out: 父类 泛型声明处      可以接收     子类泛型具体处

    // TODO 协变：父类 泛型声明处  可以接收   子类 泛型具体处（父类 接收 子类 非常合理 那么就是协作式的工作，就是协变）

    // TODO >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    // val list : List<CharSequence> = ArrayList<CharSequence>() // OK 的

    //          父类               =       子类
    val list2: List<CharSequence> = ArrayList<String>()

    // ? extends CharSequence  == KT out
}