package com.yedam.java.example;

public class Account {

 /* 문제2) 다음을 만족하는 클래스 Account를 작성하시오.
		· 다음의 2 개의 필드를 선언
			private String owner;
			private long balance;
		· 위 모든 필드에 대한 getter와 setter의 구현
		· 위 모든 필드를 사용하는 가능한 모든 생성자의 구현*/
 
	private String owner;
	private long balance;
	
	public Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public long deposit(long amount) {
		balance += amount;
		return balance;
	}
	public long withdraw(long amount) {
		if(amount> balance) {
			System.out.println("잔액이부족합니다.");
		}else {
			balance -=amount;
		}
		return balance;
	}
	public static void main(String[] args) {
		Account ac = new Account("자바",50000);

		System.out.println("저축: "+ac.deposit(10000));
		System.out.println("인출: "+ac.withdraw(5000));
		System.out.println("잔고: "+ac.getBalance());
		
	    ac.withdraw(60000);
	    System.out.println(ac.balance);
	}
	
	
	
	/*
	 문제3) 위에서 구현된 클래스 Account에서 다음 기능을 추가하여 작성하시오.
	· 메소드 deposit()의 헤드는 다음과 같으며 인자인 금액을 저축하는 메소드
		public long deposit(long amount)
	· 메소드 withdraw()의 헤드는 다음과 같으며 인자인 금액을 인출하는 메소드
		public long withdraw(long amount)
	· Account 클래스의 main() 메소드에서 Account 객체를 생성하여 적당한 저축과 인출을 수행한 후 잔금을 출력
	
	 문제4)  위에서 구현된 메소드 withdraw()를 다음 조건에 맞게 다시 작성하시오.
	· 인출 상한 금액은 잔액까지로 하며, 이 경우 이러한 상황을 출력
	· 클래스 AccountTest의 main() 메소드에서 인출 상한 이상의 금액을 인출하려는 메소드를 호출하여 출력

//필드	
	private String owner;
	private long balance;

//생성자
	public Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}

//getter,setter		
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	 
	public long deposit(long amount) {
		balance +=amount;
		return balance;
	}
	public long withdraw(long amount) {
		if(amount>balance) {
			System.out.println("잔액이 부족합니다");
		}else {
			balance -=amount;
		}
		return balance;
		
	}
	public static void main(String[] args) {
		Account account = new Account("이설",10000);
		account.deposit(10000);
		account.withdraw(20000);
		System.out.println("현재 잔고: "+account.getBalance());
		
		account.withdraw(1000000);
	}*/
	
}
