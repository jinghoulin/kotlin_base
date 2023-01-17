package com.mac.kt_base.s4

class Student {
    var name: String = "Derry"
        // 下面这个区域代码是，隐式，不写默认就有，  写了就把默认的给覆盖
        // field == name本身
        get() = field
        set(value) {
            field = value
        }
        /* 背后做的事情：

         @NotNull
         private String name = "Derry";

         public void setName( @NotNull String name) {
            this.name = name;
         }

         @NotNull
         public String getName() {
            return this.name;
         }
         */

    var info : String = "abcdefg ok is success"
        get() = field.capitalize()  // 把首字母修改成大写
        set(value) {
            field = "**【$value】**"
        }
        /* 背后做的事情：

         @NotNull
         private String info = "abcdefg ok is success";

         public void setInfo( @NotNull String info) {
            this.info = "**【+ info +】**";
         }

         @NotNull
         public String getInfo() {
            return StringKt.capitalize(this.info);
         }
         */

}

// TODO 69.Kotlin语言的定义类与field关键字学习
fun main() {
    // 背后隐式代码：new Student().setName("Derry1");
    Student().name = "Derry1"
    // 背后隐式代码：System.out.println(new Student().getName());
    println(Student().name)

    println(">>>>>>>>>>>>>>>")

    // 背后隐式代码：new Student().setInfo("学习Kotlin语言");
    Student().info = "学习Kotlin语言"

    // 背后隐式代码：System.out.println(new Student().getInfo());
    println(Student().info)
}