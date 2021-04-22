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
 * @date: Created in 2021/4/9 10:18 上午
 * @desc: 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 * @motto: 莫遣只轮归海窟，仍留一箭射天山
 * 向上取整：Math.ceil(double a)
 * 向下取整：Math.floor(double a)
 * 四舍五入取整：Math.round(double a)
 */
public class Demo1 {
	public static void main(String[] args) {
		double a = 5.61231231312321;
		System.out.println(Math.round(a));
	}
}
