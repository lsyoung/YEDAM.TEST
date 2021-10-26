package com.yedam.java.example;

public class Student {

	private String studentName;
	private int money;

	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		//버스에 요금을 지불
		bus.take(1000);
		this.money -= 1000;
	}
	public void takeSubway(Subway subway) {
		//지하철 요금을 지불
		subway.take(1500);
		this.money -=1500;
	}
	
	public void showInfo() {
		System.out.println(studentName+"님의 남은돈은"+money+"원 입니다.");
	}

}
