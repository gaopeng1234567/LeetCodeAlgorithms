package com.patrick.two;

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
 * @date: Created in 2021/5/31 5:25 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 反转链表 {
	public ListNode reverseList1(ListNode head) {
		ListNode pre = null, next, curr = head;
		while (curr != null) {
			next = curr.next;
			curr.next = pre;
			pre = curr;
			curr = next;
		}
		return pre;
	}

	public ListNode reverseList2(ListNode head) {
		//终止条件
		if (head ==null || head.next == null) {
			return head;
		}
		ListNode listNode = reverseList2(head.next);
		head.next.next = head;
		head.next = null;
		return listNode;
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
