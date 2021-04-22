package com.patrick.huawei;

import java.io.BufferedReader;
import java.io.IOException;
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
 * @date: Created in 2021/4/19 5:55 下午
 * @desc: * a-z：97-122
 * * A-Z：65-90
 * * 0-9：48-57
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 进制转换 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		int sum = 0;
		while ((input = bf.readLine()) != null) {
			String substring = input.substring(2);
			char[] chars = substring.toCharArray();
			for (int i = chars.length - 1, j = 0; i >= 0; i--, j++) {
				if (chars[i] > 57) {
					sum += Math.pow(16, j) * (chars[i] - 'A' + 10);
				} else
					sum += Math.pow(16, j) * (chars[i] - 48);
			}
			System.out.println(sum);
			sum = 0;
		}
	}
}
