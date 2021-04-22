package com.patrick.algorithms.递归;

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
 * @date: Created in 2021/4/16 3:07 下午
 * @desc:
 * @motto: 生平不知李二狗，学好并发也枉然
 */
public class 斐波那契数列 {
	public static void main(String[] args) {
		System.out.println(fab(45));
		System.out.println(fab2(45));
	}

	//  1 1 2 3 5 8
	public static int fab(int n) {
		if (n <= 2)
			return 1;
		return fab(n - 1) + fab(n - 2);
	}

	//  1 1 2 3 5 8 5
//	public static int fab5(int n, int res,int count) {
//		if (n <= 2)
//			return 1;
//
////		return fab5(n, n + 1);
//	}

	public static int fab2(int n) {
		if (n == 0) {
			return 0;
		}
		if (n <= 2)
			return 1;
		int a = 1;
		int b = 1;
		int c = 0;
		for (int i = 2; i < n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}

	public static int fab3(int n) {
		if (n <= 2)
			return 1;
		return fab(n - 1) + fab(n - 2);
	}
}
