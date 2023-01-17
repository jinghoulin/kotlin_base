package com.mac.kt_base.s5

// 普通类
class ResponseResultBean1(var msg: String, var code: Int, var data: String) : Any()
// set get 构造函数

// 数据类 -- 以前 Response服务器响应 JavaBean 实体Bean    现在KT：数据类
data class ResponseResultBean2(var msg: String, var code: Int, var data: String) : Any()
// set get 构造函数 copy克隆 解构操作 toString hashCode equals   结论：数据类 生成 更加丰富

// TODO 90.Kotlin的数据类
fun main() {
    /*val list: List<Int> = listOf(100, 200, 300)
    val (v1, v2, v3) = list // 这个时候 我们之前 List集合的 解构操作
    println("List集合的 解构操作 v1:$v1,v2:$v2,v3:$v3")*/

    // TODO 1.普通类 与 数据类 的 toString 背后原理
    // 普通类
    println(ResponseResultBean1("loginSuccess", 200, "登录成功的数据..."))
    // 普通类：Any() toString Windows实现打印了  com.mac.kt_base.s5.ResponseResultBean1@3d24753a

    println(ResponseResultBean2("loginSuccess", 200, "登录成功的数据..."))
    // 数据类：Any() 默认重写了 父类的 toString 打印子类的toString详情  ResponseResultBean2(msg=loginSuccess, code=200, data=登录成功的数据...)

    // 总结：
    // ResponseResultBean1 Any父类的 toString 默认是 （打印类 地址码）
    // ResponseResultBean2 Any父类的 toString 被 数据类 重写了 toString 会调用 子类的 toString函数（打印值的详情）

    println()

    // TODO 2.前面学习过的 ==

    // 前面我们学习  == 值的比较 相当于java的equals              ===引用 对象 比较

    // 普通类
    println(
        ResponseResultBean1("loginSuccess", 200, "登录成功的数据...") ==
                ResponseResultBean1("loginSuccess", 200, "登录成功的数据...")
    )
    // Any父类的 equals 实现 （ResponseResultBean1对象引用 比较 ResponseResultBean1对象引用）

    // 数据类
    println(  // 推理 两个 数据类 的值 是一样的，应该是true
        ResponseResultBean2("loginSuccess", 200, "登录成功的数据...") ==
                ResponseResultBean2("loginSuccess", 200, "登录成功的数据...")
    )

    // 总结：
    // ResponseResultBean1 Any父类的 equals 默认是 （引用的比较）
    // ResponseResultBean2 Any父类的 equals 被 数据类 重写了 equals 会调用 子类的 equals函数（对值的比较）
}