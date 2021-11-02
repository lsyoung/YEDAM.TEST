package com.yedam.java.ch01_01;

public class D {
	//로컬 클래스에서 사용 제한
	
	//자바 7이전
	public void method1(final int arg) {
		final int localVariable = 1;
		
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	public void method2(int arg) {
		int localVariable = 1;
		
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}

}
