package com.patrick;

import javax.lang.model.element.VariableElement;
import java.io.PipedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

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
 * @date: Created in 2021/5/21 6:29 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class MyBlockQueue<T> {
	private static final Integer MAX = 10;
	//队列
	private LinkedList<T> queueList = new LinkedList<>();
	//线程通讯

	private Lock lock = new ReentrantLock();
	private Condition producter = lock.newCondition();
	private Condition consumer = lock.newCondition();


	public void offer(T t) {
		try {
			lock.lock();
			while (queueList.size() == MAX) {
				producter.await();
			}
			queueList.add(t);
			consumer.signalAll();
		} catch (InterruptedException e) {
			//处理异常
		} finally {
			lock.unlock();
		}
	}

	public T take() {
		T t = null;
		try {
			lock.lock();
			while (queueList.size() == 0) {
				consumer.await();
			}
			t = queueList.removeFirst();
			producter.signalAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}

		return t;
	}

	public static void main(String[] args) {
		MyBlockQueue<Integer> myBlockQueue = new MyBlockQueue();

	}
}
