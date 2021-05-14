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
 * @date: Created in 2021/5/12 10:41 上午
 * @desc: 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * 输出：[1,2,2,3,5,6]
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 合并两个有序数组 {
	public static void main(String[] args) {
		int[] num1 = {0}, num2 = {1};
		merge(num1, 0, num2, 1);
		for (int i = 0; i < num1.length; i++) {
			System.out.println(num1[i]);
		}
	}

	/**
	 * 手写，将nums2中的合并到nums1中
	 * @param nums1
	 * @param m
	 * @param nums2
	 * @param n
	 */
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		for (int i = 0; i < n; i++) {
			if (m == 0) {
				nums1[i] = nums2[i];
			} else {
				int point = m + i;
				for (int j = point; j > 0; j--) {//想后比
					if (nums2[i] >= nums1[j - 1]) {
						nums1[j] = nums2[i];
						break;//推出，有序
					} else {
						nums1[j] = nums1[j - 1];
						nums1[j - 1] = nums2[i];
					}
				}
			}
		}

	}

	/**
	 * 采用系统方法
	 * @param nums1
	 * @param m
	 * @param nums2
	 * @param n
	 */
	public static void merge1(int[] nums1, int m, int[] nums2, int n) {
		//将2从0开始拷贝到1中的m开始，拷贝n个
		System.arraycopy(nums2, 0, nums1, m, n);
		Arrays.sort(nums1);
	}
}
