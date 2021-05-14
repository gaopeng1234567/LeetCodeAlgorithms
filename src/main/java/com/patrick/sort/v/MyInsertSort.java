package com.patrick.sort.v;

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
 * @date: Created in 2021/4/23 10:38 上午
 * @desc: 插入排序 只做数据的位置移动
 * 1、首先将给的这个序列分为2部分，有序和带插入
 * 2、然后进行后续的数字的读取然后和有序的比较，比较采取尾比较
 * 3、直到获取完毕即可
 * @motto: Keep It Simple and Stupid, KISS
 */
public class MyInsertSort {
	public static void main(String[] args) {
		int data[] = {9, 5, 6, 8, 0, 3, 7, 1};
		int n = data.length;
		for (int i = 1; i < n; i++) { //为什么从1开始？其实就是将 0-1认为是有序的，1-n之间的是无序的
			int target = data[i];//这个就是准备要插入有序序列的数字
			int j = i - 1; //把这个参数提出来，是为了记录当前有序序列中比较到哪一个了，后面用
			for (; j >= 0; j--) { //从有序序列中的尾部进行比较
				if (target < data[j]) {//小，那么进行位置后移
					data[j + 1] = data[j]; // 大的往后走一个，不要担心我们target值丢失，因为你已经保存到target中了，后面赋值就行
				} else break;//比有序的最大的都大，那么原地不动，同时结束循环。
			}
			data[j + 1] = target; //因为j--了，所以+1  j是代表有序数列中的位置，i是代表无序数列中的位置，所以不能用i
		}
		System.out.println(Arrays.toString(data));
	}
}
