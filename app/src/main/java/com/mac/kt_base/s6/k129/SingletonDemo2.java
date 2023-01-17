package com.mac.kt_base.s6.k129;

// 2.懒汉式的实现 Java版本
public class SingletonDemo2 {

    private static SingletonDemo2 instance;

    private SingletonDemo2() {}

    public static SingletonDemo2 getInstance() {
        if (instance == null) {
            instance = new SingletonDemo2();
        }
        return instance;
    }
}
