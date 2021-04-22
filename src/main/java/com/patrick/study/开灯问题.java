package com.patrick.study;

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
 * @date: Created in 2021/4/17 1:40 下午
 * @desc: n盏灯、k个人，第一个人全开，第二个人开*2，第三个人开*3
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 开灯问题 {
	public static void main(String[] args) {
		int n, k;
		n = 7;
		k = 4;
		int[] ints = new int[n]; //n盏灯
		for (int i = 1; i < k + 1; i++) { //分别操作k此
			for (int j = 1; j < n + 1; j++) { //开关灯
				if (j % i == 0) { // 是这个人的倍数，可以关灯
					if (ints[j - 1] == 0) {
						ints[j - 1] = 1;
					} else ints[j - 1] = 0;
				}
			}
		}
		for (int i = 0; i < ints.length; i++) {
			if (ints[i] == 1)
				System.out.println(i+1);
		}

	}
}
