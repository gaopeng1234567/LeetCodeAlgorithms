package com.patrick.algorithms.排序;

/**
 * ｜                 ,;,,;;
 * ｜               ,;;'()     风
 * ｜     __      ,;;' ' \     流
 * ｜  /'  '\'~~'~' \ /'\.)    堪
 * ｜ ,;(      )    /  |.      比
 * ｜,;' \    /-.,,(   ) \     丶
 * ｜    ) /       ) / )|      城
 * ｜    ||        ||  \)      管
 * ｜   (_\       (_\          希
 * @author: 城管丶希
 * @date: Created in 2021/4/16 6:43 下午
 * @desc: 插入排序
 * @motto: 生平不知李二狗，学好并发也枉然
 * <p>
 * 1 2 4   3
 */
public class InsertSort {
	public static void main(String[] args) {
		int a[] = {7, 9, 2, 4, 8, 3};
		int len = a.length;
		// 时间复杂度 o(n^2)  (n + 1) * n /2
		// 最好 o(n) 全部走break
		for (int i = 1; i < len; i++) { //没有排序的，从1开始，默认0-1是拍好序列的
			int j = i - 1;
			int data = a[i];
			for (; j >= 0; j--) {
				if (a[j] > data) { //有序中的数字 和 无序中的相比较
					a[j + 1] = a[j]; //有序中的大，则往后走一个让位置
				} else { //无序中的大
					break; //之前的不用比了
				}
			}
			a[j + 1] = data; //因为肯定能比前面的数字大，所以插入在它后面
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
