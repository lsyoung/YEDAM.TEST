package com.yedam.java.ch01;

public class Main {

	public static void main(String[] args) {
		// 람다식:(매개변수,...) -> {실행문}
		// @FuntionalInterface

		MyFunctionalInterfaceA fa;
		fa = new MyFunctionalInterfaceA() {

			@Override
			public void method() {
				System.out.println("익명구현개체입니다.");

			}
		};
		fa.method();
		fa = () -> {
			String str = "method call1";
			System.out.println(str);
		};
		fa.method();

		fa = () -> System.out.println("람다식 표현법");
		fa.method();
		System.out.println();
		
		// 매개변수가 있는 람다식
		MyFunctionalInterfaceB fb;
		fb = new MyFunctionalInterfaceB() {
			@Override
			public void method(int x) {
				System.out.println(x + 5);
			}
		};
		fb.method(2);

		System.out.println();
		fb = (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		fb.method(10);

		fb = x -> System.out.println(x + 5);
		fb.method(5);
		System.out.println();

		// 리턴값이 있는 람다식
		MyFunctionalInterfaceC fc;
		fc = new MyFunctionalInterfaceC() {

			@Override
			public int method(int x, int y) {
				return x + y;
			}
		};
		System.out.println(fc.method(1, 2));

		fc = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fc.method(1, 2));

		fc = (x, y) -> x + y;
		System.out.println(fc.method(1, 2));

		fc = (x, y) -> {
			return x + y;
		};
		System.out.println(fc.method(1, 2));

		fc = (x, y) -> sum(x, y);
		System.out.println(fc.method(1, 2));
		System.out.println();
		
		MyNumber max = (x,y)->(x >= y)? x : y;
		System.out.println(max.getMax(10, 20));

	}

	public static int sum(int x, int y) {
		return (x + y);
	}
}
