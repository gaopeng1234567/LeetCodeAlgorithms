package com.patrick.sort.v;

import java.security.spec.DSAGenParameterSpec;
import java.util.Arrays;
import java.util.concurrent.Executors;

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
 * @date: Created in 2021/4/23 12:09 下午
 * @desc: 快速排序
 * 1、首选选择一个基准数，选择序列的第一个。 （PS:选择的规则决定了是否能优化和提升快速排序的效率）
 * 2、然后从后往前找到一个比自己小的，然后交换位置
 * 3、在从前往后找，找到一个比自己的大的，然后交换位置
 * 4、当自己到了中间不能在找的时候(也就是左边指针和右边指针相等的时候)，进行序列拆分，拆分成三个， 左边序列 基准数 右边序列
 * 5、递归1-4步骤
 * @motto: Keep It Simple and Stupid, KISS
 */
public class MyQuickSort {
	public static void main(String[] args) {
		int data[] = {9, 5, 6, 8, 0, 3, 7, 1};
		quickSort(data, 0, 7);
		System.out.println(Arrays.toString(data));
	}

	/**
	 * @param data  需要排序的序列
	 * @param left  序列的起始位置
	 * @param right 序列的结束位置
	 */
	public static void quickSort(int data[], int left, int right) {
		int base = data[left]; //一定要是序列的第一个，不是data的第一个（data[0]）
		int point1 = left; //定义两个指针，代表找的位置
		int point2 = right;//定义两个指针，代表找的位置
		while (point1 < point2) { //循环寻找比，直到point1 =point2 为止
			//从后面找比自己小的数字
			while (point1 < point2 && data[point2] > base) { //还能找&&后面的比基准数大
				point2--; //开始找倒数第二个
			}
			if (point1 < point2) { //和while中的条件结合， 那么一定是找到了比自己小的循环结束了
				int temp = data[point1];
				data[point1] = data[point2];
				data[point2] = temp;
				point1++;//自己走了，标记到下一个要比较的为止
			}
			//从前面找，比自己大的数字
			while (point1 < point2 && data[point1] <= base) { //还能找&&后面的比基准数大
				point1++; //开始找倒数第二个
			}
			if (point1 < point2) { //和while中的条件结合， 那么一定是找到了比自己小的循环结束了
				int temp = data[point1];
				data[point1] = data[point2];
				data[point2] = temp;
				point2--;//自己走了，标记到下一个要比较的为止
			}
		}
		//第一次走完了，进行拆分后的序列继续排序，进行递归
		if (left < point1)//说明左边长度还是大于1的
			quickSort(data, left, point1 - 1);
		if (point1 < right)
			quickSort(data, point1 + 1, right);
	}
}
