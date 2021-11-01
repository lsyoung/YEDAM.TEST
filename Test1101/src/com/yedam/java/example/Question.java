package com.yedam.java.example;

public class Question {

	/*
	 문제1) 다음을 만족하는 클래스 SalaryMan을 작성하시오.
		· 필드 salary는 월 급여액를 저장하며, int형으로 초기 값으로 1000,000 저장
		· 메소드 getAnnualGross()는 연봉을 반환하는 메소드로 월급에 보너스 500%로 계산
		· 기본 생성자에서 필드 salary의 초기 값을 사용하며, 정수형 인자인 생성자에서 인자가 월 급여액으로 지정
		· 다음과 같이 객체를 생성하여 메소드 getAnnualGrass()를 호출하여 출력
			System.out.println(new SalaryMan().getAnnualGross());
			System.out.println(new SalaryMan(2_000_000).getAnnualGross());
			
	 문제2) 다음을 만족하는 클래스 Account를 작성하시오.
		· 다음의 2 개의 필드를 선언
			private String owner;
			private long balance;
		· 위 모든 필드에 대한 getter와 setter의 구현
		· 위 모든 필드를 사용하는 가능한 모든 생성자의 구현
		
	 문제3) 위에서 구현된 클래스 Account에서 다음 기능을 추가하여 작성하시오.
		· 메소드 deposit()의 헤드는 다음과 같으며 인자인 금액을 저축하는 메소드
			public long deposit(long amount)
		· 메소드 withdraw()의 헤드는 다음과 같으며 인자인 금액을 인출하는 메소드
			public long withdraw(long amount)
		· Account 클래스의 main() 메소드에서 Account 객체를 생성하여 적당한 저축과 인출을 수행한 후 잔금을 출력
		
	 문제4)  위에서 구현된 메소드 withdraw()를 다음 조건에 맞게 다시 작성하시오.
		· 인출 상한 금액은 잔액까지로 하며, 이 경우 이러한 상황을 출력
		· 클래스 AccountTest의 main() 메소드에서 인출 상한 이상의 금액을 인출하려는 메소드를 호출하여 출력
		
	 문제5) 다음을 만족하는 클래스 Rectangle을 작성하시오.
		· 사각형의 가로와 세로로 객체를 생성하는 생성자
		· 면적을 반환하는 메소드 getArea(), 둘레를 반환하는 메소드 getCircumference(),
		· 다음과 같이 클래스 Rectangle 이용
			Rectangle rc = new Rectangle(3.82, 8.65);
			System.out.println("면적: " + rc.getArea());
			System.out.println("둘레: " + rc.getCircumference());
	 */
}
