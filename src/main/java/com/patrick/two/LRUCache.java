package com.patrick.two;

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
 * @date: Created in 2021/5/31 5:58 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class LRUCache {

	int capacity = 0;
	LinkedHashMap<Integer, Integer> cache;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		this.cache = new LinkedHashMap(capacity, 0.75f, true) {
			@Override
			protected boolean removeEldestEntry(Map.Entry eldest) {
				return cache.size() > capacity;
			}
		};
	}

	public int get(int key) {
		return cache.getOrDefault(key, -1);
	}

	public void put(int key, int value) {
		cache.put(key, value);
	}
}
