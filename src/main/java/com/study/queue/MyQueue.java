package com.study.queue;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anjali
 * Feb 14, 2019
 */
public class MyQueue {

	public static void main(String[] args) {
		
		QueueImpl q = new QueueImpl();
		q.enQueue(6);
		q.enQueue(7);
		
		if(!q.isEmpty())
			System.out.println(q.front());
		
		q.deQueue();
		if(!q.isEmpty())
			System.out.println(q.front());
		
		q.enQueue(9);
		if(!q.isEmpty())
			System.out.println(q.front());
		
		q.deQueue();
		if(!q.isEmpty())
			System.out.println(q.front());
		q.deQueue();
		if(!q.isEmpty())
			System.out.println(q.front());
		q.deQueue();
	}
}

class QueueImpl{
	
	private List<Integer> data;
	private int point;
	
	
	public QueueImpl() {
		
		data = new ArrayList<>();
		point = 0;
		
	}
	
	public boolean isEmpty() {
		
		return point>=data.size();
		
	}
	public boolean enQueue(int x) {
		
		data.add(x);
		return true;
		
	}
	
	public boolean deQueue() {
		
		if(isEmpty()==true)
			return false;
		point++;
		return true;
		
	}
	
	public int front() {
	
		return data.get(point);
	}
	
}
