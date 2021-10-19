package com.yedam.java.ch0401;

import java.util.Scanner;

public class ConditionalExample {

	public static void main(String[] args) {

		int score = 90;

		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		if (score <= 90)
			System.out.println("점수가 90보다 작습니다.");
		System.out.println("등급은 b입니다");
		System.out.println("============================");
		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
		// IF ~ ELSE IF ~ ELSE구문
		score = 75;
		if (score >= 90) {
			System.out.println("점수가 100~90입니다");
			System.out.println("등급은 A입니다.");
		} else if (score >= 80) {
			System.out.println("점수가 80~89입니다.");
			System.out.println("등급은 b입니다.");
		} else if (score >= 70) {
			System.out.println("점수가 70~79입니다");
			System.out.println("등급은 c입니다.");
		} else {
			System.out.println("점수가 70미만입니다.");
			System.out.println("등급은 d입니다.");
		}
		System.out.println("============================");
		int num = (int) (Math.random() * 6) + 1;
		// 0.0 <= Math.random() < 1.0

		if (num == 1) {
			System.out.println("1번이나왔습니다.");
		} else if (num == 2) {
			System.out.println("2번이나왔습니다.");
		} else if (num == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if (num == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if (num == 5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}
		System.out.println("============================");
//		// 문제1
//		Scanner scanner = new Scanner(System.in);
//		int a = scanner.nextInt();
//		int b = scanner.nextInt();
//
//		if ((a + b) > 0) {
//			System.out.println("Natual Number");
//		}
//
//		// 문제2
//		int x = scanner.nextInt();
//		int y = scanner.nextInt();
//		if (x > y) {
//			System.out.println(">");
//		} else if (x == y) {
//			System.out.println("=");
//		} else if (x < y) {
//			System.out.println("<");
//		}
//		//문제3

//		double weight = scanner.nextDouble();
//		double height = scanner.nextDouble();
//		
//		double bmi = weight / ( height * height);

		int random = (int) (Math.random() *6 ) +1;
		switch(random){
			case 1:
				System.out.println("1번이 나왔습니다.");
			    break;
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			case 3:
				System.out.println("3번이 나왔습니다.");
				break;
			case 4: 
				System.out.println("4번이 나왔습니다.");
				break;
			case 5: 
				System.out.println("5번이 나왔습니다.");
				break;
			default:
				System.out.println("6번이 나왔습니다.");		
		}
		int time = (int)(Math.random()*4)+8;
		System.out.println("현재시각 : "+time+"시");
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		default:
			System.out.println("외근을 나갑니다.");
		}
		char grade ='B';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반회원 입니다.");
		default:
			System.out.println("손님입니다.");
		}
		

	}
}
