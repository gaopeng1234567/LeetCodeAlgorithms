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
 * @date: Created in 2021/4/17 11:18 上午
 * @desc: 输出结果只有 7744
 * @motto: Keep It Simple and Stupid, KISS
 */
public class AABB问题 {
	public static void main(String[] args) {
		for (int n = 1; ; n++) {
			int m = n * n;
			if (m < 1000)
				continue;
			if (m > 10000)
				break;
			int a = m / 100;
			int b = m % 100;
			if (a / 10 == a % 10 && b / 10 == b % 10)
				System.out.println(m);
		}
	}
}
