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
 * @date: Created in 2021/4/16 7:05 下午
 * @desc: 希尔排序
 * @motto: 生平不知李二狗，学好并发也枉然
 */
public class ShellSort {
	public static void main(String[] args) {
		int a[] = {7, 9, 2, 4, 8, 3};
		int len = a.length / 2;
		while (len != 0) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] > a[i + len]) {
					int temp = a[i];
					a[i] = a[i + len];
					a[i + len] = temp;
				};
			}
			len = len / 2;
		}
		for (int i : a) {
			System.out.println(i);
		}
	}
}
