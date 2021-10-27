package com.java;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		//문제1) 세 수를 입력받아 차례대로 두 수와 사칙연산을 이용하여 나머지 수를 구한다고 했을 때 어떤 연산식이 되는 지 구현하세요.
		//		예를 들어, 2, 3, 5를 입력받았을 경우 2 + 3 = 5 를 출력하세요.
		        Scanner scanner = new Scanner(System.in);
		        int x = scanner.nextInt();
		        int y = scanner.nextInt();
		        int z = scanner.nextInt();
		        if (x+y==z) {
		        	System.out.printf("%d + %d = %d \n", x ,y, z);
		        }
		         else if(x-y==z) {
		        	System.out.printf("%d - %d = %d \n", x, y, z);
		        }else if(x*y==z) {
		        	System.out.printf("%d * %d = %d \n", x, y, z);
		        }else if (x/y==z) {
		        	System.out.printf("%d / %d = %d \n", x, y, z);
		        }else {
					System.out.println("사칙연산으로 연산식을 만들 수 없습니다.");
		        }
					
	        //문제4) 로또 번호를 구하는 프로그램을 작성하세요.
	        //int num1 = (int)(Math.random()*45)+1;
		
//		int[] lotto = new int[6];
//
//		for (int i = 0; i < lotto.length ; i++) {
//			lotto[i] = (int) (Math.random() * 45) + 1;
//		}
//		for (int i = 0; i < 6; i++) {
//			System.out.println("로또 번호: "+lotto[i]);
//		}
//		
		
		
			Scanner sc = new Scanner(System.in);
		boolean run = true;
		int count = 0;// 굴릴횟수.
		int number = 0;// 주사위크기.

		while (run) {
			System.out.println("==1.주사위크기 2.주사위굴리기 3. 결과보기 4. 가장많이나온수 5.종료.");
			System.out.println("메뉴 > ");
			int selct = sc.nextInt();

			switch (selct) {
			case 1:
				System.out.println("주사위 크기 > ");
				number = sc.nextInt();
				if (number <= 10) {
					break;
				} else if (number < 5) {
					System.out.println("입력한 값이 범위를 벗어났습니다.");
				}
				break;
			case 2:
				while (true) {
					int num = (int) (Math.random() * 6) + 1;
					count++;
					if (num == 5) {
						break;
					}
				}
				System.out.println("5가 나올때까지 주사위를" + count + "번 굴렸습니다.");
				break;
			case 3:

				while (true) {
				
					int num = (int) (Math.random() * 6) + 1;
					count++;
					switch (num) {

					case 1:
						System.out.printf("%d은%d번나왔습니다.\n", 1, count);
					case 2:
						System.out.printf("%d은%d번나왔습니다.\n", 2, count);
					case 3:
						System.out.printf("%d은%d번나왔습니다.\n", 3, count);
					case 4:
						System.out.printf("%d은%d번나왔습니다.\n", 4, count);
					case 5:
						System.out.printf("%d은%d번나왔습니다.\n", 5, count);
					case 6:
						System.out.printf("%d은%d번나왔습니다.\n", 6, count);
					case 7:
						System.out.printf("%d은%d번나왔습니다.\n", 7, count);
					case 8:
						System.out.printf("%d은%d번나왔습니다.\n", 8, count);

					}

					break;
				}

			case 4:
				break;
			case 5:
				run = false;
				System.out.println("종료.");
				break;
			}
		

	}
		

	
}

