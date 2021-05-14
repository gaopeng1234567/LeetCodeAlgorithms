package com.patrick.sort.v;

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
 * @date: Created in 2021/4/22 11:19 下午
 * @desc: 希尔排序
 * 1、设置一个增量 length 每次/2
 * 2、进行跳跃式排序
 * 3、直到=1结束
 * @motto: Keep It Simple and Stupid, KISS
 */
public class ShellSort {
	public static void main(String[] args) {
		int a[] = {9, 8, 7, 0, 1, 3, 2};
		int n = a.length;

		for (int add = n / 2; add >= 1; add /= 2) {
			for (int i = add; i < n; i++) {
				int data = a[i];
				int j = i - add;
				for (; j >= 0; j -= add) {// 从尾到头 1+2+3+4+5+...+n=>
					if (a[j] > data) {
						a[j + add] = a[j]; // 数据往后移动
					} else { // 因为前面已经是排好序的 那么找到一个比他小的就不用找了，因为前面的肯定更小
						break; // O(1) 如果这个break执行的越多 那么我是不是效率就越高?
					}
				}
				a[j + add] = data;
			}
		}
	}
}
