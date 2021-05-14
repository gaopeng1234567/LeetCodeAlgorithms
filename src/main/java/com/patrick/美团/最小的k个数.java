package com.patrick.美团;

import java.util.Arrays;

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
 * @date: Created in 2021/5/13 2:16 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 最小的k个数 {
	public static void main(String[] args) {
		int[] temp = {0, 1, 2, 1};
		getLeastNumbers1(temp, 1);
	}

	public int[] getLeastNumbers(int[] arr, int k) {
		Arrays.sort(arr);
		return Arrays.copyOfRange(arr, 0, k);
	}

	public static int[] getLeastNumbers1(int[] arr, int k) {
		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j =0; j < arr.length - 1 - i; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					flag = true;
				}
			}
			if (i >= k) {
				break;
			}
			if (flag) {
				break;
			}
		}
		return Arrays.copyOfRange(arr, arr.length - k, arr.length);
	}
}
