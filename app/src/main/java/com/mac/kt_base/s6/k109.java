package com.mac.kt_base.s6;

import java.util.ArrayList;
import java.util.List;

// TODO 109-Kotlin的in-逆变讲解 - Java
public class k109 {
    public static void main(String[] args) {
        // 无论是 协变 还是 逆变 Java 只有 使用处 没有 声明处

        // 泛型默认情况下是：泛型的父类对象       不可以赋值给  泛型的子类对象
        // 泛型默认情况下是：泛型具体处的父类对象  不可以赋值给  泛型声明处的子类对象
        // List<String> list = new ArrayList<CharSequence>();

        // String子类  CharSequence父类

        // ? super T 就相当于 KT里面的in，所以才可以 泛型父类对象 赋值给 泛型子类对象
        // in: 泛型具处的父类对象 可以赋值给 泛型声明处的子类对象

        // 使用处 逆变
        List<? super String> list = new ArrayList<CharSequence>();

        // 逆变：子类 泛型声明处  可以接收   父类 泛型具体处
    }
}
