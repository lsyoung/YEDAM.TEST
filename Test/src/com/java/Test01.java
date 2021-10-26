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
		

	}
		

	
}

