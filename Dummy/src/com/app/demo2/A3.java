package com.app.demo2;

class A3 {
	int x = 10;
	{
		System.out.println("A NSB");
		System.out.println("x: " + x);
	}

	A3() {
		System.out.println("A Constructor");
		x = 5;
	}
}

class B3 extends A3 {
	int y = 20;
	{
		System.out.println("B NSB");
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}

	B3() {
		System.out.println("B3 Constructor");
		y = 6;
	}

	public static void main(String[] args) {
		System.out.println("B main");
		B3 b1 = new B3();
		System.out.println("x: " + b1.x);
		System.out.println("y: " + b1.y);
	}
}