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
 * @date: Created in 2021/4/17 11:43 上午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class N阶层 {
	public static void main(String[] args) {
		int n = 10;
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			int abc = 1;
			for (int j = 1; j <= i; j++) {
				// 2 2! +1!  1 + 1*2 + 1*3
				abc *= j;
			}
			sum += abc;
		}
		System.out.println(sum % 1000000);
	}
}
