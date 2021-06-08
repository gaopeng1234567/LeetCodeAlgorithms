package com.patrick.字节;

import com.patrick.algorithms.反转列表.反转链表;

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
 * @date: Created in 2021/5/30 5:25 下午
 * @desc: 先分段、再反转、在连接
 * @motto: Keep It Simple and Stupid, KISS
 */
public class K个一组翻转链表 {
	public static ListNode reverseKGroup(ListNode head, int k) {
		ListNode hair = new ListNode();
		hair.next = head;
		ListNode pre = hair;
		while (head != null) {
			ListNode tail = pre;
			//分段
			for (int i = 0; i < k; ++i) {
				tail = tail.next;
				if (tail == null) { //最后一个了
					return hair.next;
				}
			}
			ListNode next = tail.next;
			//反转
			ListNode[] reverse = myReverse(head, tail);
			head = reverse[0];
			tail = reverse[1];
			//链接
			pre.next = head;
			tail.next = next;
			pre = tail;
			head = tail.next;
		}

		return hair.next;
	}

	private static ListNode[] myReverse(ListNode head, ListNode tail) {
		ListNode prev = tail.next;
		ListNode p = head;
		while (prev != tail) {
			ListNode nex = p.next;
			p.next = prev;
			prev = p;
			p = nex;
		}
		return new ListNode[]{tail, head};
	}

	public static void main(String[] args) {
		ListNode listNode = new ListNode(5, null);
		ListNode listNode1 = new ListNode(4, listNode);
		ListNode listNode2 = new ListNode(3, listNode1);
		ListNode listNode3 = new ListNode(2, listNode2);
		ListNode listNode4 = new ListNode(1, listNode3);
		ListNode listNode5 = reverseKGroup(listNode4, 2);
		System.out.println(listNode5);
	}
}
