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
 * @date: Created in 2021/4/17 1:53 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 蛇形填数 {
	public static void main(String[] args) {
		int n = 4;
		int[][] she = new int[4][4];
		int x, y, tot;
		tot = she[x = 0][y = n - 1] = 1;
		while (tot < n * n) {
			while (x + 1 < n && she[x + 1][y] == 0)
				she[++x][y] = ++tot;
			while (y - 1 >= 0 && she[x][y - 1] == 0)
				she[x][--y] = ++tot;
			while (x - 1 >= 0 && she[x - 1][y] == 0)
				she[--x][y] = ++tot;
			while (y + 1 < n && she[x][y + 1] == 0)
				she[x][++y] = ++tot;
		}
		for (int i = 0; i < she.length; i++) {
			for (int j = 0; j < she.length; j++) {
				System.out.print("\t");
				System.out.print(she[i][j]);
			}
			System.out.println();
		}
		int count = 1;
		count = count++;
		System.out.println(count);

	}
}
