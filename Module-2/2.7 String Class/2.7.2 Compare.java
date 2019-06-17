package com.stringclass;

public class Compare {
	public static void main(String[] args) {
		long  startTime=System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("tops");
		for(int i=1;i<=10000;i++) {
			sb.append("maninagar");
		}
		System.out.println("Time taken by StringBuffer = "+(System.currentTimeMillis()-startTime)+"ms");
		startTime=System.currentTimeMillis();
		StringBuilder sbul=new StringBuilder("tops");
		for(int i=1;i<=10000;i++) {
			sbul.append("Maninagar");
		}
		System.out.println("Time taken by StringBuilder = "+(System.currentTimeMillis()-startTime)+"ms");
	}
}
