package com.patrick.字节;

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
 * @date: Created in 2021/5/30 11:18 上午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 等概率函数 {
	// 等概率生成1-5 1 2 3 4 5 6 7
	public static int fun() {
		return (int) (Math.random() * 7 + 1);
	}

	// 等概率生成0,1
	public static int fun1() {
		int num = 0;
		do {
			num = fun();
		} while (num == 3);
		return num > 3 ? 1 : 0;
	}

	// 等概率生成1-7
	public static int fun2() {
		int res = 0;
		do {
			res = (fun1() << 3) + (fun1() << 2) + (fun1() << 1) + fun1();
		} while (res >= 10);
		return res + 1;
	}

	public static int g(){
		int res = 0;
		while (true){
			res = (fun()-1) * 7 + fun();//0 - 49
			if (res < 40)
				break;
		}
		return  res % 10 +1;
	}

	public static void main(String[] args) {
		System.out.println(fun2());
	}
}
