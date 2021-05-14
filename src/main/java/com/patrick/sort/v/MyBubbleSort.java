package com.patrick.sort.v;

import sun.jvm.hotspot.oops.BranchData;

import java.util.Arrays;

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
 * @date: Created in 2021/4/23 11:10 上午
 * @desc: 冒泡排序
 * 1、比较相邻的两个元素。如果第一个比第二小，则不动，反之交换
 * 2、比较n次后的得到最终结果
 * @motto: Keep It Simple and Stupid, KISS
 */
public class MyBubbleSort {
	public static void main(String[] args) {
		int data[] = {4, 5, 6, 3, 2, 1};
		int n = data.length;
		for (int i = 0; i < n - 1; i++) { //2个数比较几次？ 1次 4个数呢？比较三次就行
			boolean flag = false;
			for (int j = 0; j < n - 1 - i; j++) { //为什么减i? 因为每一次最后一个都是最大的，没必要比较了
				if (data[j] > data[j + 1]) {
					int temp = data[j + 1];
					data[j + 1] = data[j];
					data[j] = temp;
					flag = true;
				}
			}
			if (!flag) break;
		}
		System.out.println(Arrays.toString(data));
	}
}
