package com.yedam.java.ch02_02;

public class HankookTire extends Tire {

	// 생성자
	public HankookTire(String location, int maxRotation) {
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