package com.patrick.字节;

import com.sun.tools.internal.xjc.api.S2JJAXBModel;

import java.util.Arrays;

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
 * @date: Created in 2021/5/30 3:15 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 最短回文串 {
	public static String shortestPalindrome(String s) {
		String reverse = new StringBuffer(s).reverse().toString();
		for (int i = 0; i < reverse.length(); i++) {
			if (s.startsWith(reverse.substring(i))) {
				return reverse.substring(0, i) + s;
			}
		}
		return "";
	}

	public static String shortestPalindrome2(String s) {
		String s1 = new StringBuilder(s).reverse().toString();
		for (int i = 0; i < s1.length(); i++) {
			if (s.startsWith(s1.substring(i))) {
				return s1.substring(0, i) + s;
			}
		}
		return "";
	}

	public static String shortestPalindrome1(String s) {
		int n = s.length();
		int[] fail = new int[n];
		Arrays.fill(fail, -1);
		for (int i = 1; i < n; ++i) {
			int j = fail[i - 1];
			while (j != -1 && s.charAt(j + 1) != s.charAt(i)) {
				j = fail[j];
			}
			if (s.charAt(j + 1) == s.charAt(i)) {
				fail[i] = j + 1;
			}
		}
		int best = -1;
		for (int i = n - 1; i >= 0; --i) {
			while (best != -1 && s.charAt(best + 1) != s.charAt(i)) {
				best = fail[best];
			}
			if (s.charAt(best + 1) == s.charAt(i)) {
				++best;
			}
		}
		String add = (best == n - 1 ? "" : s.substring(best + 1));
		StringBuffer ans = new StringBuffer(add).reverse();
		ans.append(s);
		return ans.toString();
	}

	public static void main(String[] args) {
		System.out.println(shortestPalindrome1("cabcd"));
		System.out.println(shortestPalindrome("aa"));
	}
}
