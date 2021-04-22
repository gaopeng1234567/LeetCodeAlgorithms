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
 * @date: Created in 2021/4/17 11:35 上午
 * @desc: 3n+1问题
 * @motto: Keep It Simple and Stupid, KISS
 */
public class D3n加1问题 {
	public static void main(String[] args) {
		int n = 987654321;
		int count = 0;
		while (n != 1) {
			if (n % 2 == 0)
				n = n / 2;
			else n = 3 * n + 1;
			count++;
		}
		System.out.println(count);
	}
}
