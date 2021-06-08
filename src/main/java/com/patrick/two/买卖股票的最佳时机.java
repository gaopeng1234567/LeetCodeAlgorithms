package com.patrick.two;

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
 * @date: Created in 2021/5/31 5:52 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 买卖股票的最佳时机 {
	public int maxProfit(int[] prices) {

		int minNum = prices[0];
		prices[0] = 0;
		int lenP = prices.length;
		for (int i = 1; i < lenP; i++) {
			minNum = Math.min(minNum, prices[i]);
			prices[i] = Math.max(prices[i - 1], prices[i] - minNum);
		}
		return prices[lenP - 1];
	}
}
