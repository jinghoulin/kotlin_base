package com.mac.kt_base.s6.k129;

// 3.懒汉式的实现 安全 Java版本
public class SingletonDemo3 {

    private static SingletonDemo3 instance;

    private SingletonDemo3() {}

    public static synchronized SingletonDemo3 getInstance() {
        if (instance == null) {
            instance = new SingletonDemo3();
        }
        return instance;
    }

    public void show() { System.out.println("show java ");}

    public static void main(String[] args) {
        SingletonDemo3.getInstance().show();
    }
}
