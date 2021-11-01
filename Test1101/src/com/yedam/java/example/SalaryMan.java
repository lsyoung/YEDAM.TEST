package com.yedam.java.example;

public class SalaryMan {
	/*
	 * 문제1) 다음을 만족하는 클래스 SalaryMan을 작성하시오. · 필드 salary는 월 급여액를 저장하며, int형으로 초기 값으로
	 * 1000,000 저장 · 메소드 getAnnualGross()는 연봉을 반환하는 메소드로 월급에 보너스 500%로 계산 · 기본 생성자에서
	 * 필드 salary의 초기 값을 사용하며, 정수형 인자인 생성자에서 인자가 월 급여액으로 지정 · 다음과 같이 객체를 생성하여 메소드
	 * getAnnualGrass()를 호출하여 출력 System.out.println(new
	 * SalaryMan().getAnnualGross()); System.out.println(new
	 * SalaryMan(2_000_000).getAnnualGross());
	 */
	// 필드
	private int salary = 1000000;
	private String SalaryMan;

	// 생성자
	public SalaryMan() {
		this.salary = salary;

	}

	SalaryMan(int salary) {
		this.salary = salary;
	}

	// 메소드

	public int getAnnualGross() {
		int Annual = (salary * 12) + salary * 5;
		return Annual;
	}

	public static void main(String[] args) {
		
		
		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2000000).getAnnualGross());
	}

	/*// 필드
	private int salary = 1000000;
	// 생성자
	public SalaryMan() {
		this.salary= salary;
		
	}
	public SalaryMan(int salary) {
		this.salary= salary;
		
	}
	

	// 메소드
	public int getAnnualGross() {
		return salary = (salary*12) + (salary*5);
		

	}
	
	
	//메인
	public static void main(String[] args) {
		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2000000).getAnnualGross());
	}*/
}
