package com.patrick.huawei;

import java.util.HashMap;
import java.util.Map;

/**
 * ｜                 ,;,,;;
 * ｜               ,;;'(      风
 * ｜     __      ,;;' ' \     流
 * ｜  /'  '\'~~'~' \ /'\.)    堪
 * ｜ ,;(      )    /  |.      比
 * ｜,;' \    /-.,,(   ) \     丶
 * ｜    ) /       ) / )|      城
 * ｜    ||        ||  \)      管
 * ｜   (_\       (_\          希
 * @author: 城管丶希
 * @date: Created in 2021/4/9 10:56 上午
 * @desc: 统计字母个数
 * @motto: 莫遣只轮归海窟，仍留一箭射天山
 */
public class Demo3 {
	public static void main(String[] args) {
		String str = "dsadasdadasfsjk";
		int[] count = new int[26];
		str.chars().forEach(c -> {
			if (c >= 97 && c < 126) {
				count[c - 97] = count[c - 97] + 1;
			}
		});
		for (int i = 0; i < count.length; i++) {
			
		}
		System.out.println(count);
		String[] words = new String[]{"cat", "bt", "hat", "tree"};
		String chars = "atach";
		System.out.println(countCharacters(words, chars));
	}

//	public static int countCharacters(String[] words, String chars) {
//		int[] arr = new int[26];
//		for (int i = 0; i < chars.length(); i++) {
//			arr[chars.charAt(i) - 'a']++;
//		}
//		int count = 0;
//		int[] brr = new int[26];
//		for (int i = 0; i < words.length; i++) {
//			String str = words[i];
//			boolean flag = true;
//			for (int j = 0; j < str.length(); j++) {
//				char ch = str.charAt(j);
//				brr[ch - 'a']++;
//				if (brr[ch - 'a'] > arr[ch - 'a']) {
//					flag = false;
//					break;
//				}
//			}
//			if (flag) {
//				count += str.length();
//			}
//			brr = new int[26];
//		}
//		return count;
//	}

	public static int countCharacters(String[] words, String chars) {
		Map<Character, Integer> charsCnt = new HashMap<Character, Integer>();
		int length = chars.length();
		for (int i = 0; i < length; ++i) {
			char c = chars.charAt(i);
			charsCnt.put(c, charsCnt.getOrDefault(c, 0) + 1);
		}
		int ans = 0;
		for (String word : words) {
			Map<Character, Integer> wordCnt = new HashMap<Character, Integer>();
			int wordLength = word.length();
			for (int i = 0; i < wordLength; ++i) {
				char c = word.charAt(i);
				wordCnt.put(c, wordCnt.getOrDefault(c, 0) + 1);
			}
			boolean isAns = true;
			for (int i = 0; i < wordLength; ++i) {
				char c = word.charAt(i);
				if (charsCnt.getOrDefault(c, 0) < wordCnt.getOrDefault(c, 0)) {
					isAns = false;
					break;
				}
			}
			if (isAns) {
				ans += word.length();
			}
		}
		return ans;
	}
}
