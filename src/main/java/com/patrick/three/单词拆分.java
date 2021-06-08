package com.patrick.three;

import java.util.Arrays;
import java.util.List;

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
 * @date: Created in 2021/6/1 1:10 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 单词拆分 {

	public static boolean wordBreak(String s, List<String> wordDict) {
		//dp 思想
		int length = s.length();
		boolean[] dp = new boolean[length + 1];
		dp[0] = true;// 空串一定包含
		for (int i = 1; i <= length; i++) {
			for (int j = 0; j < i; j++) {
				if (dp[j] && wordDict.contains(s.substring(j, i))) {
					dp[i] = true;
					break;
				}
			}
		}
		return dp[length];
	}

	public static void main(String[] args) {
		System.out.println(wordBreak("leetcode", Arrays.asList("leet", "code")));
	}
}
