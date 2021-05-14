package com.patrick.美团;

import com.patrick.algorithms.递归.两数相加.ListNode;
import sun.jvm.hotspot.utilities.TwoOopHashtable;

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
 * @date: Created in 2021/5/12 12:49 下午
 * @desc: 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 合并两个有序链表 {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x, ListNode o) {
			val = x;
			this.next = o;
		}
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		//采用归并排序的思想
		//此时的两个链表就是两个带合并的，以及拆分完了。
		ListNode res = new ListNode(0,null);
		ListNode temp = res;//额外开闭一个变量
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				temp.next = l1;
				temp = temp.next;
				l1 = l1.next;//打不过，继续下一个牛逼的
			} else {
				temp.next = l2;
				temp = temp.next;
				l2 = l2.next;//打不过，继续下一个牛逼的
			}

		}
		if (l1 != null) {
			temp.next = l1;
		}
		if (l2 != null) {
			temp.next = l2;
		}
		return res.next;
	}

	public static void main(String[] args) {
		ListNode listNode = new ListNode(5, null);
		ListNode listNode3 = new ListNode(2, listNode);
		ListNode listNode4 = new ListNode(1, listNode3);

		ListNode listNode1 = new ListNode(6, null);
		ListNode listNode2 = new ListNode(3, listNode1);
		mergeTwoLists(listNode4, listNode2);


	}
}
