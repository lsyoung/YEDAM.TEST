package com.yedam.java.example;


public abstract class Member {
	int record;		//전월실적
	String grade;	//회원등급
	//등급을 나누는 기준을 정적 상수 필드로 선언
	static final int gold = 1000000;
	static final int silver;
	//전월실적을 넘겨받아 초기화하는 생성자
	Member(int record){
		this.record = record;
	}
	//현재 실적 및 회원등급을 출력하는 메소드 : 출력 예시) 현재 실적은 1100000이며, 회원등급은 GOLD입니다.
	public String showCustomerInfo() {
		return "현재실적은 " +record+"회원등급은 "+grade;
	}
	
	//해당 추상클래스를 상속하는 실체클래스 두 개(Silver, Gold) 클래스를 선언하고
	public abstract void getgrade();
	//전월 실적에 따라 해당하는 인스턴스를 반환하는 메소드
}
