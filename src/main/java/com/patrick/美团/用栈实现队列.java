package com.patrick.美团;

import java.util.Stack;

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
 * @date: Created in 2021/5/12 12:15 下午
 * @desc: 请你仅使用两个栈实现先入先出队列。队列应当支持一般队列支持的所有操作（push、pop、peek、empty）：
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 用栈实现队列 {
	private Stack<Integer> stack1, stack2;//一个入，一个出

	/** Initialize your data structure here. */
	public 用栈实现队列() {
		//初始化stack
		stack1 = new Stack<>();
		stack2 = new Stack<>();
	}

	/** Push element x to the back of queue. */
	public void push(int x) {
		//必须要保证一个有、一个空 否则就迁移过来
		if (stack2.isEmpty())
			stack1.push(x);
		else {
			while (!stack2.isEmpty())
				stack1.push(stack2.pop());
			stack1.push(x);
		}
	}

	/** Removes the element from in front of queue and returns that element. */
	public int pop() {
		//必须要保证一个有、一个空 否则就迁移过来
		if (stack1.isEmpty()) {
			return stack2.pop();
		} else while (!stack1.empty()) {
			stack2.push(stack1.pop());
		}
		return stack2.pop();
	}

	/** Get the front element. */
	public int peek() {
		//必须要保证一个有、一个空 否则就迁移过来
		if (stack1.isEmpty()) {
			return stack2.peek();
		} else while (!stack1.empty()) {
			stack2.push(stack1.pop());
		}
		return stack2.peek();
	}

	/** Returns whether the queue is empty. */
	public boolean empty() {
		return stack2.empty() && stack1.empty();
	}

	public static void main(String[] args) {
		用栈实现队列 用栈实现队列 = new 用栈实现队列();
		用栈实现队列.push(1);
		用栈实现队列.push(2);
		用栈实现队列.push(3);
		用栈实现队列.push(4);
		System.out.println(用栈实现队列.pop());
		用栈实现队列.push(5);
		System.out.println(用栈实现队列.pop());
		System.out.println(用栈实现队列.pop());
		System.out.println(用栈实现队列.pop());
		System.out.println(用栈实现队列.pop());
	}
}
