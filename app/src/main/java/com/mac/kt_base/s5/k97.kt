package com.mac.kt_base.s5

// 密封类，  1.我们成员， 就必须有类型(object,class)       2.并且     继承本类 : Exams()
sealed class Exams () {
    // object？ Fraction1 Fraction2 Fraction3 都不需要任何成员，所以一般都写成object，单例就单例，无所谓了
    object Fraction1 : Exams() // 分数差
    object Fraction2 : Exams() // 分数及格
    object Fraction3 : Exams() // 分数良好

    // 暂停
    // 假设 object Fraction4 是可以写object的，那么也不合理，因为对象 李四 不是 王五 单例的，有 对象1李四 对象2王五
    class Fraction4(val studentName: String) : Exams() // 分数优秀  需求 得到分数优秀的孩子姓名
    /*class Fraction5(val studentName: String) : Exams()
    class Fraction6(val studentName: String) : Exams()
    class Fraction7(val studentName: String) : Exams()
    class Fraction8(val studentName: String) : Exams()*/
}

class Teachers(private val exam: Exams) {
    fun show() =
        when(exam) {
            is Exams.Fraction1 -> "该学生分数很差"
            is Exams.Fraction2 -> "该学生分数及格"
            is Exams.Fraction3 -> "该学生分数良好"
            is Exams.Fraction4 -> "该学生分数优秀：该学生的姓名是:${(this.exam as Exams.Fraction4).studentName}"
            // else -> 由于我们的show函数，是使用枚举类类型来做判断处理的，这个就属于 代数数据类型，就不需要写 else 了
            // 因为when表达式非常明确了，就只有 四种类型，不会出现 else 其他，所以不需要写
        }
}

// TODO 97-Kotlin的密封类
fun main() {
    println(Teachers(Exams.Fraction1).show())
    println(Teachers(Exams.Fraction2).show())
    println(Teachers(Exams.Fraction3).show())
    println(Teachers(Exams.Fraction4("李四")).show()) // 对象1 李四
    println(Teachers(Exams.Fraction4("王五")).show()) // 对象2 王五

    println(Exams.Fraction1 === Exams.Fraction1) // true, === 必须对象引用， object是单例 只会实例化一次
    println(Exams.Fraction4("AAA") === Exams.Fraction4("AAA")) // class 有两个不同的对象，所以是false
}

// 密封类：在于控制子类数量可控，以免被非法继承
// 枚举类：在于控制状态数量可控