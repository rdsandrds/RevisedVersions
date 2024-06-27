package com.app.demo5;

class A15 {
	void m1() {
		System.out.println("A m1");
	}

	void m2() {
		System.out.println("A m2");
		m1();
	}
}

class B15 extends A15 {
	void m1() {
		System.out.println("B m1");
	}

	void m3() {
		System.out.println("B m3");
		m1();
		super.m2();
	}
}

class C15 extends B15 {
	void m2() {
		System.out.println("C m2");
		m3();
	}
}

class D15 extends C15 {
	void m1() {
		System.out.println("D m1");
	}

	void m2() {
		System.out.println("D m2");
	}

	void m4() {
		System.out.println("D m4");
	}

	public static void main(String[] args) {
		D15 d = new D15();
		d.m1();
		d.m2();
		d.m3();
		d.m4();
	}
}