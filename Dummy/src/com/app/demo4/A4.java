package com.app.demo4;

class A4 {
	static int a = 10;
	int x = 30;

	A4() {
		System.out.println("A class constructor");
		x = 5;
	}
}

class B4 extends A4 {
	static int b = 20;
int y = 40;

	B4() {
		System.out.println("B class constructor");
		y = 6;
	}

	public static void main(String[] args) {
		B4 b = new B4();
		System.out.println(a);
		System.out.println(b.y);
		System.out.println(b);
		System.out.println(b.x);
	}
}