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
 * @date: Created in 2021/4/19 6:28 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 句子逆序 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		StringBuffer sb = new StringBuffer();
		while ((input = bf.readLine()) != null) {
			String[] s = input.split(" ");
			for (int i = s.length - 1; i >= 0; i--) {
				sb.append(s[i]+ " ");
			}
			System.out.println(sb.toString());
		}
	}
}
