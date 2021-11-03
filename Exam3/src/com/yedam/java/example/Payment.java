package com.yedam.java.example;

public interface Payment {
	//각 결제방식에 따른 추가할인율을 필드로 선언
	double OFFLINE_RATIO =0.1;
	double ONLINE_RATIO= 0.3;
	double SIMPLEPAY_RATIO=0.5;
	//가격을 넘겨받아 포인트 적립율에 따른 포인트를 적립하고 각 결제방식별 추가할인율을 적용한 가격을 반환하는 메소드
	public int getprice (int price);
	
	//결제방식 : 오프라인, 온라인, 간편결제
	public void onLinePay();
	public void offLinePay();
	public void simplePay();
	
	//카드정보 및 적립포인트를 출력하는 메소드
	//출력정보 : 카드명, 적용등급, 할인율, 포인트적립율, 적립포인트
	public void cardName();
	public String grade();
	public double saleRatio();
	public double pointRatio();
	public int point();
}
