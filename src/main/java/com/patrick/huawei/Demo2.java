package com.patrick.huawei;

/**
 * ｜                 ,;,,;;
 * ｜               ,;;'(      风
 * ｜     __      ,;;' ' \     流
 * ｜  /'  '\'~~'~' \ /'\.)    堪
 * ｜ ,;(      )    /  |.      比
 * ｜,;' \    /-.,,(   ) \     丶
 * ｜    ) /       ) / )|      城
 * ｜    ||        ||  \)      管
 * ｜   (_\       (_\          希
 * @author: 城管丶希
 * @date: Created in 2021/4/9 10:31 上午
 * @desc: 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
 * @motto: 莫遣只轮归海窟，仍留一箭射天山
 */
public class Demo2 {
	public static void main(String[] args) {
		int a = 10;
		int count = 0;
		String s = Integer.toBinaryString(a);
//		方法1 利用jdk方法，然后替换求长度
		System.out.println(s.replace("0", "").length());
		//方法2 循环取模
		while (a != 0) {
			if (a % 2 != 0) {
				count++;
			}
			a /= 2;
			System.out.println(a % 2);
		}
		System.out.println(count);
		//方法三  &运算搭配 右移
		int c = 10;
		int count1 = 0;
		while (c > 0) {
			if ((c & 1) == 1) {
				count1++;
			}
			c = c >> 1;
		}
		System.out.println(count1);
	}
}
