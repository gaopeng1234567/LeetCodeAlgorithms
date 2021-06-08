package com.patrick.two;

import java.util.List;

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
 * @date: Created in 2021/5/31 6:33 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 奇偶链表 {
	public ListNode oddEvenList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		// 奇头
		ListNode odd = head;
		// 偶头
		ListNode even = head.next;
		// 欧尾巴
		ListNode e = even;
		while (odd.next != null && e.next != null) {
			odd.next = e.next; // 1-->3
			odd = odd.next; // 奇头变成3 此时3-->4
			e.next = odd.next; //  2 ---> 4
			e = e.next; // 此时 2 ----> 4
		}
		odd.next = even;
		return head;
	}

	public class ListNode {
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
}
