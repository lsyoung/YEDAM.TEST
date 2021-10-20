package com.yedam.java.totaltest;

import java.util.Scanner;

public class TotalTest {

	public static void main(String[] args) {
		// 키보드로부터 학생수와 각 학생들의 점수를 입력받아서
		// 최고점수 및 평균점수를 구하는프로그램입니다.
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("------------------------------------");
			System.out.println("선택 > ");
			int selectNo = scanner.nextInt();

			switch (selectNo) {
			case 1:
				System.out.println("학생수>");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				break;
			case 2:
				for (int i = 0; i < studentNum; i++){
				scores[i] = scanner.nextInt();
			}
				break;
			case 3:
				for (int i = 0; i < studentNum; i++) {
					System.out.println("scores[" + i + "] :" + scores[i]);
				}
				break;
			case 4:
				int max = 0;
				int sum = 0;
				for (int score : scores) {
					if (score > max) {
						max = score;
					}
					sum += score;
				}
				double avg = (double) sum / scores.length;
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
				break;
			case 5:
				run = false;
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

}
