package com.mac.kt_base.s5

class K88 {
    companion object { // 伴生对象
        val name = "Beyond"
        val info = "原谅我这一生不羁放众爱自由"
        fun showInfo() = println("显示:$info")
    }

    /* companion object {} 背后的逻辑

         private static final String name = "Beyond";
         private static final String info = "原谅我这一生不羁放众爱自由";

         public static final K88.Companion Companion = new K88.Companion(xxx); // 给外界调用的

         public static final class Companion { // 是一个静态的内部类，所以可以 用 K88.Companion

              @NotNull
              public final String getName() {
                 return K88.name;
              }

              @NotNull
              public final String getInfo() {
                 return K88.info;
             }

             private Companion() {}
             ....... 省略
         }
     */
}

// TODO 88.Kotlin的伴生对象
// 伴生对象的由来： 在KT中是没有（Java的这种static静态），伴生很大程度上和（Java的这种static静态） 差不多的
// 小结：
// 不管 K88() 构建对象多少次，我们的伴生对象，只有一次加载
// 不管  K88.showInfo() 调用多少次，我们的伴生对象，只有一次加载
// 伴生对象只会初始化一次
fun main() {
    // 背后代码：System.out.println(K88.Companion.getName())
    println(K88.name)

    // 背后代码：System.out.println(K88.Companion.getInfo())
    println(K88.info)

    // 背后代码：K88.Companion.showInfo()
    K88.showInfo()

    // new K88();
    K88()
    K88()
    K88()
    K88()
    K88()
    K88()
    // ....省略
}