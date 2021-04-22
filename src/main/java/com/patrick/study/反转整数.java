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
 * @date: Created in 2021/4/17 9:57 上午
 * @desc:
 * @motto: 生平不知李二狗，学好并发也枉然
 */
public class 反转整数 {
	public static void main(String[] args) {
		System.out.println(revertNum(657));
	}

	public static int revertNum(int a) {
		return a % 10 * 100 + a / 10 % 10 * 10 + a / 100;
	}
}
