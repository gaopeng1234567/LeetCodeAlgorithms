package com.patrick.美团;

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
 * @date: Created in 2021/5/11 10:18 上午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 反转链表 {

	/**
	 * 迭代
	 * @param head
	 * @return head
	 */
	public static ListNode reverseList(ListNode head) {
		ListNode curr = head;
		ListNode next, pre = null;
		while (curr != null) {
			//1 -> 2 -> 3
			// (1 <- 2) pre  (2->3)curr
			//1 <-2 <- 3
			//保存下一个
			next = curr.next;
			//断开 1 --> 2
			curr.next = pre;
			//保存pre
			pre = curr;
			curr = next;
		}
		return pre;
	}

	/**
	 * 递归
	 * @param head
	 * @return head
	 */
	public static ListNode reverseList1(ListNode curr) {
		//终止条件
		if (curr == null || curr.next == null) {
			return curr;
		}
		ListNode listNode = reverseList1(curr.next);
		curr.next.next = curr; //最后一个指向上一个
		curr.next = null;//上一个指向之前的清空
		return listNode;
	}


	public static void main(String[] args) {
		ListNode listNode = new ListNode(5, null);
		ListNode listNode1 = new ListNode(4, listNode);
		ListNode listNode2 = new ListNode(3, listNode1);
		ListNode listNode3 = new ListNode(2, listNode2);
		ListNode listNode4 = new ListNode(1, listNode3);
		ListNode listNode5 = reverseList1(listNode4);
		System.out.println(listNode5);
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x, ListNode next) {
		val = x;
		this.next = next;
	}
}