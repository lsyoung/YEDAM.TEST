package com.yedam.java.example;

public class Subway {
	
	private String lineNumber;
	private int passengerCount;
	private int money;
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money +=money;
		this.passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("지하철" + lineNumber + "승객은" + passengerCount + "명이고,"
		           + "수입은" + money + "입니다.");
	}

}
