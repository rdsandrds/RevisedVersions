package com.app.demo;

class A{}

public class Example {
	/*static int a;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int p = 0;
				char b=98;
				char q=255;
		System.out.println(b);
		System.out.println(q);*/

	static void m1(A a) {
		System.out.println("m1");
	}
	
	static A m2(String s) {
		System.out.println("m2");
		return new A();
	}

	
	public static void main(String[] args) {
		A a1 = new A();
		m1(a1);
		m2("Hari");
		A a2 = m2("krishna");
		System.out.println(m2("Naresh It"));
	}
}
