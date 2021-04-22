package com.patrick.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Optional;

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
 * @date: Created in 2021/4/19 3:56 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 计算字符串最后一个单词的长度 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		System.out.println("123".length());
		while ((input = bf.readLine()) != null) {
			String[] s = input.split(" ");
			if (s != null && s.length > 0) {
				System.out.println(s[s.length - 1].length());
			} else System.out.println(0);
		}
	}
}
