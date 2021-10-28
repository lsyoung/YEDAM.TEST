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
		
		
						
		while (run) {
			System.out.println("==1.주사위크기 2.주사위굴리기 3. 결과보기 4. 가장많이나온수 5.종료.");
			System.out.println("메뉴 > ");
			int selct = sc.nextInt();

			switch (selct) {
			case 1:
				System.out.println("주사위 크기 > ");
				number = sc.nextInt();

				if (5 <= number && number <= 10) {

				} else {
					System.out.println("입력한 값이 범위를 벗어났습니다. 5~10사이 수를 입력해주세요.");
				}
				break;
			case 2:

				while (true) {
					numlist = new int[count];
					count++;
					int num = (int) (Math.random() * 10) + 1;
					if (num == 5) {
						break;
					}
				}
				System.out.printf("%d가 나올때까지 주사위를 %d번 굴렸습니다.\n", 5, count);
				break;
			case 3:

				    for (int i = 1; i < numlist.length; i++) {
				    	System.out.println((i + 1) + " : " +numlist[i]);
			           }
//					switch (1) {
//
//					case 1:
//						System.out.printf("%d은%d번나왔습니다.\n", 1, count);
//					case 2:
//						System.out.printf("%d은%d번나왔습니다.\n", 2, count);
//					case 3:
//						System.out.printf("%d은%d번나왔습니다.\n", 3, count);
//					case 4:
//						System.out.printf("%d은%d번나왔습니다.\n", 4, count);
//					case 5:
//						System.out.printf("%d은%d번나왔습니다.\n", 5, count);
//					case 6:
//						System.out.printf("%d은%d번나왔습니다.\n", 6, count);
//					case 7:
//						System.out.printf("%d은%d번나왔습니다.\n", 7, count);
//					case 8:
//						System.out.printf("%d은%d번나왔습니다.\n", 8, count);
//
//					}
				    break;

//				for(int i = 1; i<numlist.length ; i++) {
//					System.out.println((i + 1) + "은"+ numlist[i]+" 번 나왔습니다.");
//					}
				

			case 4:
				int max = 0;
				for (int i = 0; i < numlist.length; i++) {
					if (numlist[i] > max)
						max = i;
				}
				System.out.println("가장 많이 나온수는"+max + 1+"입니다.");
				break;

			case 5:
				run = false;
				System.out.println("종료.");
				break;
			}
				

	}
		

	
}

