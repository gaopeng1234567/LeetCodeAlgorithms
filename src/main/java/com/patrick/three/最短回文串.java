package com.patrick.three;

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
		//   abc
		// cba
		// abc  cba ba a
		// abc
		String reverse = new StringBuilder(s).reverse().toString();
		for (int i = 0, len = s.length(); i < len; i++) {
			if (s.startsWith(reverse.substring(i))) {
				return reverse.substring(0, i) + s;
			}
		}
		return "";
	}
}
