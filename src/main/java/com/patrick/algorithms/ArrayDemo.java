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
 * @date: Created in 2021/4/14 1:29 下午
 * @desc: 深入理解数组
 * @motto: 生平不知李二狗，学好并发也枉然
 */
public class ArrayDemo {
	private int size; //数组长度
	private int data[]; //存放数据
	private int index; //当前已经存的数据大小

	public ArrayDemo(int size) {
		this.size = size;
		data = new int[size];
		this.index = 0;
	}

	public void insert(int loc,int n){		//时间复杂度 O(n);
		if(index ++ < size){
			for(int i = size - 1; i > loc ; i --){	//为什么不能写size 0~size-1 如果loc是0 O(n),O(1)=>O(n)
				data[i] = data[i - 1];	//把数据往后移一个
			}
			data[loc] = n;
		}
		//扩容 会把size*2 0.75
	}
	public void delete(int loc){	//O(n)
		for(int i = loc ; i < size ; i++){
			if(i != size - 1){		//怕越界所以加一个判断
				data[i] = data[i + 1];
			}else{
				data[i] = 0;			//默认为0 就是没存数据的
			}
		}
		index -- ;
	}

	public void update(int loc,int n){//O(1)
		data[loc] = n;
	}

	public int get(int loc){		//O(1)
		return data[loc];
	}

	public void print() {
		System.out.println("index:" + index);
		for (int i = 0; i < index; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ArrayDemo arrayDemo = new ArrayDemo(3);
		arrayDemo.insert(1,1);
		arrayDemo.insert(2,2);
		arrayDemo.insert(3,3);

		System.out.println(arrayDemo.get(1));
	}
}
