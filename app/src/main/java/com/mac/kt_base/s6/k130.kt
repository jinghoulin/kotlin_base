@file:JvmName("Stu") // 就是在编译器环节，修改我们的类的名字，让Java端调用更简洁

package com.mac.kt_base.s6

// @file:JvmName("Stu") 注意：必须写在 包名的外面

// TODO 130-注解@JvmName与Kotlin
fun getStudentNameValueInfo(str : String) = println(str)
fun main() {}

/* 背后生成的代码：
    public final class K130Kt {

          public static final void getStudentNameValueInfo(@NotNull String str) {
            System.out.println(str);
         }

        public static final void main() {
        }

        public static void main(String[] args) {
            main();
        }
    }
 */

// @file:JvmName("Stu") 背后的原理
/* 背后生成的代码：
    public final class Stu {

          public static final void getStudentNameValueInfo(@NotNull String str) {
            System.out.println(str);
         }

        public static final void main() {
        }

        public static void main(String[] args) {
            main();
        }
    }
 */