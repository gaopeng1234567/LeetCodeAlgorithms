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
 * @date: Created in 2021/4/20 12:26 下午
 * @desc: 双十一马上就要来了，小C心目中的女神在购物车加了N个东西，
 * 突然她中了一个奖可以清空购物车5000元的东西（不能找零），每个东西只能买一件，
 * 那么她应该如何选择物品使之中奖的额度能最大利用呢？如果存在多种最优组合你只需要给出一种即可，嘿嘿 现在女神来问你，你该怎么办？
 * <p>
 * 首先要举例子，发现贪心好像在一些情况下不合适
 * 2000 3000 4000 从小到大排序  ===> 最优
 * 1500 2000 4000 从小到大排序  ===> 3500 < 4000 不是最优
 * <p>
 * 4000 2000 1500 从大到小排序  ===> 4000 最优
 * 4000 3000 2000 从大到小排序  ===> 4000 < 5000 不是最优
 * 此时应该使用动态规划，但是如果想不出来，也可以用贪心，因为有时候他也是正确的
 * 可以尝试贪心: 从大到小排序 + 从小到大排序 取最优化
 * <p>
 * 正确解: 背包问题
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 购物车 {
	public static void main(String[] args) {
		int cartNum = 9; // 购物车商品总数
		int[] cart = {8, 20, 48, 40, 7, 31, 55, 3, 13};
		int total = 69;
		int[][] dp = new int[cartNum + 1][total + 1];
		//添加商品
		for (int i = 1; i <= cartNum; i++) { //添加商品
			for (int j = 1; j <= total; j++) { //拆分背包，此时拆分total 20
				if (cart[i - 1] <= j) { //判断能否放入
					//计算当前dp 最优值
					int a = cart[i - 1] + dp[i - 1][j - cart[i - 1]];//计算当前值 当前值 + 剩余背包重量
					int b = dp[i - 1][j];  //上一个值
					dp[i][j] = Math.max(a, b);
				} else
					dp[i][j] = dp[i - 1][j];
			}
		}
		System.out.println(dp[cartNum][total]);
		int last = total;
		for (int i = cartNum; i > 0; i--) {
			if (dp[i][last] != dp[i - 1][last]) {
				System.out.print("购物:" + cart[i - 1] + "\t");
				last -= cart[i - 1];
			}
		}

	}
}
