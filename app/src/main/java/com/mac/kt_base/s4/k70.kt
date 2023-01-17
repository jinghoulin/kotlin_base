package com.mac.kt_base.s4

class Derry {
    val number: Int = 0
    /* 背后的隐式代码：
      private int number = 0;

      // 只读的原因
      public int getNumber() {
        return this.number;
      }
     */

    // TODO 计算属性
    // 计算属性 非常不好理解（field 永远是描述 name 的 值）
    // number2 就没有 field了， 因为 number2 压根就没有值，所以就没有field
    // 计算属性  下面这样写 get函数覆盖了 field 内容本身，相当于field失效了，无用了，以后用不到了
    val number2 : Int
        get() = (1..1000).shuffled().first() // 从1到1000取出随机值 返回给 getNumber2()函数
    /* 背后的隐式代码：

      为什么没有 number2 定义？
      答：因为 计算属性的功能，导致没有 field，就没有 number2定义了
      答：因为 计算属性 的功能，根本在getNumber2函数里面，就没有用到 number2/field 属性，所以 number2属性 失效了，无用了，以后用不到了

      public int getNumber2() {
        return (1..1000).shuffled().first() java的随机逻辑 复杂;
      }
     */

    // TODO 防范竞态条件（尽量使用  ? + 内置函数 + 空合并操作符）
    var info: String ? = /*null*/ /*""*/ "DerryOK"

    // 防范竞态条件  当你调用成员，这个成员，可能为null，可能为空值，就必须采用 防范竞态条件，这个是KT编程的规范化
    fun getStudentInfo() : String {

        // 这个成员，可能为null，可能为空值，就启用 防范竞态条件
        // 这种写法，就属于 防范竞态条件，我们可以看到专业的KT开发者，有大量这种代码
        return info ?.let {
            if (it.isBlank()) {
                "info你原来是空值，请检查代码..."
            } else {
                "最终info结果是:$it"
            }
        } ?:  "info你原来是null，请检查代码..."
    }
}

// TODO 70.Kotlin语言的 计算属性 与  防范竞态条件
fun main() {
    // 背后的隐式代码: System.out.println(new Derry().getNumber());
    println(Derry().number)

    // 背后的隐式代码: new Derry().setNumber(9999);
    // Derry().number = 9999 // val 根本就没有 setNumber函数，只有 getNumber函数

    // 背后的隐式代码: System.out.println(new Derry().getNumber2());
    println(Derry().number2)

    // 背后的隐式代码: System.out.println(new Derry().getStudentInfo());
    println(Derry().getStudentInfo())
}