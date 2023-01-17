package com.mac.kt_base.s4;

public class k75Java {

    // KT的 init代码块  == Java的构造代码块的
    {
        System.out.println("所有的构造函数，在调用的时候，必须调用 构造代码块");
    }

    k75Java() {
        System.out.println("构造函数1");
    }

    k75Java(String name) {
        System.out.println("构造函数2");
    }

}
