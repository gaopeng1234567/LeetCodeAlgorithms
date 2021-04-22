package com.patrick.algorithms;

/**
 * @author patrick
 * @date 2021/3/2 5:03 下午
 * @Des 上台阶
 * 最簡單的事是堅持，最難的事還是堅持
 */
public class 上台阶 {
    public static void main(String[] args) {

        System.out.println(getStep(42));
    }

    public static int getStep(int n) {
        //1   1
        //2   2
        //3   3
        //4   5
        int a = 1, b = 2;
        int temp = 0;
        for (int i = 3; i <= n; i++) {
            temp = a;
            a = b;
            b = temp + b;
        }
        return b;
    }
}
