package com.mac.kt_base.s6.k129;

// 4.懒汉式的实现 双重校验安全 Java版本
public class SingletonDemo4 {

    private volatile static SingletonDemo4 instance;

    private SingletonDemo4() {}

    public static SingletonDemo4 getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo4.class) {
                if (instance == null) {
                    instance = new SingletonDemo4();
                }
            }
        }
        return instance;
    }

    public void show() { System.out.println("show java ");}

    public static void main(String[] args) {
        SingletonDemo4.getInstance().show();
    }
}
