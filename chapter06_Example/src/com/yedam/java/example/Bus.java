package com.yedam.java.example;

public class Bus {

	private int busNumber;
	private int passengerCount;
	private int money;

	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	// 메소드
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}

	public void showInfo() {
		System.out.println("버스" + busNumber + "번의 승객은" + passengerCount + "명이고,"
				           + "수입은" + money + "입니다.");
	}
}
