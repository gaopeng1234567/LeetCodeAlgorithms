package com.patrick.huawei;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

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
 * @date: Created in 2021/4/19 4:02 下午
 * @desc: 1
 * a-z：97-122
 * A-Z：65-90
 * 0-9：48-57
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 输出输入字符串中含有该字符的个数 {
	public static void main(String[] args) throws Exception {
		int[] temp = new int[200];
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input = bf.readLine();
		char[] chars = input.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] > 90)
				temp[chars[i] - 32]++;
			else temp[chars[i]]++;
		}
		char res = bf.readLine().charAt(0);
		if (res > 90)
			System.out.println(temp[res - 32]);
		else System.out.println(temp[res]);
	}
}
