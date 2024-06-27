package com.app.demo3;

class PrintNumbers {

//task 1
	void print1To50() {
		for (int i = 1; i <= 50; i++) {
			System.out.print(i + "\t");
			try {
				Thread.sleep(100);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

//task 2
	void print50To1() {
		for (int i = 50; i >= 1; i--) {
			System.out.print(i + "\t");
			try {
				Thread.sleep(100);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
}
