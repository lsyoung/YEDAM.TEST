package com.yedam.java.feedback;

public class product {

	String name;
	int price;

	public product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() { // getName(매개변수없음)
		return this.name;// 필드값을 리턴
	}

	public int getPrice() {
		return this.price;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setprice(int price) {
		this.price = price;
	}

}
