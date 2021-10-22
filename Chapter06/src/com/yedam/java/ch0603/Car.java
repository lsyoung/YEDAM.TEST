package com.yedam.java.ch0603;

public class Car {

	String company = "기아자동차";
	String model;
	String color;
	int maxSpeed;
	int speed;

	// 생성자
	Car() {

	}

	Car(String model) {
		// this.model = model;
		this(model, "은색", 250);
	}

	Car(String model, String color) {
		// this.model = model;
		// this.color = color;
		this(model, color, 250);
	}

	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
