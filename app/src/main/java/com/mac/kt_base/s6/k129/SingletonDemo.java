package com.mac.kt_base.s6.k129;

// 1.饿汉式的实现  Java版本
public class SingletonDemo {

    private static SingletonDemo instance =  new SingletonDemo();

    private SingletonDemo() {}

    public static SingletonDemo getInstance() {
        return instance;
    }
}
