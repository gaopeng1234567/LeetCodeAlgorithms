package com.patrick.algorithms;

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
 * @date: Created in 2021/4/16 1:12 下午
 * @desc: 数组实现队列
 * @motto: 生平不知李二狗，学好并发也枉然
 */
public class ArrayQueue {
	private int data[]; //数据
	private int head; //头
	private int tail; //尾
	private int n = 0; //数组大小

	public ArrayQueue(int cap) {
		this.data = new int[cap];
	}

	public void pushQueue(int m) {
		//判断是否已经满了
		if (n == tail) return;
		data[tail] = m;
		tail++;
		n++;
	}

	public int pop() {
		//判断是否空了
		if (head == tail) return -1;
		int datum = data[head];
		head++;
		return datum;
	}

	public static void main(String[] args) {
		System.out.println((3 + 1) % 7);
	}
}
