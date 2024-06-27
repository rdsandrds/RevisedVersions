package com.app.demo5;

class Example {
	Example() {
		System.out.println("Ex no-arg");
	}

	Example(int a) {
		System.out.println("Ex int-arg");
	}
}

class Sample extends Example {
	Sample() {
		System.out.println("Sa no-arg");
	}

	Sample(int a) {
		super(50);
		System.out.println("Sa int-arg");
	}

	public static void main(String[] args) {
		Sample s1 = new Sample();
		Sample s2 = new Sample(10);
	}
}