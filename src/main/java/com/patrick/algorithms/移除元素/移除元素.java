package com.patrick.algorithms.移除元素;


/**
 * @author patrick
 * @date 2021/1/18 10:48 上午
 * @Des 移除元素
 * 最簡單的事是堅持，最難的事還是堅持
 */
public class 移除元素 {
	public static void main(String[] args) {
//		int[] nums = {3, 2, 2, 3};
		int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
//        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
//        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
		System.out.println(removeElement1(nums, 2));
	}

	public static int removeElement(int[] nums, int val) {
		int length = nums.length;
		int count = 0;
		for (int i = 0; i < length - count; i++) {
			if (nums[i] != val) continue;
			count++;
			//存在一样的  // 整体往前面移动  最后把val放入末尾
			for (int j = i; j < length - 1; j++) {
				nums[j] = nums[j + 1];
			}
			i--;
		}
		return length - count;
	}

	public static int removeElement1(int[] nums, int val) {
		if (nums == null || nums.length == 0)
			return 0;
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[j] = nums[i];
				j++;
			}
		}
		return j;
	}
}
