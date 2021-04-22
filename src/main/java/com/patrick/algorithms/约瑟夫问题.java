package com.patrick.algorithms;

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
 * @date: Created in 2021/4/14 3:50 下午
 * @desc:
 * @motto: 生平不知李二狗，学好并发也枉然
 */
public class 约瑟夫问题 {

	private NodeKill head;

	public void insertHead(int n) {
		NodeKill nodeKill = new NodeKill(n);
		nodeKill.next = head;
		head = nodeKill;
	}
	public void deleteNode(){

	}

	public static void main(String[] args) {
		约瑟夫问题 约瑟夫问题 = new 约瑟夫问题();
		for (int i = 6; i > 0; i--) {
			约瑟夫问题.insertHead(i);
		}

	}

}

class NodeKill {
	public Integer name;
	public NodeKill next;

	public NodeKill(Integer name) {
		this.name = name;
		next = null;
	}
}
