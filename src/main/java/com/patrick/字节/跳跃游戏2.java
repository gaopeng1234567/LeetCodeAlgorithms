package com.patrick.字节;

import com.sun.java.swing.action.NextAction;

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
 * @date: Created in 2021/5/30 2:03 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 跳跃游戏2 {
	public static int jump(int[] nums) {
		int jump = 0, curr = 0, next = 0;
		for (int i = 0,len = nums.length; i < len; i++) {
			if(curr >= len){
				break;
			}
			if (i > curr) {
				jump++;
				curr = Math.max(next, curr);
			}
			next = Math.max(next, i + nums[i]);
		}
		return jump;
	}

	public static void main(String[] args) {
		System.out.println(jump(new int[]{2, 3, 1, 1, 4}));
	}
}
