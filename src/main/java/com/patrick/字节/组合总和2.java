package com.patrick.字节;

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
 * @date: Created in 2021/5/30 12:46 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 组合总和2 {
	List<Integer> list = new ArrayList<>();
	Set<List<Integer>> set = new HashSet<>();

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		//target 初始状态
		helper(candidates, 0, target);
		return new ArrayList<>(set);
	}

	private void helper(int[] candidates, int start, int target) {
		if (target == 0) { //结束状态
			set.add(new ArrayList<>(list));
			return;
		}
		for (int i = start; i < candidates.length; i++) { //遍历每一个
			if (candidates[i] > target) {
				break;
			}
			list.add(candidates[i]);
			helper(candidates, i + 1, target - candidates[i]);
			// 回到上一个状态
			list.remove(list.size() - 1);
		}
	}


}
