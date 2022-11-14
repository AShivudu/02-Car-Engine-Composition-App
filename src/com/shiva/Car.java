package com.shiva;

public class Car {
	public void drive() {
		Engine e = new Engine();
		int start = e.start();
		if (start >= 2) {
			System.out.println("Engine having Some Problems..!!");
		} else {
			System.out.println("Engine satrted..!!");
		}
	}

}
