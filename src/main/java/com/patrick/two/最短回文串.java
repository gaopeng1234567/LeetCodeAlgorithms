package com.patrick.two;

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
 * @date: Created in 2021/5/31 6:05 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 最短回文串 {
	public String shortestPalindrome(String s) {
		String reverseS = new StringBuilder(s).reverse().toString();
		int lenS = s.length();
		for (int i = 0; i < lenS; i++) {
			if (s.startsWith(reverseS.substring(i))) {
				return reverseS.substring(0, i) + s;
			}
		}
		return "";
	}
}
