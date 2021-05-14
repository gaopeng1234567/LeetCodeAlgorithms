package com.patrick.美团;

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
 * @desc: 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
 * <p>
 * 例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。这个链表的倒数第 3 个节点是值为 4 的节点。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 链表中倒数第k个节点 {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x, ListNode o) {
			val = x;
			this.next = o;
		}
	}

	public static ListNode getKthFromEnd(ListNode head, int k) {
		if (head == null) return null;
		ListNode target = head;
		ListNode res = null;
		int len = 0;
		int now = 0;
		while (head != null) {
			len++;
			head = head.next;
		}
		while (target != null) {
			if (len - now == k) {
				res = target;
				break;
			}
			now++;
			target = target.next;
		}
		return res;
	}

	public static ListNode getKthFromEnd1(ListNode head, int k) {
		ListNode fast = head, last = head;
		for (int i = 0; i < k; i++) {
			fast = fast.next;
		}
		while (fast != null) {
			last = last.next;
			fast = fast.next;
		}
		return last;
	}

	public static void main(String[] args) {
		ListNode listNode = new ListNode(5, null);
		ListNode listNode1 = new ListNode(4, listNode);
		ListNode listNode2 = new ListNode(3, listNode1);
		ListNode listNode3 = new ListNode(2, listNode2);
		ListNode listNode4 = new ListNode(1, listNode3);
		getKthFromEnd1(listNode4, 2);

	}
}
