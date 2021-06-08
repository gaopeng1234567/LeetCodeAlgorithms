package com.patrick.字节;

import com.patrick.algorithms.ArrayDemo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
 * @date: Created in 2021/5/29 4:11 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 最小覆盖子串 {

	public static String minWindow(String s, String t) {
		int[] help = new int[128];
		for (char ch : t.toCharArray()) help[ch]++;
		int left = 0, right = 0, minSize = Integer.MAX_VALUE;
		String res = "";
		int count = t.length();
		while (right < s.length()) {
			char ch = s.charAt(right);
			if (help[ch] > 0) count--;
			help[ch]--;
			while (count == 0) { //如果移动到了合适的窗口
				if (right - left + 1 < minSize) {
					minSize = right - left + 1;
					res = s.substring(left, right + 1);//更新结果
				}
				ch = s.charAt(left);
				if (help[ch] == 0) count++;
				help[ch]++;
				left++; //缩小窗口直至count!=0
			}
			right++;
		}
		return res;
	}

	public static String listToString(List<String> list) {
		return String.join("", list);
	}

	public static void main(String[] args) {
		System.out.println(minWindow("bbaa", "aba"));

	}
}
