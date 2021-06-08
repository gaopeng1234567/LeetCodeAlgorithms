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
 * @date: Created in 2021/5/31 5:32 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 无重复字符的最长子串 {
	public int lengthOfLongestSubstring(String s) {

		int lenS = s.length();
		int start = 0;
		int[] temp = new int[128];
		int maxLen = 0;
		for (int i = 0; i < lenS; i++) {
			int index = s.charAt(i);
			start = Math.max(start, temp[index]);
			maxLen = Math.max(maxLen, i - start + 1);
			temp[index] = i + 1; //这个字母应该出现的位置
		}
		return maxLen;
	}
}
