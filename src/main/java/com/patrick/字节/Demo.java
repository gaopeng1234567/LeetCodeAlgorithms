package com.patrick.字节;

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
 * @date: Created in 2021/5/29 6:23 下午
 * @desc: prices = [8,4,6,2,3]
 * * 如果你要买第i件商品，那么你可以得到与 prices[j] 相等的折扣，
 * * 其中j是满足j > i且prices[j] <= prices[i]的最小下标，如果没有满足条件的j，你将没有任何折扣。
 * @motto: Keep It Simple and Stupid, KISS
 */
public class Demo {
	public static int[] finalPrices(int[] prices) {
		int len = prices.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (prices[i] >= prices[j]) {
					prices[i] = prices[i] - prices[j];
					break;
				}
			}
		}
		return prices;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(finalPrices(new int[]{10, 1, 1, 6})));
	}
}
