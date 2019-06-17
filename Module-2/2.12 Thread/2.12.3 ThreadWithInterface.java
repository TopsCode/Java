package com.thread;

public class ThreadWithInterface implements Runnable{
	public static void main(String[] args) {
		ThreadWithInterface twi = new ThreadWithInterface();
		Thread t1 = new Thread(twi);
		t1.start();
		
		ThreadWithInterface twi1 = new ThreadWithInterface();
		Thread t2 = new Thread(twi1);
		t2.start();
	}
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(1000);
				Thread.currentThread().setName("MyThread");
				System.out.println(Thread.currentThread().getName()+":-"+i);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
