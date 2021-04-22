package com.patrick.algorithms;

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
 * @date: Created in 2021/4/16 10:09 上午
 * @desc:
 * @motto: 生平不知李二狗，学好并发也枉然
 */
public class YueSeFu {
	public static int josephus(int n, int m) {
		if (m == 2) {       // m=2时的特殊情况
			int k = 1;
			while (k <= n) {
				k = k << 1;
			}
			k = k >> 1;
			return (n - k) * 2;
		} else {            // 普遍情况，使用递归
			if (n == 1) {
				return 0;
			} else {
				return (josephus(n-1, m) + m) % n;
			}
		}
	}
	public static void main(String[] args) {
		// 由于函数返回的是从0开始编号的下标，所以还要再加1
		//          7
		//
		System.out.println(josephus(7, 2) + 1);
	}
}
