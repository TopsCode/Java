package com.thread;

class CallBack{
	public void call(String msg)  {
		System.out.print("["+msg);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print("]");
	}
}
class Caller implements Runnable{
	
	String msg;
	CallBack c;
	Thread t;
	
	public Caller(String msg, CallBack c) {
		this.msg=msg;
		this.c=c;
		t = new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		//c.call(msg);
		synchronized (c) {
			c.call(msg);
		}
	}
}
public class SynchroniseDemo {
	public static void main(String[] args) {
		CallBack c = new CallBack();
		Caller c1 = new Caller("TOPS", c);
		Caller c2 = new Caller("MANINAGAR", c);
		Caller c3 = new Caller("INDIA", c);
		Caller c4 = new Caller("PUNE", c);
	}
}
