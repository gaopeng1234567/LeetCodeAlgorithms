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
 * @date: Created in 2021/4/17 12:04 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 水鲜花数 {
	public static void main(String[] args) {
		for (int i = 100; ; i++) {
			if (i > 1000)
				break;
			int a, b, c;
			a = i / 100;
			b = i / 10 % 10;
			c = i % 10;
			if (i == (a * a * a + b * b * b + c * c * c))
				System.out.printf("%d:%d%d%d\n", i, a, b, c);
		}
	}
}
