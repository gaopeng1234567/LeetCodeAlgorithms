package com.patrick.study.tx;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;

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
public class 赚取报酬 {
	public static void main(String[] args) {
//		int[] startTime = {1, 2, 3, 4, 6}, endTime = {3, 5, 10, 6, 9}, profit = {20, 20, 100, 70, 60};
//		int[] startTime = {1, 2, 3, 3}, endTime = {3, 4, 5, 6}, profit = {50, 10, 40, 70};
//		int[] startTime = {1, 1, 1}, endTime = {2, 3, 4}, profit = {5, 6, 4};
		int[] startTime = {24, 24, 7, 2, 1, 13, 6, 14, 18, 24}, endTime = {27, 27, 20, 7, 14, 22, 20, 24, 19, 27}, profit = {6, 1, 4, 2, 3, 6, 5, 6, 9, 8};
		System.out.println(jobScheduling(startTime, endTime, profit));
	}

	public static int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
		int nums = startTime.length;
		ArrayList<Work> works = new ArrayList<>();
		for (int i = 0; i < startTime.length; i++) {
			works.add(new Work(startTime[i], endTime[i], profit[i], profit[i]));
		}
		Collections.sort(works, null);
		for (int i = 0; i < nums; i++) {
			Work work = works.get(i);
			// 要获取当前结束时间之前的最大收益 也就是在这个任务之前可以完成的任务 startTime > lastEndTime
			int profitNum = 0;
			for (int j = i; j > 0; j--) {
				if (work.getStart() >= works.get(j - 1).getEnd()) {
					profitNum = works.get(j - 1).getMaxProfit();
					break;
				}
			}
			if (profitNum > 0) {
				int profit1 = profitNum + work.getProfit();
				int profitLast = works.get(i - 1).getMaxProfit();
				work.setMaxProfit(Math.max(profit1, profitLast));

			} else {
				if (i >= 1) {
					work.setMaxProfit(Math.max(work.getProfit(), works.get(i - 1).getMaxProfit()));
				} else
					work.setMaxProfit(work.getProfit());
			}
		}
		Work work = works.get(nums - 1);
		return work.getMaxProfit();
	}

	public static int find(List<Work> list, int key, int lo, int hi) {
		if (hi < lo)
			return lo;
		int mid = lo + (hi - lo) / 2;
		int cmp = Integer.compare(key, list.get(mid).getEnd());
		if (cmp < 0)
			return find(list, key, lo, mid - 1);
		else if (cmp > 0)
			return find(list, key, mid + 1, hi);
		else
			return mid;

	}

	public static class Work implements Comparable<Work> {
		private int start;
		private int end;
		private int profit;
		private int maxProfit;

		@Override
		public int compareTo(Work o) {
			if (this.end >= o.getEnd())
				return 1;
			return -1;
		}

		public Work(int start, int end, int profit, int maxProfit) {
			this.start = start;
			this.end = end;
			this.profit = profit;
			this.maxProfit = maxProfit;
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

		public int getMaxProfit() {
			return maxProfit;
		}

		public void setMaxProfit(int maxProfit) {
			this.maxProfit = maxProfit;
		}
	}
}
