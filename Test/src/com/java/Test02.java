package com.java;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// 두수와 사칙연산을 이용하여 나머지수를 구한다
		// 문제2) 두 수를 입력받아 두수의 대소관계 및 사칙연산을 수행하는 프로그램을 구현하세요.
		Scanner scanner = new Scanner(System.in);
		int x = 0;
		int y = 0;

		boolean run = true;
		while (run) {
			System.out.println("input.숫자입력 | +.더하기 | -.빼기 | *.곱하기 | /.나누기 | ?.대소관계 | exit.종료 ");
			System.out.println("수행해야할 명령을 입력하세요. ");
			String menu = scanner.next();

			switch (menu) {
			case "input":
				x = scanner.nextInt();
				y = scanner.nextInt();
				System.out.println("입력숫자: " + x + "," + y);
				break;

			case "더하기":
				int result = x + y;
				System.out.println(result);
				break;
			case "빼기":
				int result1 = x - y;
				System.out.println(result1);
				break;
			case "곱하기":
				int result2 = x * y;
				System.out.println(result2);
				break;
			case "나누기":
				int result3 = x / y;
				System.out.println(result3);
				break;
			case "대소관계":

				if (x > y) {
					System.out.println("x가크다.");
				} else if (x < y) {
					System.out.println("y가크다");
				} else if (x == y) {
					System.out.println("x와y는 같다.");
				}
				break;
			case "exit":
				run = false;
				System.out.println("종료");
				break;

			}

		}

	}

}
