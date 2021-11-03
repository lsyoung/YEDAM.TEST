package com.yedam.java.example;

public class GreenCard implements Payment {
	private final String name = "GreenCard"; // 카드명
	private String grade; // 적립 등급
	private int point; // 적립 포인트
	private double pointRatio; // 포인트 적립율

	public GreenCard() {
		this.grade = "SILVER";
		this.point = 0;
		this.pointRatio = 0.05;
	}

	// 가격을 넘겨받아 포인트 적립율에 따른 포인트를 적립하고 각 결제방식별 추가할인율을 적용한 가격을 반환하는 메소드
	@Override
	public int getprice(int price) {
		return point += pointRatio * price;
	}

	@Override
	public void onLinePay() {
		return price * 0.03;
	}

	@Override
	public void offLinePay() {
		return price -= price * 0.01;

	}

	@Override
	public void simplePay() {
		return price -= price * 0.05;
	}

	@Override
	public void cardName() {
		System.out.println("카드명:");
	}

	@Override
	public String grade() {
		System.out.println("적용등급: ");
		return null;
	}

	@Override
	public double saleRatio() {
		System.out.println("할인율: ");

		return 0;
	}

	@Override
	public double pointRatio() {
		System.out.println("포인트 적립율: ");
		return 0;
	}

	@Override
	public int point() {
		System.out.println("적립포인트: ");

		return 0;
	}

}
