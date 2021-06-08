package com.patrick.three;

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
 * @date: Created in 2021/6/1 11:40 上午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 相交链表 {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) return null;
		ListNode first = headA;
		ListNode second = headB;
		while (first != second) {
			if (first != null) {
				first = first.next;
			} else {
				first = headB;
			}
			if (second != null) {
				second = second.next;
			} else {
				second = headA;
			}
		}
		return first;

	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}