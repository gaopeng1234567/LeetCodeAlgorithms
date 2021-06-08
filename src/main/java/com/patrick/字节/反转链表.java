package com.patrick.字节;

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
 * @date: Created in 2021/5/28 11:38 上午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 反转链表 {

	public ListNode revertList(ListNode listNode) {
		ListNode curr = listNode, next, pre = null;
		while (curr != null) {
			next = curr.next;
			curr.next = pre;
			pre = curr;
			curr = next;
		}
		return pre;
	}

	public ListNode revertList1(ListNode listNode) {
		if (listNode.next == null) {
			return null;
		}
		ListNode node = revertList1(listNode.next);
		listNode.next.next = listNode;
		listNode.next = null;
		return node;
	}

	public static void main(String[] args) {

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