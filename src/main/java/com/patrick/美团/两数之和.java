package com.patrick.美团;

import java.util.HashMap;
import java.util.Map;

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
 * @date: Created in 2021/5/12 3:30 下午
 * @desc: 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 两数之和 {
	public static void main(String[] args) {
		int[] nums = new int[]{2, 7, 11, 15};
		int[] ints = twoSum(nums, 13);
		for (int anInt : ints) {
			System.out.println(anInt);
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> container = new HashMap<>();
		container.put(nums[0], 0);
		for (int i = 1; i < nums.length; i++) {
			if (container.containsKey(target - nums[i])) {
				return new int[]{container.get(target - nums[i]), i};
			} else container.put(nums[i], i);
		}
		return new int[0];
	}
}
