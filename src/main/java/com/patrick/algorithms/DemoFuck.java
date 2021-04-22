package com.patrick.algorithms;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

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
 * @date: Created in 2021/4/20 4:25 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class DemoFuck {
	public static void main(String[] args) {
		int[] startTime = {1, 2, 3, 4, 6}, endTime = {3, 5, 10, 6, 9}, profit = {20, 20, 100, 70, 60};
//		int[] startTime = {1, 2, 3, 3}, endTime = {3, 4, 5, 6}, profit = {50, 10, 40, 70};
		System.out.println(jobScheduling(startTime, endTime, profit));
	}

	public static int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
		int nums = startTime.length;
		ArrayList<Work> works = new ArrayList<>();

		for (int i = 0; i < startTime.length; i++) {
			works.add(new Work(startTime[i], endTime[i], profit[i]));
		}
		Collections.sort(works, null);
		Integer maxEnd = works.stream().max(Comparator.comparingInt(Work::getEnd)).map(Work::getEnd).get();
		int total = maxEnd - works.get(0).getStart();
		int[][] dp = new int[nums + 1][total + 1];

		for (int i = 1; i <= nums; i++) {
			for (int j = 1; j <= total; j++) {
				Work work = works.get(i - 1);
				int weigth = work.getEnd() - work.getStart();
				if (weigth <= j) {
					//求出在他前面，并且收益最高的
					int start = work.getStart();
					int maxProfit = works.stream().filter((work1) -> work1.getEnd() <= start).max(Comparator.comparingInt(Work::getProfit)).orElse(new Work(1, 2, 0)).getProfit();
					dp[i][j] = Math.max(work.getProfit() + maxProfit, dp[i - 1][j]);
				} else dp[i][j] = dp[i - 1][j];
			}
		}
		return dp[nums][nums];
	}

	@Data
	@AllArgsConstructor
	public static class Work implements Comparable<Work> {
		private int start;
		private int end;
		private int profit;

		@Override
		public int compareTo(Work o) {
			if (this.start >= o.getStart())
				return 1;
			return -1;
		}
	}
}
