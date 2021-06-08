package com.patrick.more;

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
 * @date: Created in 2021/5/29 11:29 上午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 无重复字符的最长子串 {
	public static int test(String target) {
		//滑动窗口起始位置
		int start = 0;
		int maxLen = 0;
		//存放上一个元素出现的位置+1
		int[] temp = new int[128];
		int len = target.length();
		for (int i = 0; i < len; i++) {
			int index = target.charAt(i);
			start = Math.max(start, temp[index]);
			maxLen = Math.max(maxLen, i - start + 1);
			temp[index] = i + 1;
		}
		return maxLen;
	}

	public static void main(String[] args) {
		System.out.println(test("pwwkew"));
	}
}
