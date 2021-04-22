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
 * @date: Created in 2021/4/17 10:40 上午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 求平均 {
	public static void main(String[] args) {
		System.out.printf("%.3f\n", (1 + 2 + 3) / 3.0);
		BigDecimal bigDecimal = BigDecimal.valueOf(375).multiply(BigDecimal.valueOf(0.85)).setScale(2, BigDecimal.ROUND_HALF_UP);
		System.out.println(bigDecimal.toString());
		System.out.println(Integer.MAX_VALUE);
	}
}
