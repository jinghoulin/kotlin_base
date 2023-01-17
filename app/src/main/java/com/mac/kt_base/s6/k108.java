package com.mac.kt_base.s6;

import java.util.ArrayList;
import java.util.List;

// TODO 108-Kotlin的out-协变讲解 - Java
public class k108 {
    public static void main(String[] args) {
        // List<CharSequence> list = new ArrayList<CharSequence>();  OK的

        // 多个叫法
        // 泛型默认情况下是：泛型的子类对象        不可以赋值给    泛型的父类对象
        // 泛型默认情况下是：泛型具体处的子类对象   不可以赋值给    泛型声明处的父类对象
        // 泛型默认情况下是：父类 泛型声明处       不可以接收     子类泛型具体处

        // CharSequence父类        String子类
        // 父类 = 子类

        // ? extends T  就相当于 KT里面的out，所以才可以 泛型子类对象 赋值给 泛型父类对象
        // out       T  就相当于 KT里面的out，所以才可以 泛型子类对象 赋值给 泛型父类对象

        // <? extends CharSequence> == 叫法：使用处协变 ? extends【Java语言只有使用处协变】  【KT两者都有  声明处 使用处 都有】
        List<? extends CharSequence> list = new ArrayList<String>();

        // Java ? extends  == KT out

        // 协变： 父类 泛型声明处   可以接收  子类泛型具体处
    }
}
