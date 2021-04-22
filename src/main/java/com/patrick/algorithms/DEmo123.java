package com.patrick.algorithms;

import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.IntStream;

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
 * @date: Created in 2021/4/16 11:50 上午
 * @desc:
 * @motto: 生平不知李二狗，学好并发也枉然
 */
public class DEmo123 {
	public static void main(String[] args) {
		System.out.println(test("()"));
	}

	public static boolean test(String s) {
		Stack<Character> chars = new Stack();
		Character top;
		for (char x : s.toCharArray()) {
			switch (x) {
				case '{':
				case '(':
				case '[':
					chars.push(x);//O(1)
					break;
				case '}':
					if(chars.isEmpty())
						return false;
					top = chars.pop();//O(1)
					if (top == null) return false;
					if (top == '{') {
						break;
					} else {
						return false;
					}
				case ')':
					if(chars.isEmpty())
						return false;
					top = chars.pop();//O(1)
					if (top == null) return false;
					if (top == '(') {
						break;
					} else {
						return false;
					}
				case ']':
					if(chars.isEmpty())
						return false;
					top = chars.pop();//O(1)
					if (top == null) return false;
					if (top == '[') {
						break;
					} else {
						return false;
					}
				default:
					break;
			}
		}
		return chars.isEmpty();
	}
}
