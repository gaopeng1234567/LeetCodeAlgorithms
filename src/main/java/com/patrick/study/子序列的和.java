package com.patrick.study;

import java.math.BigDecimal;

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
 * @date: Created in 2021/4/17 12:47 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 子序列的和 {
	public static void main(String[] args) {
		System.out.printf("%.5f\n", 1 / 4.0 + 1 / 9.0 + 1 / 16.0);
		int n = 2, m = 4;
		BigDecimal result = BigDecimal.valueOf(0);
		double a = 0.0;
		for (double i = n; i <= m; i++) {
//			result = result.add(BigDecimal.valueOf(1).divide(BigDecimal.valueOf(i*i)).setScale(5, BigDecimal.ROUND_HALF_UP));
			System.out.println(i*i);
			a += 1.0 / i * i;
		}
		System.out.println(result.toString());
		System.out.printf("%.5f\n", a);
	}
}
