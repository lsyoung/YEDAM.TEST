package com.yedam.java.example;

public class VIPCard implements Payment {
	private final String name = "VIPCard"; // 카드명
	private String grade; // 적용 등급
	private double saleRatio; // 할인율
	private int point; // 적립 포인트
	private double pointRatio; // 포인트 적립율

	public VIPCard() {
		this.grade = "GOLD";
		this.saleRatio = 0.1;
		this.point = 0;
		this.pointRatio = 0.03;
	}

	@Override
	public int getprice(int price) {

		return 0;
	}

	@Override
	public void onLinePay() {

	}

	@Override
	public void offLinePay() {

	}

	@Override
	public void simplePay() {

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
