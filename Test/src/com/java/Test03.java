package com.java;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// 문제 3) 입력한 수만큼 주사위(1~6)를 굴려서 나온 수들 중 최고 수와 최저 수, 수들의 합을 구하는 프로그램을 구현하세요
		Scanner scanner = new Scanner(System.in);

		int[] numList = null;
		int size = 0; //주사위 굴릴 횟수

		boolean run = true;

		while (run) {
			System.out.println("1.숫자입력 | 2.주사위 굴리기 | 3.최고 수 | 4.최저 수 | 5.총합 | 6.종료");
			System.out.println("선택 > ");
			int selectNo = scanner.nextInt();

			switch (selectNo) {
			case 1:
				System.out.println("숫자입력 >");
				size = scanner.nextInt();
				numList = new int[size];
				break;
			case 2:
				for (int i = 0; i < numList.length; i++) {
					int num = (int) (Math.random() * 6) + 1;
					numList[i] = num;
//					numList[i] = (int) (Math.random() * 6) + 1;
				}
				break;
			case 3:
				int max = 1;// 주사위값이 1부터시작이기떄문에
				int indexOfMax = 0;
				for (int i = 0; i < numList.length; i++) {
					if (numList[i] > max) {
						max = numList[i];
						indexOfMax = i;
					}
				}
				System.out.printf("주사위를 굴린결과 최고 숫자는 %d번 굴렸을때 나온%d입니다.\n", indexOfMax + 1, max);
				break;
			case 4:
				int Min = 6;
				int indexOfMin = 0;
				for (int i = 0; i < numList.length; i++) {
					if (numList[i] < Min) {
						Min = numList[i];
						indexOfMin = i;
					}
				}
				System.out.printf("주사위를 굴린결과 최저 숫자는 %d번 굴렸을때 나온%d입니다.\n", indexOfMin + 1, Min);
				break;
			case 5:
				int sum = 0;
				for(int num : numList) {
					sum +=num;
				}
				System.out.println("총합: "+sum);
				break;
			case 6:
				run = false;
				System.out.println("종료");
				break;

			}
		}
	}
}
