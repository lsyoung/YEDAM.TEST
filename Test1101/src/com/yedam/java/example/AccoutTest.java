package com.yedam.java.example;

public class AccoutTest {

	public static void main(String[] args) {
		Account ac = new Account("yedam",50000);
		
		ac.setBalance(50000);
		ac.deposit(0);
		ac.withdraw(55000);
	  
	}
	/* 문제4)  위에서 구현된 메소드 withdraw()를 다음 조건에 맞게 다시 작성하시오.
	· 인출 상한 금액은 잔액까지로 하며, 이 경우 이러한 상황을 출력
	· 클래스 AccountTest의 main() 메소드에서 인출 상한 이상의 금액을 인출하려는 메소드를 호출하여 출력*/
       
}
