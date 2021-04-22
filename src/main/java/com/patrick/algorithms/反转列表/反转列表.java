package com.patrick.algorithms.反转列表;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * @author patrick
 * @date 2021/3/2 10:18 上午
 * @Des 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * <p>
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 * 最簡單的事是堅持，最難的事還是堅持
 */
public class 反转列表 {
    public static void main(String[] args) {
        ListNode list = new ListNode(5);
        ListNode listNode = new ListNode(4, list);
        ListNode listNode1 = new ListNode(3, listNode);
        ListNode listNode2 = new ListNode(2, listNode1);
        ListNode listNode3 = new ListNode(1, listNode2);

        System.out.println(JSON.toJSONString(listNode3,true));
//        printLinkedList(reverseListIterative(listNode3));
        printLinkedList(reverseList(listNode3));

    }
    /**打印链表**/
    private static void printLinkedList(ListNode head) {
        ListNode node = head;
        while(node != null){
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static List revertList(List target) {
        // 收尾交换位置

        return null;
    }
    //尾递归
    public static ListNode reverseList(ListNode head) {
        return reverse(null,head);
    }

    private static ListNode reverse(ListNode pre,ListNode cur){
        if(cur==null) return pre;
        ListNode next = cur.next;
        cur.next = pre;
        return reverse(cur,next);
    }

    public static ListNode reverseListIterative(ListNode head) {
        ListNode prev = null; //前指针节点
        ListNode curr = head; //当前指针节点
        //每次循环，都将当前节点指向它前面的节点，然后当前节点和前节点后移
        while (curr != null) {
            ListNode nextTemp = curr.next; //临时节点，暂存当前节点的下一节点，用于后移
            curr.next = prev; //将当前节点指向它前面的节点
            prev = curr; //前指针后移
            curr = nextTemp; //当前指针后移
        }
        return prev;
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

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}