package com.patrick.study.tree;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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
 * @date: Created in 2021/4/21 4:41 下午
 * @desc: 二叉树的遍历
 * @motto: Keep It Simple and Stupid, KISS
 */
@Data
@AllArgsConstructor
class MyTreeNode {

	private String data;
	private MyTreeNode left;
	private MyTreeNode right;

}

public class BinaryTree {
	private String[] myTreeNodes = new String[100];
	private ArrayList<String> arrayList = new ArrayList<>(10);

	public static void main(String[] args) {
		MyTreeNode D = new MyTreeNode("D", null, null);
		MyTreeNode H = new MyTreeNode("H", null, null);
		MyTreeNode K = new MyTreeNode("K", null, null);
		MyTreeNode C = new MyTreeNode("C", D, null);
		MyTreeNode G = new MyTreeNode("G", H, K);
		MyTreeNode B = new MyTreeNode("B", null, C);
		MyTreeNode F = new MyTreeNode("F", G, null);
		MyTreeNode E = new MyTreeNode("E", null, F);
		MyTreeNode A = new MyTreeNode("A", B, E);

		BinaryTree binaryTree = new BinaryTree();
		System.out.println("前");
		binaryTree.pre(A);
		System.out.println();
		System.out.println("中");
		binaryTree.in(A);
		System.out.println();
		System.out.println("后");
		binaryTree.post(A);
		System.out.println();
		System.out.println("层序遍历");
		binaryTree.levelForQueue(A);

	}

	public void print(MyTreeNode node) {
		System.out.print(node.getData());
	}

	public void pre(MyTreeNode root) {        //前序遍历 根(输出) 左 右 时间复杂度？O(n) N^2 O(2*n)=>O(n);
		print(root);
		if (root.getLeft() != null) {
			pre(root.getLeft());    //认为是子树,分解子问题；
		}
		if (root.getRight() != null) {
			pre(root.getRight());
		}
	}

	public void in(MyTreeNode root) {        //中序遍历  左 根(输出)  右
		if (root.getLeft() != null) {
			in(root.getLeft());    //认为是子树,分解子问题；
		}
		print(root);
		if (root.getRight() != null) {
			in(root.getRight());
		}
	}

	public void post(MyTreeNode root) {        //后序遍历  左  右 根(输出)
		if (root.getLeft() != null) {
			post(root.getLeft());    //认为是子树,分解子问题；
		}
		if (root.getRight() != null) {
			post(root.getRight());
		}
		print(root);
	}

	public void levelForQueue(MyTreeNode treeNode) {
		Queue<MyTreeNode> queue = new LinkedList<>();
		queue.offer(treeNode);
		while (!queue.isEmpty()) {
			MyTreeNode poll = queue.poll();
			print(poll);
			if (poll.getLeft() != null) {
				queue.offer(poll.getLeft());
			}
			if (poll.getRight() != null) {
				queue.offer(poll.getRight());
			}
		}
	}

	public void levelForArray(MyTreeNode treeNode, int i) {
//		myTreeNodes[i] = treeNode.getData();
		arrayList.add(i, treeNode.getData());
		if (treeNode.getLeft() != null) {
			levelForArray(treeNode.getLeft(), 2 * i);
		}
		if (treeNode.getRight() != null) {
			levelForArray(treeNode.getRight(), 2 * i + 1);
		}
	}
}
