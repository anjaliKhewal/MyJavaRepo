/**
 * @author Anjali
 *Dec 10, 2018
 *
 */
package com.multithreading;

public class SynchronizeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sender sender = new Sender();
		ThreadSend ts = new ThreadSend("Hi ", sender);
		ThreadSend ts2 = new ThreadSend("Hello ", sender);
		//starting 2 threads
		ts.start();
		ts2.start();
		
		//wait for threads to end
		try {
			//ts.join();
			//ts2.join();
		}catch(Exception e) {
			System.out.println("thread interupted Synchronized Demo: " + e.getMessage());
		}
	}

}

class Sender{
	public void send(String msg) {
		
		System.out.println("Sending\t"+ msg);
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			System.out.println("Thread interupted Sender: "+e.getMessage());
		}
		System.out.println("\n"+msg+"Sent");
		
		
	}
}

class ThreadSend extends Thread{
		private String msg;
		private Thread t;
		Sender sender;
		
		ThreadSend(String m, Sender obj){
			msg = m;
			sender = obj;
		}
		
		public void run() {
			//synchronized(sender) {
				sender.send(msg);
			//}
		}
}
