package com.patrick.algorithms.反转列表;

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
 * @date: Created in 2021/4/23 4:39 下午
 * @desc: 反转链表
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 反转链表 {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x, ListNode next) {
			val = x;
			this.next = next;
		}
	}

	public static ListNode revertList1(ListNode head) {
		ListNode next, prev = null;
		ListNode curr = head;
		while (curr != null) {
			//先把后面的保存起来
			next = curr.next;
			//把自己的next指向上一个
			curr.next = prev;
			//把自己保存到prev中，防止后面的找不到自己
			prev = curr;
			curr = next;
		}
		return prev;
	}

	public static ListNode revertList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode listNode = revertList(head.next);
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
		ListNode listNode5 = revertList(listNode4);
		System.out.println(listNode5);
	}
}
