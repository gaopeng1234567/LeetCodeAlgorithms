package com.patrick.algorithms.多线程;


class Foo {
	public volatile boolean first = true;
	public volatile boolean second = true;

	public Foo() {

	}

	public void first(Runnable printFirst) throws InterruptedException {

		// printFirst.run() outputs "first". Do not change or remove this line.

		printFirst.run();
		first = false;
	}

	public void second(Runnable printSecond) throws InterruptedException {

		// printSecond.run() outputs "second". Do not change or remove this line.
		while (first) ;
		printSecond.run();
		second = false;
		first = true;
	}

	public void third(Runnable printThird) throws InterruptedException {

		// printThird.run() outputs "third". Do not change or remove this line.
		while (second) ;
		printThird.run();
		second = true;
	}
}