package com.patrick.study;

import com.sun.org.apache.bcel.internal.generic.IRETURN;

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
 * @date: Created in 2021/4/17 1:09 下午
 * @desc: 1-9组成三个三位数 比例为  abc:def:ghi = 1：2：3
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 排列adbDEFghi {
	public static void main(String[] args) {
		int[] temp = new int[10]; //存放0-9出现的次数， 类比全国人年龄个数
		for (int i = 123; i < 333; i++) {
			temp = new int[10];
			temp[i / 100] = 1;
			temp[i / 10 % 10] = 1;
			temp[i % 10] = 1;
			int j = i * 2;
			temp[j / 100] = 1;
			temp[j / 10 % 10] = 1;
			temp[j % 10] = 1;
			int k = i * 3;
			temp[k / 100] = 1;
			temp[k / 10 % 10] = 1;
			temp[k % 10] = 1;
			int sum = 0;
			for (int l = 1; l < 10; l++) {
				sum += temp[l];
			}
			if (sum == 9) {
				System.out.print(i + " ");
				System.out.print(j + " ");
				System.out.print(k + " ");
				System.out.println();
			}
		}
	}
}
