package com.yedam.java.example;

public class Rectangle {
	
	 /*문제5) 다음을 만족하는 클래스 Rectangle을 작성하시오.
		· 사각형의 가로와 세로로 객체를 생성하는 생성자
		· 면적을 반환하는 메소드 getArea(), 둘레를 반환하는 메소드 getCircumference(),
		· 다음과 같이 클래스 Rectangle 이용
			Rectangle rc = new Rectangle(3.82, 8.65);
			System.out.println("면적: " + rc.getArea());
			System.out.println("둘레: " + rc.getCircumference());
	 */
	private double high;
	private double wide;
	//생성자
	Rectangle(double high, double wide){
		this.high = high;
		this.wide = wide;
	}
	public double getArea() {
		return high * wide;

	}
	public double  getCircumference() {
		return 2*(high * wide );
	}
	/*//필드
	private double width;
	private double length;
	//생성자
	public Rectangle(double width, double length) {
		this.width=width;
		this.length=length;
	}
	
	//메소드
	public double getArea() {
		return width * length;
	}
	
	public double getCircumference() {
		return (width*2) + (length*2);
	}
	public static void main(String[] args) {
		Rectangle rc = new Rectangle(3.82, 8.65);
		System.out.println("면적: " + rc.getArea());
		System.out.println("둘레: " + rc.getCircumference());
		
	}*/
}
