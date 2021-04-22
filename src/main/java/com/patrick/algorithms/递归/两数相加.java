package com.patrick.algorithms.递归;

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
 * @date: Created in 2021/4/16 5:17 下午
 * @desc: ListNode {
 * val: 2,
 * next:  ListNode {
 * val: 4,
 * next: ListNode {
 * val: 3,
 * next: null
 * }
 * }
 * };
 * ListNode {
 * val: 5,
 * next:  ListNode {
 * val: 6,
 * next: ListNode {
 * val: 4,
 * next: null
 * }
 * }
 * };
 * 过程发生了342+465 = 807的变化 最后输出：
 * ListNode {
 * val: 7,
 * next:  ListNode {
 * val: 0,
 * next: ListNode {
 * val: 8,
 * next: null
 * }
 * }
 * };
 * @motto: 生平不知李二狗，学好并发也枉然
 */
public class 两数相加 {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		StringBuffer stringBuffer1 = new StringBuffer();
		StringBuffer stringBuffer2 = new StringBuffer();
		do {
			stringBuffer1.append(l1.val);
			l1 = l1.next;
		}
		while (l1 != null);

		do {
			stringBuffer2.append(l2.val);
			l2 = l2.next;
		}
		while (l2 != null);
		String result = Integer.valueOf(stringBuffer1.toString()) + Integer.valueOf(stringBuffer2.toString()) + "";
		ListNode listNode = new ListNode();
		String[] split = result.split("");
		for (String s : split) {
			listNode.next = new ListNode(Integer.valueOf(s));
			listNode = listNode.next;
		}

		return null;
	}

	public static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
		return addTwoNumbers2(l1, l2, 0);
	}

	public static ListNode addTwoNumbers2(ListNode l1, ListNode l2, int a) {
		if (l1 == null && l2 == null) {
			return a == 0 ? null : new ListNode(a);
		}
		if (l1 != null) {
			a += l1.val;
			l1 = l1.next;
		}
		if (l2 != null) {
			a += l2.val;
			l2 = l2.next;
		}
		return new ListNode(a % 10, addTwoNumbers2(l1, l2, a / 10));
	}

	public static void main(String[] args) {
		ListNode listNode = new ListNode(5);
		listNode.next = new ListNode(6);
		listNode.next.next = new ListNode(4);

		ListNode listNode1 = new ListNode(2);
		listNode1.next = new ListNode(4);
		listNode1.next.next = new ListNode(3);
		addTwoNumbers(listNode1, listNode);
		ListNode listNode2 = addTwoNumbers1(listNode1, listNode);
		System.out.println(listNode2);
	}
}
