package com.mac.kt_base.s6

abstract class BaseActivity {
    fun onCreate() {
        setContentView(getLayoutID())

        initView()
        initData()
        initXXX()
    }

    private fun setContentView(layoutID: Int) = println("加载{$layoutID}布局xml中") // 模拟系统的 setContentView

    abstract fun getLayoutID(): Int
    abstract fun initView()
    abstract fun initData()
    abstract fun initXXX()
    // ...
}

// 子类
class MainActivity : BaseActivity() {
    override fun getLayoutID() = 534534

    override fun initView() = println("做具体初始化View的实现")

    override fun initData()  = println("做具体初始化数据的实现")

    override fun initXXX()  = println("做具体初始化其他业务逻辑的实现")

    fun show() = super.onCreate()
}

// 子类
class LoginActivity : BaseActivity() {
    override fun getLayoutID() = 758787

    override fun initView() = println("做具体初始化View的实现")

    override fun initData()  = println("做具体初始化数据的实现")

    override fun initXXX()  = println("做具体初始化其他业务逻辑的实现")

    fun show() = super.onCreate()
}

// TODO 101-Kotlin的抽象类讲解
fun main() = LoginActivity().show()