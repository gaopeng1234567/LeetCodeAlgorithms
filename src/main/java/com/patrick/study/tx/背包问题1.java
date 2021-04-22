package com.patrick.study.tx;

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
 * @date: Created in 2021/4/20 12:32 下午
 * @desc: 小偷去某商店盗窃，背有一个背包，容量是50kg，现在有以下物品（物品不能切分,且只有一个），请问小偷应该怎么拿才能得到最大的价值？
 * 重量    价值
 * 物品1   10kg    60元   60 / 10 = 6
 * 物品2   20kg    100元   100/20 = 5
 * 物品3   40kg    120元   120/40 = 3
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 背包问题1 {
	public static void main(String[] args) {
		int[] weight = {8, 1, 4, 5, 7, 3, 5, 3, 13};
		int w = 50; //背包
		int n = 9; //商品
		int[][] dp = new int[n + 1][w + 1]; // 00位置都是0
		for (int i = 1; i <= n; i++) { //每次添加的物品
			for (int j = 1; j <= w; j++) { //拆分重量，从1kg开始 分割的重量
				//判断能不能放下
				if (weight[i - 1] <= j) { //能放下
					//当前物品+剩余空间 和 上一个物品价值做比较，取最大
					dp[i][j] = Math.max(
							weight[i - 1] + dp[i - 1][j - weight[i - 1]],
							dp[i - 1][j]);
				} else
					dp[i][j] = dp[i - 1][j];//放不下，取上一个物品的重量
			}
		}
		System.out.println(dp[n][w]);
		System.out.println("求解路径");
	}
}
