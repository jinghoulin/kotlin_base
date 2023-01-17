package com.mac.kt_base.s2

// TODO 16.Kotlin的函数头讲解
fun main() {

}

// 函数默认就是public
// 先有输入，再有输出，这个是更加符合人类的思维的
private fun method01(age: Int, name: String)     : Int {
    println("name:$name,age:$age")
    return 200
}

/* 上面的函数，背后会变成下面 Java的样子：
public final class KtBase16Kt {
   public static final void main() {
   }

   // $FF: synthetic method
   public static void main(String[] var0) {
      main();
   }

    private static final int method01(int age, String name) {
       String var2 = "name:" + name + ",age:" + age;
       boolean var3 = false;
       System.out.println(var2);
       return 200;
    }
}
 */