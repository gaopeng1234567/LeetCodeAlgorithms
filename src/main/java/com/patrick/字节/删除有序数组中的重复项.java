package com.patrick.字节;

import java.util.ArrayList;

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
 * @date: Created in 2021/5/30 1:46 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 删除有序数组中的重复项 {
	public static int removeDuplicates(int[] nums) {
		int index = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[j - 1]) {
				index++;
				nums[index] = nums[j];
			}
		}
		return index + 1;
	}

	public static void main(String[] args) {
		removeDuplicates(new int[]{1, 1, 2});
	}
}
