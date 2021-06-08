package com.patrick.three;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

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
 * @date: Created in 2021/6/1 11:07 上午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class LRU2 {

	int capacity;
	LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<>();

	public LRU2(int capacity) {
		this.capacity = capacity;
	}

	public int get(int key) {
		Integer res = cache.getOrDefault(key, -1);
		if (res != -1) {
			//在放入队头
			cache.remove(key);
			this.put(key, res);
		}
		return res;
	}

	public void put(int key, int value) {
		// 判断是否存在
		if (cache.containsKey(key)) {
			//清楚队尾
			cache.remove(key);
		}
		// 判断是否满了
		else if (cache.size() >= capacity) {
			//清楚队尾
			Iterator<Map.Entry<Integer, Integer>> iterator = cache.entrySet().iterator();
			iterator.next();
			iterator.remove();
		}
		// 放入
		cache.put(key, value);
	}

	//	["LRUCache","get","put","get","put","put","get","get"]
//	[[2],[2],[2,6],[1],[1,5],[1,2],[1],[2]]
	public static void main(String[] args) {
		LRU2 lru2 = new LRU2(2);
		System.out.println(lru2.get(2));
		lru2.put(2, 6);
		System.out.println(lru2.get(1));
		lru2.put(1, 5);
		lru2.put(1, 2);
		System.out.println(lru2.get(1));
		System.out.println(lru2.get(2));

	}
}
