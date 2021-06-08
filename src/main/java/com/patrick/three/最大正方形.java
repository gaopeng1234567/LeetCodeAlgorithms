package com.patrick.three;

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
 * @date: Created in 2021/6/1 12:20 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 最大正方形 {
	public int maximalSquare(char[][] matrix) {
		//dp 思想
		//状态转移方程  dp[i][j] = math (math.min(dp[i][j-1],dp[i-1][j]), dp[i-1][]j-1 ) + 1
		int maxSide = 0;
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return maxSide;
		}
		int lengthX = matrix.length;
		int lengthY = matrix[0].length;
		int[][] dp = new int[lengthX][lengthY];
		int max = 0;
		for (int i = 0; i < lengthX; i++) {
			for (int j = 0; j < lengthY; j++) {
				if (matrix[i][j] == '1') {
					if (i == 0 || j == 0) {
						dp[i][j] = 1;
					} else {
						dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]) + 1;
					}
					max = Math.max(max, dp[i][j]);
				}
			}
		}
		return max * max;
	}
}
