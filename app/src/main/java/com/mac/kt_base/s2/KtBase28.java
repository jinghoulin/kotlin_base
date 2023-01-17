package com.mac.kt_base.s2;

import android.annotation.SuppressLint;

// Java接口
interface ResponseResult {
    void result(String msg, int code);
}

public class KtBase28 {

    public static void main(String[] args) {
        // 用户
        loginAPI("Derry3", "123456", new ResponseResult() {
            @SuppressLint("DefaultLocale")
            @Override
            public void result(String msg, int code) {
                // System.out.println("用户 最终登录的成果如下: msg:" + msg + ", code:" + code);
                System.out.println(String.format("用户 最终登录的成果如下: msg:%s, code:%d", msg, code));
            }
        });
    }

    // 模拟：数据库SQLServer
    public final static String USER_NAME_SAVE_DB = "Derry";
    public final static String USER_PWD_SAVE_DB = "123456";

    // 模拟：登录API 前端
    public static void loginAPI(String username, String userpwd, ResponseResult responseResult) {
        // KT === 引用的比较    Java ==
        // KT == 值的比较      Java equals
        if (username.equals(null) || userpwd.equals(null)) {
            // TODO("用户名或密码是null") // 出现问题，终止程序
            return;
        }

        // 很多很多的校验 前段的校验
        if (username.length() > 3 && userpwd.length() > 3) {
            if (webServiceLoginAPI(username, userpwd)) {
                // 登录成功
                // 做很多的事情 校验成功信息等
                // ...
                responseResult.result("login success data{有JSON数据}", 200);
            } else {
                // 登录失败
                // 做很多的事情 登录失败的逻辑处理 上传日志 ...
                // ...
                responseResult.result("login error data{}", 444);
            }
        } else {
            // TODO("用户名或密码 不合格 长度 不大于3") // 出现问题，终止程序
            return;
        }
    }

    // 模拟：后端
    // 登录的API的暴露者 服务器
    private static boolean webServiceLoginAPI(String username, String userpwd) {

        // kt的if是表达式（非常灵活的）     java的if语句（有局限性）

        // 做了很多的事情 登录逻辑的处理
        // ....

        // java 的 if 是语句，无法直接返回
        if (username == USER_NAME_SAVE_DB && userpwd == USER_PWD_SAVE_DB) {
            return true;
        } else {
            return false;
        }
    }
}

