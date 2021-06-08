package com.patrick.more;

import com.sun.xml.internal.rngom.digested.DPattern;

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
 * @date: Created in 2021/5/29 11:38 上午
 * @desc: [7, 1, 5, 3, 6, 4]
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 买卖股票的最佳时机 {
	public int test(int[] prices) {
		//dp思想
		// 每天价格减去之前最低的低价格，和昨天收益相比求最大
		int len = prices.length;
		int minNum = prices[0];
		prices[0] = 0;//第一天收益为0
		for (int i = 1; i < len; i++) {
			minNum = Math.min(prices[i], minNum);
			prices[i] = Math.max(prices[i] - minNum, prices[i - 1]);//当天最大收益
		}
		return prices[len - 1];
	}
}
