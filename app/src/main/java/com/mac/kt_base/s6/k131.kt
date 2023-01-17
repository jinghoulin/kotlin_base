package com.mac.kt_base.s6

// TODO 131.注解@JvmField与Kotlin
class Person {
    @JvmField
    val names = listOf("Zhangsan", "Lisi", "Wangwu")
}

// 默认情况下，没有 @JvmField 注解的时候
/* 背后的原理代码：
    public final class Person{
        @NotNull
        private final List names = CollectionsKt.listOf(new String[]{"Zhangsan", "Lisi", "Wangwu"});

        // val 只读的，只有 getNames
        public final List getNames() {
            return this.names;
        }
    }
 */

// @JvmField 背后会剔除私有代码 成员
/* 背后的原理代码：
    public final class Person{
        @JvmField
        @NotNull
        public final List names = CollectionsKt.listOf(new String[]{"Zhangsan", "Lisi", "Wangwu"});
    }
 */