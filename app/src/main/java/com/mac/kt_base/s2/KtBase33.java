package com.mac.kt_base.s2;

interface IShowResult { // 接口的折中方案 解决 kt的lambda问题
    void result(String result);
}

// TODO 33.Kotlin语言的匿名函数与具名函数
public class KtBase33 {

    public static void main(String[] args) {
        // KtBase33.kt匿名函数相当于
        showPersonInfo("Derry", 38, '男', "学习KT语言中", new IShowResult() {
            @Override
            public void result(String result) {
                System.out.println("匿名函数 显示结果:" + result);
            }
        });

        System.out.println();

        // KtBase33.kt具名函数相当于
        IShowResult showResultImpl = new MShowResultImpl();
        showPersonInfo("Derry", 38, '男', "学习KT语言中", showResultImpl);
    }

    // 具名函数的区域
    static class MShowResultImpl implements IShowResult {
        @Override
        public void result(String result) {
            System.out.println("具名函数 显示结果:" + result);
        }
    }

    // ---------------------------------

    static void showPersonInfo(String name, int age, char sex, String study , IShowResult iShowResult) {
        String str = String.format("name:%s, age:%d, sex:%c, study:%s", name, age, sex, study);
        iShowResult.result(str);
    }
}
