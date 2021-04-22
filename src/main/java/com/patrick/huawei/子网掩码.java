package com.patrick.huawei;

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
 * @date: Created in 2021/4/19 6:41 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 子网掩码 {
	public static void main(String[] args) {
		ThreadLocal<String> objectThreadLocal = new ThreadLocal();
		objectThreadLocal.set("demo");
		System.out.println(objectThreadLocal);
		getDemo();
	}

	public static void getDemo() {
		ThreadLocal<String> objectThreadLocal = new ThreadLocal();
		String demo = objectThreadLocal.get();
		ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
		System.out.println(demo);

	}
}
