package com.patrick.字节;

import java.util.LinkedHashMap;
import java.util.LinkedList;
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
 * @date: Created in 2021/5/29 11:45 上午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class LRUCache {
	LinkedHashMap<Integer, Integer> cache = null;
	int capacity = 0;

	public LRUCache(int capacity) {
		this.cache = new LinkedHashMap(capacity,0.75f,true) {
			@Override
			protected boolean removeEldestEntry(Map.Entry eldest) {
				return cache.size() > capacity;
			}
		};
		this.capacity = capacity;
	}

	public int get(int key) {
		return cache.getOrDefault(key, -1);
	}

	public void put(int key, int value) {
		cache.put(key, value);
	}

}
