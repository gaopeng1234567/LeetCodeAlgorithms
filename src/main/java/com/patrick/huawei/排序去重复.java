package com.patrick.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
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
 * @date: Created in 2021/4/19 4:30 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 排序去重复 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while ((str = br.readLine()) != null) {
			boolean[] stu = new boolean[1001];
			StringBuilder sb = new StringBuilder();
			int n = Integer.valueOf(str);
			for (int i = 0; i < n; i++)
				stu[Integer.valueOf(br.readLine())] = true;
			for (int i = 1; i < 1001; i++) {
				if (stu[i]) {
					sb.append(i);
					sb.append("\n");
				}
			}
			sb.deleteCharAt(sb.length() - 1);
			System.out.println(sb.toString());
		}
	}


}