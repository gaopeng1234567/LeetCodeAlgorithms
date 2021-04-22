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
 * @date: Created in 2021/4/19 5:22 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 超了切割 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] a = {"", "0", "00", "000", "0000", "00000", "000000", "0000000", "00000000"};
		String input = null;
		while ((input = bf.readLine()) != null) {
			for (int i = 0, j = 1, len = input.length() / 8 + 1; i < len; i++, j++) {
				String substring = input.substring(i * 8, Math.min(j * 8, input.length()));
				if (substring.length() > 7)
					System.out.println(substring);
				else if (substring.length() > 0)
					System.out.println(substring + a[8 - substring.length() % 8]);
			}

		}
	}
}
