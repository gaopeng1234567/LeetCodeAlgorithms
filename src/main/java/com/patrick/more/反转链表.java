package com.patrick.more;

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
 * @date: Created in 2021/5/29 11:15 上午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 反转链表 {

	public static ListNode test(ListNode head) {
		ListNode next, curr = head, pre = null;
		while (curr != null) {
			next = curr.next;
			curr.next = pre;
			pre = curr;
			curr = next;
		}
		return pre;
	}

	public static ListNode test1(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode listNode = test1(head.next);
		head.next.next = head;
		head.next = null;
		return listNode;
	}

	public static void main(String[] args) {
		ListNode listNode = new ListNode(5, null);
		ListNode listNode1 = new ListNode(4, listNode);
		ListNode listNode2 = new ListNode(3, listNode1);
		ListNode listNode3 = new ListNode(2, listNode2);
		ListNode listNode4 = new ListNode(1, listNode3);
		ListNode listNode5 = test1(listNode4);
		System.out.println(listNode5);
	}
}

class ListNode {
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