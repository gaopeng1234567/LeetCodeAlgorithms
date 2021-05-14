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
 * @date: Created in 2021/4/23 10:03 上午
 * @desc: 归并排序
 * 1、先进行拆分、将一个数组拆分到最小，也就是长度为1（这里每必要开辟多个数组，一个数组即可，可以采用几个游标来表示当前拆分的情况）
 * 2、当拆分到长度为1的时候，这个时候开始进行归的操作， 1：1 ==> 2：2==> 4:4。。。。
 * 3、最终归并完成后结束
 * @motto: Keep It Simple and Stupid, KISS
 */
public class MyMergeSort {
	public static void main(String[] args) {
		int data[] = {9, 5, 6, 8, 0, 3, 7, 1};
		splitArray(data, 0, data.length - 1);
		System.out.println(Arrays.toString(data));
	}

	/**
	 * 这几个参数尤为重要
	 * @param data  要拆分的序列，也就是要被排序的序列
	 * @param left  标志拆分后的数组的最左边位置          == 因为是递归拆分，所以这个值有很多，也代表了利用一个数组进行拆分
	 * @param right 标志拆分后的数组的最右边位置          == 因为是递归拆分，所以这个值有很多，也代表了利用一个数组进行拆分
	 */
	public static void splitArray(int data[], int left, int right) {//既然你要拆分，那么怎么拆分？ 长度/2，直到长度为1的时候就说明已经拆分完毕了
		if (left < right) { //说明还能拆分，如果相等了的话就不行了，说明已经只有一个了
			int mid = (left + right) / 2; //这个参数要理解，表示每次从哪里拆分，拆分完毕后他又是下一个序列的**最后一个**
			splitArray(data, left, mid);//递归拆分左边的  此时mid表示左边序列的最后一个
			splitArray(data, mid + 1, right);//递归拆分右边的  此时mid+1表示右边序列的第一个
			//当递归拆分完毕时候，开始合并，那么执行到最后这一步合并时候，一定是 1：1 的合并
			merge(data, left, mid, right);
		}
	}

	/**
	 * 这里进行合并操作，参数也要理解到位。 这里合并的是什么？一定是两个有序序列 1：1 2：2 。。。。
	 * @param data  要拆分的序列，也就是要被排序的序列
	 * @param left  从那个地方开始合并
	 * @param mid   mid 尤为关键的一个参数、也是提升效率的一个参数，在他的两边，一定是一个拍好序的列表，但是1：1开始的时候是第一次，mid=0¬¬
	 * @param right 最小序列的最后面(并不是整个序列的，是从底向上归并)
	 */
	public static void merge(int data[], int left, int mid, int right) {
		//采用插入排序的思想，但此时可以采用一个零时数组存放比较后的结果，最后替换掉原来data中的数据
		int temp[] = new int[data.length];
		int point1 = left;   //很关键的指针，这个表示左边序列的第几个数据，一开始肯定从第一个比较
		int point2 = mid + 1; //这个表示右边序列的第一个数据
		int loc = left; //记录该往temp中那个地方放入
		while (point1 <= mid && point2 <= right) { //这里的条件，就是表明左边序列从第一个开始一直到最后一个，右边序列也是从自己的第一个到最后一个
			if (data[point1] < data[point2]) {//如果是第一次的话 =>左边第一个小于右边的第一个
				temp[loc] = data[point1];
				point1++; //左边第一个败下阵来，那么左边继续往后找一个更大的和右边战斗
				loc++; //临时数组存放了一个了，往后移动
			} else { //这个应该能理解吧
				temp[loc] = data[point2];
				point2++;
				loc++;
			}
		}
		//到此就循环比较完毕，但是存在一个问题，就是可能左边或者右边序列，较大的那个数字没有放入temp中
		// 7 8   1 3 你可以想象一下这俩序列进行比较 你会发现temp里面只有两个数据，point1的游标一直没有++
		while (point1 <= mid) {
			temp[loc++] = data[point1++];
		}
		while (point2 <= right) {
			temp[loc++] = data[point2++];
		}
		//最后将temp中的拍好的序列返回给data中 注意数据开始和结束位置。
		for (int i = left; i <= right; i++) {
			data[i] = temp[i];
		}
	}
}
