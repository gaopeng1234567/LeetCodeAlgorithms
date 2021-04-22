package com.patrick.study;

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
 * @date: Created in 2021/4/17 10:12 上午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 鸡兔同笼 {
	public static void main(String[] args) {
		int n = 10; //总数
		int m = 16; //总腿数

		int a, b; // 鸡 兔

		a = 2 * n - m / 2;
		b = n - a;
		if (a < 0 || b < 0 || m % 2 == 1) {
			System.out.println("无解");
		} else
			System.out.printf("鸡的个数%s,兔子的个数%s%n", a, b);
		System.out.println(11111*11111);
		System.out.println(111111*111111);
		System.out.println(1111111111*1111111111);
		System.out.println(11111.0*11111.0);
		System.out.println(111111.0*111111.0);
		System.out.println(1111111111.0*1111111111.0);
		System.out.println(Math.sqrt(-10));
		System.out.println(1.0/0.0);
		System.out.println(0.0/0.0);
		System.out.println(1/0);


	}
}
