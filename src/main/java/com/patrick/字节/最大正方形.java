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
 * @date: Created in 2021/5/31 2:18 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 最大正方形 {
	public static int maximalSquare(char[][] matrix) {
		int maxSquare = 0;
		int len = matrix.length;

		if (len == 0) {
			return maxSquare;
		}
		int len1 = matrix[0].length;
		int[][] dp = new int[len][len1];
		for (int i = 0; i < len; i++) { // x
			for (int j = 0; j < len1; j++) { //y
				if (matrix[i][j] == '1') {
					if (i == 0 || j == 0) {
						dp[i][j] = 1;
					} else {
						dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
					}
					maxSquare = Math.max(maxSquare, dp[i][j]);
				}
			}
		}

		return maxSquare * maxSquare;
	}

	public static void main(String[] args) {
		System.out.println(maximalSquare(new char[][]{{'0','1'}}));
	}


}
