package com.nt.test;

public class SecondClass {
	
	void m1() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		System.out.println("second fish");
		SecondClass s=new SecondClass();
		s.m1();
	}
}
