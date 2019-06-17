package com.thread;

public class ThreadWithClass  extends Thread{
	public void run() {
		Thread t = Thread.currentThread();
		t.getName();
		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println("Current Thread Name : -"+t);
		t.setName("ChildThread");
		System.out.println("Current Thread Name : -"+t);
		//t.setPriority(2);
		System.out.println("Current Thread Name : -"+t);
		
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+" :-"+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		ThreadWithClass t1 = new ThreadWithClass();
		t1.start();
		ThreadWithClass t2 = new ThreadWithClass();
		t2.start();
		
		Thread t = Thread.currentThread();
		t.getName();
		System.out.println("Current Thread Name == "+t);
		t.setName("ParentThread");
		System.out.println("Current Thread Name == "+t);
	Thread.currentThread().setPriority(MIN_PRIORITY);
		System.out.println("Current Thread Name == "+t);
		
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+" :-"+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		
	}
}
