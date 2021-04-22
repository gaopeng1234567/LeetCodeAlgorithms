package com.patrick.study.tx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
public class 赚取报酬V2 {
	public static void main(String[] args) {
//		int[] startTime = {1, 2, 3, 4, 6}, endTime = {3, 5, 10, 6, 9}, profit = {20, 20, 100, 70, 60};
//		int[] startTime = {1, 2, 3, 3}, endTime = {3, 4, 5, 6}, profit = {50, 10, 40, 70};
//		int[] startTime = {1, 1, 1}, endTime = {2, 3, 4}, profit = {5, 6, 4};
		int[] startTime = {24, 24, 7, 2, 1, 13, 6, 14, 18, 24}, endTime = {27, 27, 20, 7, 14, 22, 20, 24, 19, 27}, profit = {6, 1, 4, 2, 3, 6, 5, 6, 9, 8};
		System.out.println(jobScheduling(startTime, endTime, profit));
	}

	public static int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
		int nums = startTime.length;
		Work[] works = new Work[nums];
		for (int i = 0; i < nums; i++) {
			works[i] = new Work(startTime[i], endTime[i], profit[i]);
		}
		Arrays.sort(works, null);
		int[] res = new int[nums];
		for (int i = 0; i < nums; i++) {//每一个坑位只做自己的job的收益
			if (i == 0) {
				res[i] = works[i].profit;
			} else
				res[i] = Math.max(works[i].profit, res[i - 1]);
		}
		for (int i = 1; i < nums; i++) {
			for (int j = i; j > 0; j--) {
				if (works[i].start >= works[j - 1].end) {
					res[i] = Math.max(works[i].profit + res[j - 1], res[i - 1]);
					break;
				}
			}
		}
		return res[nums - 1];
	}


	public static class Work implements Comparable<Work> {
		private int start;
		private int end;
		private int profit;

		@Override
		public int compareTo(Work o) {
			if (this.end >= o.getEnd())
				return 1;
			return -1;
		}

		public Work(int start, int end, int profit) {
			this.start = start;
			this.end = end;
			this.profit = profit;
		}

		public int getStart() {
			return start;
		}

		public void setStart(int start) {
			this.start = start;
		}

		public int getEnd() {
			return end;
		}

		public void setEnd(int end) {
			this.end = end;
		}

		public int getProfit() {
			return profit;
		}

		public void setProfit(int profit) {
			this.profit = profit;
		}

	}
}
