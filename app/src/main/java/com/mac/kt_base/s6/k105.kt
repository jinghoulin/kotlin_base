package com.mac.kt_base.s6

open class MyAnyClass(name: String) // 祖宗类 顶级父类
open class PersonClass(name: String) : MyAnyClass(name = name) // 父类
class StudentClass(name: String) : PersonClass(name = name) // 子类
class TeacherClass(name: String) : PersonClass(name = name) // 子类
class DogClass(name: String) // 其他类 另类
class CatClass(name: String) // 其他类 另类

// 结论：
// T : PersonClass   相当于  Java的 T extends PersonClass
// PersonClass本身 与 PersonClass的所有子类 都可以使用，   其他的类，顶级父类 等，都不能兼容此泛型
class K105<T : PersonClass>(private val inputTypeValue: T, private val isR: Boolean = true) {
    fun getObj() = inputTypeValue.takeIf { isR } // 万能对象返回器
}

// TODO 105-Kotlin的泛型类型约束讲解
fun main() {
    val any = MyAnyClass("祖宗类 顶级父类")// 祖宗类 顶级父类
    val per = PersonClass("父类") // 父类
    val stu = StudentClass("子类") // 子类
    val tea = TeacherClass("子类") // 子类
    val dog = DogClass("其他类") // 其他类
    val cat = CatClass("其他类") // 其他类

    /*val r1 = K105(any).getObj() // 顶级父类 报错了，类型限定了
    println(r1)*/

    val r2 = K105(per).getObj() // 父类
    println(r2)

    val r3 = K105(stu).getObj() // 子类
    println(r3)

    val r4 = K105(tea).getObj() // 子类
    println(r4)

    /*val r5 = K105(dog).getObj() // 其他类 报错了，类型限定了
    println(r5)

    val r6 = K105(cat).getObj() // 其他类 报错了，类型限定了
    println(r6)*/
}