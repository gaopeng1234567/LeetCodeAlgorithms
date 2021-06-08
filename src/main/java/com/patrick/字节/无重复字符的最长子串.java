package com.patrick.字节;

import java.sql.SQLOutput;
import java.util.ArrayList;
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
 * @date: Created in 2021/5/28 11:59 上午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 无重复字符的最长子串 {
	public static int lengthOfLongestSubstring(String s) {
		// 记录字符上一次出现的位置
		int[] last = new int[128];
		for (int i = 0; i < 128; i++) {
			last[i] = 0;
		}
		int n = s.length();

		int res = 0;
		int start = 0; // 窗口开始位置
		for (int i = 0; i < n; i++) {
			int index = s.charAt(i);
			start = Math.max(start, last[index]);
			res = Math.max(res, i - start + 1);
			last[index] = i;
		}

		return res;
	}

	public static int lengthOfLongestSubstringMy(String s) {
		int[] temp = new int[128];
		int n = s.length();
		int res = 0;
		int start = 0;
		for (int i = 0; i < n; i++) {
			int index = s.charAt(i);
			start = Math.max(start, temp[index]);
			res = Math.max(res, i - start + 1);
			temp[index] = i + 1;
		}

		return res;
	}

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstringMy("pwwkew"));
	}
}
