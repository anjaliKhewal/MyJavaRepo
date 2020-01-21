/**
 * 
 */
package com.leetcode;

import java.util.LinkedList;

/**
 * @author Anjali
 *
 */
public class Ques2_Sum_2_LinkedList {

	/**
	 * @param args
	 */
	
	/*
	 * You are given two non-empty linked lists representing two non-negative integers. 
	 * The digits are stored in reverse order and each of their nodes contain a single digit. 
	 * Add the two numbers and return it as a linked list.
	 * 
	 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
	 * Output: 7 -> 0 -> 8
	 * Explanation: 342 + 465 = 807.
	 * 
	 * 342 ==> 2,4,3
	 * 465 ==> 5,6,4
	 * 
	 * out put should be 2+5 =7, 4+6 = 0(10 as it can have just one digit carry forward 1 to next), 3+4+1(carry) = 8
	 * Now reverse the output = 807 
	 * */
	
	Node start;
	Node end;
	int size;
	
	public Ques2_Sum_2_LinkedList() {
		start = null;
		end = null;
		size = 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
	}
	
	public boolean isEmpty() {
		
		return start == null;
	}
	
	public int getSize() {
		return size;
	}
	
	public void insertAtStart(int val) {
		Node nptr =  new Node(val, null);
		size++;
		if(start==null) {
			start = nptr;
			end = start;
		}else {
			nptr.setNext(nptr);
			start = nptr;
		}
	}
	
    public void insertAtEnd(int val)

    {

        Node nptr = new Node(val,null);    

        size++ ;    

        if(start == null) 

        {

            start = nptr;

            end = start;

        }

        else 

        {

            end.setNext(nptr);

            end = nptr;

        }

    }

    /*  Function to insert an element at position  */

    public void insertAtPos(int val , int pos)

    {

        Node nptr = new Node(val, null);                

        Node ptr = start;

        pos = pos - 1 ;

        for (int i = 1; i < size; i++) 

        {

            if (i == pos) 

            {

                Node tmp = ptr.getNext() ;

                ptr.setNext(nptr);

                nptr.setNext(tmp);

                break;

            }

            ptr = ptr.getNext();

        }

        size++ ;

    }

    /*  Function to delete an element at position  */

    public void deleteAtPos(int pos)

    {        

        if (pos == 1) 

        {

            start = start.getNext();

            size--; 

            return ;

        }

        if (pos == size) 

        {

            Node s = start;

            Node t = start;

            while (s != end)

            {

                t = s;

                s = s.getNext();

            }

            end = t;

            end.setNext(null);

            size --;

            return;

        }

        Node ptr = start;

        pos = pos - 1 ;

        for (int i = 1; i < size - 1; i++) 

        {

            if (i == pos) 

            {

                Node tmp = ptr.getNext();

                tmp = tmp.getNext();

                ptr.setNext(tmp);

                break;

            }

            ptr = ptr.getNext();

        }

        size-- ;

    }    

    /*  Function to display elements  */

    public void display()

    {

        System.out.print("\nSingly Linked List = ");

        if (size == 0) 

        {

            System.out.print("empty\n");

            return;

        }    

        if (start.getNext() == null) 

        {

            System.out.println(start.getVal());

            return;

        }

        Node ptr = start;

        System.out.print(start.getVal()+ "->");

        ptr = start.getNext();

        while (ptr.getNext() != null)

        {

            System.out.print(ptr.getVal()+ "->");

            ptr = ptr.getNext();

        }

        System.out.print(ptr.getVal()+ "\n");

    }
}

class Node{
	
	int val;
	Node next;
	
	public Node(int x){
		val =x;
	}
	
	public Node() {
		
	}
	
	public Node(int x, Node n) {
		val = x;
		next = n;
	}

	/**
	 * @return the val
	 */
	public int getVal() {
		return val;
	}

	/**
	 * @param val the val to set
	 */
	public void setVal(int val) {
		this.val = val;
	}

	/**
	 * @return the next
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}
	
	
}
