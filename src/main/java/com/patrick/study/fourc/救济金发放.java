package com.patrick.study.fourc;

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
 * @date: Created in 2021/4/18 11:15 上午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 救济金发放 {
	static int[] people;
	static int n;

	public static void main(String[] args) {

		n = 10; // 一圈多少人
		int m = 4; // 官员1走多少步
		int k = 3; // 官员2走多少步
		people = new int[n * 2]; // 存放人 0代表已经发完了
		for (int i = 1; i <= n; i++) people[i] = i; //初始化数据

		int left = n; //还剩下多少人
		int p1 = n, p2 = 1; //俩人当前的位置
		while (left != 0) {
			p1 = go(p1, 1, m);
			p2 = go(p2, -1, k);
			System.out.print(people[p1]);
			left--;
			if (p1 != p2) {
				System.out.print(people[p2]);
				left--;
			}
			//把p1,p2当前位置清空
			people[p1] = people[p2] = 0;
			if (left != 0)
				System.out.print(",");
		}
	}

	/**
	 * 一旦调用，必然能选出一个来
	 * @param p 当前指针位置
	 * @param d 前进或者后退 +1， -1 每次往前走一个， 那么第一个要向前走自然是先从末尾开始，而向后走的先从队首开始
	 * @param t 走多少步
	 * @return 走之后的位置
	 */
	public static int go(int p, int d, int t) {
		// 走路，并且跳过当前位置值为0的
		while (t-- != 0) { // 走m或者k 步
			do {
				p = (p + d + n - 1) % n + 1; // 后面这个加1是 由于数组下表从0开始的，而我们是从1开始放入数据的
			} while (people[p] == 0);
		}
		return p;
	}
}
