package com.patrick.字节;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.function.Predicate;

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
 * @date: Created in 2021/5/29 6:55 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 二叉树的中序遍历 {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList();
		if (root == null)
			return list;
		in(root, list);
		return list;
	}

	public void in(TreeNode root, List<Integer> list) {
		if (root.left != null)
			in(root.left, list);
		list.add(root.val);
		if (root.right != null)
			in(root.right, list);
	}

	public List<Integer> inorderTraversal1(TreeNode root) {
		Deque<TreeNode> deque = new ArrayDeque<>();
		List<Integer> list = new ArrayList();
		while (root.left != null || !deque.isEmpty()) {
			if (root != null) {
				deque.push(root);
				root = root.left;
			} else {
				root = deque.pop();
				list.add(root.val);
				root = root.right;
			}
		}
		return list;
	}

	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>();
		deque.push(1);
		deque.push(2);
		System.out.println(deque.pop());
		System.out.println(deque.pop());
	}

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
}
