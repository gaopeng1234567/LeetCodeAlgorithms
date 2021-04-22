package com.patrick.sort;

/**
 * @author patrick
 * @date 2021/3/24 3:32 下午
 * @Des 冒泡排序 核心就是两两比较，但不是和所有人比较
 * 最簡單的事是堅持，最難的事還是堅持
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = new int[]{4, 2, 3, 1};
        for (int i = 0, len = array.length; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    array[j + 1] = array[j] + array[j + 1];
                    array[j] = array[j + 1] - array[j];
                    array[j + 1] = array[j + 1] - array[j];
                }
            }
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
}
