package com.yedam.java.ch01_01;

public class B {
	//바깥필드와 메소드에서 사용제한
	//인스턴스 필드
	X field1 = new X();
	Y field2 = new Y ();
	//정적필드
	//static X field3 = new X();
	static Y field4 = new Y();
	
	//인스턴스 메소드
	void method1() {
		X var1 = new X();
		Y var2 = new Y();
	}
	//정적메소드
	static void method2() {
		//X var3 =new X();
		Y var4 = new Y();
	}
	//인스턴스 멤버 클래스
	class X{}
	//정적멤버클래스
	static class Y{}
}
