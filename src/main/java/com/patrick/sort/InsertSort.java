package com.patrick.sort;

/**
 * @author patrick
 * @date 2021/3/24 10:45 上午
 * @Des 插入排序 这他吗写的是啥玩意儿。。。看v包下的，正版
 * 最簡單的事是堅持，最難的事還是堅持
 */
public class InsertSort {
    public static void main(String[] args) {

        int[] array = new int[]{4, 2, 3, 1};
        for (int i = 0; i < array.length; i++) {//取出一个数字
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    array[j - 1] = array[j] + array[j - 1];
                    array[j] = array[j - 1] - array[j];
                    array[j - 1] = array[j - 1] - array[j];
                } else break;
            }
        }
        for (int j : array) {
            System.out.println(j);
        }
    }
}
