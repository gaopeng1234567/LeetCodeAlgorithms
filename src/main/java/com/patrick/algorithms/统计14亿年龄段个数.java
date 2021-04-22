package com.patrick.algorithms;

import java.io.*;

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
 * @date: Created in 2021/4/13 3:03 下午
 * @desc:
 * @motto: 生平不知李二狗，学好并发也枉然
 */
public class 统计14亿年龄段个数 {
	public static void main(String[] args) throws IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(""));
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		int[] age = new int[200];
		String str = null;
		while ((str = bufferedReader.readLine()) != null) {
			Integer integer = Integer.valueOf(str);
			age[integer]++;
		}
	}
}
