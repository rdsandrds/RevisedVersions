package com.app.demo2;

class A1 {
	static int a = m1();

	static int m1() {
		System.out.println("A:a");
		return 10;
	}

	static {
		System.out.println("A class is loaded");
	}

	public static void main(String[] args) {
		System.out.println("A main");
	}
}

class B1 extends A1 {
	static int b = m2();

	static int m2() {
		System.out.println("B:b");
		return 20;
	}

	static {
		System.out.println("B class is loaded");
	}

	public static void main(String[] args) {
		System.out.println("B main");
		System.out.println("B main a: " + a);
		System.out.println("B main b: " + b);
	}
}
