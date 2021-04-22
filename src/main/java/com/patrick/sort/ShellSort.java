package com.patrick.sort;

/**
 * @author patrick
 * @date 2021/3/24 1:40 下午
 * @Des 插入排序的改造 步长 分组
 * 最簡單的事是堅持，最難的事還是堅持
 */
public class ShellSort {
    // 4 1 2 3 5
    //第一步
    // step  5 /2 = 2
    // 4 2
    // 1 3
    // 5

    // 4 2 1 3 5
    //第二步
    // step  2 / 2 = 1

    // 1 2 3 4 5

    public static void main(String[] args) {
        int[] array = new int[]{4, 2, 3, 1, 7};
        int step = array.length;
        while (step >= 1) { //控制步数
            step = step / 2; //
            for (int i = step; i < array.length; i++) {
                for (int j = i; j - step >= 0; j = j - step) {
                    if (array[j] < array[j - step]) {
                        array[j - step] = array[j] + array[j - step];
                        array[j] = array[j - step] - array[j];
                        array[j - step] = array[j - step] - array[j];
                    } else break;
                }
            }
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
}
