package com.mac.kt_base.s6

// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  只管消费者

class ConsumerAnimal : Consumer<Animal> {
    override fun consumer(item: Animal) {
        println("消费者 Animal")
    }
}

class ConsumerHumanity : Consumer<Humanity> {
    override fun consumer(item: Humanity) {
        println("消费者 Humanity")
    }
}

class ConsumerMan : Consumer<Man> {
    override fun consumer(item: Man) {
        println("消费者 Man")
    }
}

class ConsumerrWoMan : Consumer<WoMan> {
    override fun consumer(item: WoMan) {
        println("消费者 WoMan")
    }
}

// TODO 109-Kotlin的in-逆变讲解 - KT
fun main() {
    val p1 : Consumer<Man> = ConsumerAnimal() // ConsumerClass1他本来就是 传递 Animal，居然也可以，因为in
    val p2 : Consumer<WoMan> = ConsumerHumanity() // ConsumerHumanity他本来就是 传递 Humanity，居然也可以，因为in

    // 使用处 逆变 val p1 : Consumer<in Man> = ConsumerAnimal()

    // 逆行 开车 不合理        逆变 不合理  （子类 接收 父类）

    // 无论是 协变 还是 逆变 Java 只有 使用处 没有 声明处

    // 泛型默认情况下是：泛型的父类对象       不可以赋值给
    //
    // 泛型的子类对象
    // 泛型默认情况下是：泛型具体处的父类对象  不可以赋值给  泛型声明处的子类对象
    // List<String> list = new ArrayList<CharSequence>();

    // String子类  CharSequence父类

    // ? super T 就相当于 KT里面的in，所以才可以 泛型父类对象 赋值给 泛型子类对象
    // in: 泛型具处的父类对象 可以赋值给 泛型声明处的子类对象

    // 总结：
    // out == ? extends
    // in  == ? super
    // 协变：out 父类 = 子类
    // 逆变：in  子类 = 父类
}