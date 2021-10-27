package com.yedam.java.ch02_02;

public class KumhoTire extends Tire {
	// 필드
	// 생성자
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		accumlatedRotation++;
		if (accumlatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명: " + (maxRotation - accumlatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "Tire 펑크 ***");
			return false;
		}

	}

}
