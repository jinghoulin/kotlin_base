package com.mac.kt_base.s5

object K86 {
    init { println("K86 init ...") }
    fun show() = println("我是show函数")

    /* object 对象类背后做了什么事情

        public static final K86 INSTANCE;

        private K86() {}  // 主构造废除一样的效果

        // 这个区域是 object 不同点：
        static {
            K86 var0 = new K86();
            INSTANCE = var0;
            // 直接把 init代码的代码，搬到这里来了（因为 主构造被私有化了，相当于废除了，所以 把init代码 搬到这里来了）
            String var1 = "K86 init ...";
            System.out.println(var1);
        }

        public final void show() {
            String var1 = "我是show函数";
            ...
            System.out.println(var1);
        }
    */
}

// TODO 86.Kotlin的对象声明
fun main() {
    // object K86 既是 单例的实例，也是类名
    // 小结：既然是 单例的实例，又是类名，只有一个创建，这就是典型的单例
    println(K86) // 背后的代码：System.out.println(K86.INSTANCE);
    println(K86) // 背后的代码：System.out.println(K86.INSTANCE);
    println(K86) // 背后的代码：System.out.println(K86.INSTANCE);
    println(K86) // 背后的代码：System.out.println(K86.INSTANCE);
    println(K86) // 背后的代码：System.out.println(K86.INSTANCE);
    println(K86) // 背后的代码：System.out.println(K86.INSTANCE);

    // 相当于类名.show()
    K86.show() // 背后的代码：System.out.println(K86.INSTANCE.show());
}