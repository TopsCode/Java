package com.abstraction;
interface i1 {
	// all variables are final and static
	// all methods are public 
	void show();
	static void display() {
		System.out.println("Fully define method is possible in INTERFACE with static");
	}
//static {
//		
//	}
//	{
//		
//	}
	
	default	void display1() {
		System.out.println("Fully define method is possible in INTERFACE with default");
	}
}
interface i2 extends i1{
	void data();
}
public class InterfacePractical  implements i2  { 

	@Override
	public void show() {
		System.out.println("Hello from show");
	}
	public static void main(String[] args) {
		InterfacePractical d = new InterfacePractical();
		d.show();
		d.data();
		// called with the help of interface name
		i1.display();
		d.display1();
	}
	@Override
	public void data() {
		System.out.println("from data");
	}
}
