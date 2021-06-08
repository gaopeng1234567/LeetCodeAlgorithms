package com.patrick.字节;

import java.util.ArrayList;
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
 * @date: Created in 2021/5/29 2:45 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 全排列 {
	public static List<List<Integer>> pailie(int[] nums) {
		int len = nums.length;

		boolean[] used = new boolean[len];
		List<Integer> path = new ArrayList<>();

		List<List<Integer>> list = new ArrayList();
		dfs(nums, len, 0, used, path, list);
		return list;
	}

	private static void dfs(int[] nums, int len, int depth, boolean[] used, List<Integer> path, List<List<Integer>> list) {
		if (depth == len) {
			list.add(new ArrayList(path));
		}
		for (int i = 0; i < len; i++) {
			if (!used[i]) {
				path.add(nums[i]);
				used[i] = true;
				dfs(nums, len, depth + 1, used, path, list);
				used[i] = false;
				path.remove(path.size() - 1);
			}
		}
	}


	public static void main(String[] args) {
		System.out.println(pailie(new int[]{1, 2, 3}));
	}
}
