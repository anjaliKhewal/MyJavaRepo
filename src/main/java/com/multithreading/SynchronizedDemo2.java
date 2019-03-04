/**
 * @author Anjali
 *Dec 10, 2018
 *
 */
package com.multithreading;

public class SynchronizedDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Counter counter = new Counter();
		Thread a = new CounterThread(counter);
		Thread b = new CounterThread(counter);
		
		a.start();
		b.start();
		System.out.println("Hello inside main method");
	}

}

class Counter{
	long count = 0;
	public synchronized void add(long value) {
		this.count += value;
		System.out.println("value of counter: "+count);
	}
	
}

class CounterThread extends Thread{
	protected Counter counter = null;
	public CounterThread(Counter counter) {
		this.counter = counter;
	}
	
	public void run() {
		for (int i =0; i<10; i++) {
			counter.add(i);
		}
	}
}