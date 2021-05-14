package com.patrick.algorithms;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

import static java.lang.Character.*;

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
 * @date: Created in 2021/4/18 12:49 下午
 * @desc: 给定一个经过编码的字符串，返回它解码后的字符串。
 * 编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。
 * 你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。
 * 此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像3a或2[4]的输入。
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 字符串解码 {
	public static void main(String[] args) {
		String str = "3[az[c]]";
//		"zzzyypqjkjkefjkjkefjkjkefjkjkefyypqjkjkefjkjkefjkjkefjkjkefef"
		System.out.println(decodeString1(str));
	}

	public static String decodeString(String s) {
		Stack<String> result = new Stack<>();
		String[] split = s.split("");

		for (int i = 0; i < split.length; i++) {
			if (!split[i].equals("[") && !split[i].equals("]")) {
				result.push(split[i]);//放入除[]的符号
			}
			if (split[i].equals("]")) {
				if (result.size() <= 1) continue;
				//进行运算
				do {
					StringBuilder temp = new StringBuilder();
					String pop1 = result.pop();
					String pop2 = result.pop();
					if (Character.isDigit(split[i - 1].charAt(0)) && Character.isDigit(pop2.charAt(0))) {
						while (!result.isEmpty() && Character.isDigit(result.peek().charAt(0))) {
							pop2 = result.pop() + pop2;
						}
					}
					if (Character.isDigit(pop2.charAt(0))) { //是数字相乘
						for (int j = 0; j < Integer.parseInt(pop2); j++) {
							temp.append(pop1);
						}
						result.push(temp.toString());
					} else
						//不是数字直接相加 accaccacc
						result.push(pop2 + pop1);
				} while (result.size() > 1);
			}
		}
		StringBuffer stringBuffer = new StringBuffer();
		for (String str : result) {
			stringBuffer.append(str);
		}
		return stringBuffer.toString();
	}

	public static String decodeString1(String target) {
		StringBuilder res = new StringBuilder();
		int multi = 0;
		LinkedList<Integer> stack_multi = new LinkedList<>();
		LinkedList<String> stack_res = new LinkedList<>();
		for(Character c : target.toCharArray()) {
			if(c == '[') {
				stack_multi.addLast(multi);
				stack_res.addLast(res.toString());
				multi = 0;
				res = new StringBuilder();
			}
			else if(c == ']') {
				StringBuilder tmp = new StringBuilder();
				int cur_multi = stack_multi.removeLast();
				for(int i = 0; i < cur_multi; i++) tmp.append(res);
				res = new StringBuilder(stack_res.removeLast() + tmp);
			}
			else if(c >= '0' && c <= '9') multi = multi * 10 + Integer.parseInt(c + "");
			else res.append(c);
		}
		return res.toString();
	}

}
