package com.patrick.美团;

import com.patrick.algorithms.递归.两数相加.ListNode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
 * @date: Created in 2021/5/11 11:30 上午
 * @desc: https://leetcode-cn.com/problems/linked-list-cycle/
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 环形链表 {

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public class Solution {
		public boolean hasCycle(ListNode head) {
			if (head == null || head.next == null) {
				return Boolean.FALSE;
			}
			ListNode slow = head;
			ListNode quick = head.next;
			while (slow != quick) {
				if (quick == null || quick.next == null || quick.next.next == null) {
					return Boolean.FALSE;
				}
				slow = slow.next;
				quick = quick.next.next.next;
			}
			return Boolean.TRUE;
		}

		public boolean hasCycle1(ListNode head) {
			Set<ListNode> collect = new HashSet<>();
			while (head != null) {
				if (!collect.add(head)) {
					return Boolean.TRUE;
				}
				head = head.next;
			}
			return Boolean.FALSE;
		}
	}
}

