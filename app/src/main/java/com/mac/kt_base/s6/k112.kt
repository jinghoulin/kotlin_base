package com.mac.kt_base.s6

// 假设这个代码是，开源的，或者是很庞大JDK源码，或者是非常复杂的开源库（细思极恐的功能）
class K112(val name: String, val age: Int, val sex: Char, val info: String)

// 给类 K112 增加扩展函数
fun K112.show() = println("我是show函数, name:${name}, age:$age, sex:$sex, info:$info")

// 给类 K112 增加扩展函数
fun K112.getInfo() = "我是getInfo函数, name:${name}, age:$age, sex:$sex"

// 给类 String 增加扩展函数
fun String.addExtAction(number: Int) =  this + "@".repeat(number)
fun String.showStr() =  println("你${this}调用了我哦")

/* 增加扩展函数后 的 背后代码

   public final class K112Kt {

        public static final void show(K112Kt $this$show) {
         System.out.println("我是show函数, name:" + $this$show.name + ", age:" + $this$show.age, sex:" + $this$show.sex + ",info:" + $this$show.info);
        }

        public static final void getInfo(K112Kt $this$getInfo) {
            return "我是getInfo函数, name:" + $this$show.name + ", age:" + $this$show.age, sex:" + $this$show.sex;
        }

        public static final String addExtAction(String $this$addExtAction) {
           return $this$addExtAction + StringsKt.repeat((CharSequence)"@", number);
        }

        public static final void showStr(String $this$showStr) {
            System.out.println($this$showStr);
        }

        public static void main(String [] args) { // JVM程序入口调用处
            main();
        }

        public static void main() {
            // ...
        }

   }
 */

// 总结：
// 函数里面会持有this == 调用者本身
// xxx.showStr  xxx函数里面会持有this == xxx本身
// 123.showStr  xxx函数里面会持有this == 123本身
// 'C'.showStr  xxx函数里面会持有this == ‘C’本身
// ...

// TODO 112-Kotlin的定义扩展函数讲解
fun main() {
    val p = K112("张三", 28, '男', "学习语言中")
    p.show()
    println(p.getInfo())

    println("Derry".addExtAction(8))
    println("Kevin".addExtAction(6))

    "ABCDEFG".showStr()
    "Beyond".showStr()
}