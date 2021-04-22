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
 * @date: Created in 2021/4/17 12:19 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 韩信点兵 {
	public static void main(String[] args) {
		int a = 2;
		int b = 1;
		int c = 6;
		for (int i = 10; i <= 100; i++) {
			if (i % 3 == 2 && i % 5 == 1 && i % 7 == 6) {
				System.out.println(i);
				break;
			}
		}

	}
}
