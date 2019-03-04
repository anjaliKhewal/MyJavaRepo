package com.study.queue;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthStyle;

/**
 * @author Anjali
 * Feb 14, 2019
 */
public class CircularQueueMainTrial {
	
	public static void main(String[] args) {
		
		MyCircularQueue circQ = new MyCircularQueue(3);
		//System.out.println("Data: "+circQ);
		System.out.println(circQ.enQueue(1));
	//	System.out.println("Data: "+circQ);
		System.out.println(circQ.enQueue(2));
	//	System.out.println("Data: "+circQ);
		System.out.println(circQ.enQueue(3));
	//	System.out.println("Data: "+circQ);
		System.out.println(circQ.enQueue(4));
	//	System.out.println("Data: "+circQ);
		System.out.println(circQ.Rear());
		System.out.println("Data: "+circQ);
		System.out.println(circQ.isFull());
	//	System.out.println("Data: "+circQ);
		System.out.println(circQ.deQueue());
		System.out.println("Head: "+circQ.getHead()+" Tail: "+circQ.getTail());
	//	System.out.println("Data: "+circQ);
		System.out.println(circQ.enQueue(4));
		System.out.println("Head: "+circQ.getHead()+" Tail: "+circQ.getTail());
		System.out.println("Data: "+circQ);
	//	System.out.println("Head: "+circQ.getHead()+" Tail: "+circQ.getTail());
		//System.out.println(circQ.Front());
	//	System.out.println("Data: "+circQ);
	//	System.out.println("Head: "+circQ.getHead()+" Tail: "+circQ.getTail());
		System.out.println(circQ.Rear());
		System.out.println("Head: "+circQ.getHead()+" Tail: "+circQ.getTail());
		System.out.println(circQ.deQueue());
		System.out.println(circQ);
		System.out.println("Head: "+circQ.getHead()+" Tail: "+circQ.getTail());
		System.out.println(circQ.getData().size());
		System.out.println(circQ.deQueue());
		System.out.println("Head: "+circQ.getHead()+" Tail: "+circQ.getTail());
		System.out.println(circQ.enQueue(8));
		System.out.println("Data: "+circQ);
		System.out.println("Head: "+circQ.getHead()+" Tail: "+circQ.getTail());
		circQ.deQueue();
		System.out.println("Data: "+circQ);
		System.out.println("Head: "+circQ.getHead()+" Tail: "+circQ.getTail());
		circQ.enQueue(23);
		System.out.println("Data: "+circQ);
		System.out.println("Head: "+circQ.getHead()+" Tail: "+circQ.getTail());
		
	}

}

class MyCircularQueue {
	
	private int size;
	private int head;
	public List<Integer> getData() {
		return data;
	}
	
	int[] input;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MyCircularQueue [data=" + data + "]";
	}

	public void setData(List<Integer> data) {
		this.data = data;
	}

	public int getHead() {
		return head;
	}

	public void setHead(int head) {
		this.head = head;
	}

	public int getTail() {
		return tail;
	}

	public void setTail(int tail) {
		this.tail = tail;
	}

	private int tail;
	private List<Integer> data;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        size=k;
        data = new ArrayList<>();
        head = -1;
        tail = -1;
        input = new int[k];
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
    	if(!isFull()) {
    		//data.add(value);
    		if(data.size()==0) {
    			head++;
    			tail++;
    		}
    		
    		else if(tail==size-1)
    			tail=0;
    		else
    			tail++;
    		data.add(tail, value);	
    		
        return true;
    	}
    	return false;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
    	if(!isEmpty()) {
    		
    		//int datal = data.size();
    		if(data.size()==1)
    		{	
    			//int indx = data.indexOf(Front());
    			data.remove(head);
    			head = -1;
    			tail = -1;
    		}
    		else {
    			data.remove(head);
    			head++;
    			
    			if(head==data.size())
    				head--;
    			if(head==size-1)
    				head=0;
    			if(tail==data.size() && (head-tail==1 || tail-head==1))
    				tail--;
    		
    		}
    			
    	return true;
    	}
        return false;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
    	
    	if(!isEmpty())
    		return data.get(head);
    	else
        return -1;
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
    	if(!isEmpty()) {
    		//System.out.println("data.size "+ data.size());
    		return data.get(tail);
    	}
        return -1;
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return (head ==-1 & tail ==-1 ); 
    	
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
    	//boolean listFul = data.size()==size;
    	//boolean arrfull = input.length == size;
        return data.size()==size;
    }
    
  
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */