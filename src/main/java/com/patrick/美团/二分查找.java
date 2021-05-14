package com.patrick.美团;

import java.util.Arrays;

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
 * @date: Created in 2021/5/12 3:36 下午
 * @desc: 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 二分查找 {
	public static void main(String[] args) {
		int[] temp = {-1, 0, 3, 5, 9, 12};
		System.out.println(search1(temp, 0));
	}

	public static int search1(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;

		while (low <= high) {
			int mid = (low + high) >> 1;
			int midVal = nums[mid];

			if (midVal < target)
				low = mid + 1;
			else if (midVal > target)
				high = mid - 1;
			else
				return mid; // key found
		}
		return -1;  // key not found.
	}

	public static int search(int[] nums, int target) {
		int i = Arrays.binarySearch(nums, target);
		return i < 0 ? -1 : i;
	}
}
