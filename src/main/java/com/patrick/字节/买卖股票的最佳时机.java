package com.patrick.字节;

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
 * @date: Created in 2021/5/28 11:44 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 买卖股票的最佳时机 {
	public static int maxProfit(int[] prices) {
		int min = prices[0];
		int n = prices.length;
		prices[0] = 0;
		for (int i = 1; i < n; i++) {
			min = Math.min(min, prices[i]);
			prices[i] = Math.max(prices[i] - min, prices[i - 1]);
		}
		return prices[n - 1];
	}

	public static void main(String[] args) {
		System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
	}

}
