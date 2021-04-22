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
 * @date: Created in 2021/4/17 12:31 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 倒三角 {
	public static void main(String[] args) {
		int n = 20;
		for (int i = 0; i < n; i++) {
			for (int j = 0,num = 2 * n - 1 - 2 * i; j < num; j++) {
				System.out.print("*");
			}
			System.out.println();
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
		}
	}
}
