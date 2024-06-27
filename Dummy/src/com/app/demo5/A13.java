package com.app.demo5;

class A13 {
	void m1() {
		System.out.println("A m1");
	}

	void m2() {
		System.out.println("A m2");
		m1();
	}
}

class B13 extends A13 {
	void m1() {
		System.out.println("B m1");
	}

	public static void main(String[] args) {
		B13 b = new B13();
		b.m1();
		b.m2();
		//A13 a = new B13();
		B13 b1= (B13) new A13();
		b1.m1();
		b1.m2();
	}
}