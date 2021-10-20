package com.yedam.java.ch0403;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
	 
			Scanner scanner = new Scanner(System.in);
			
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			if (x>0 && y>0) {
				System.out.println("제1사분면");
			}else if (x<0 && y>0) {
				System.out.println("제2사분면");
			}else if (x<0 && y<0) {
				System.out.println("제3사분면");
			}else    {
				System.out.println("제4사분면");
			}
			
			int year = scanner.nextInt();
			
			if(year%4 == 0) {
				if(year%100 != 0 || year%400==0) {
					System.out.println(year+ "년은 윤년입니다.");
				}else {
					System.out.println(year+ "년은 윤년이 아닙니다");
				}
			}else {
					System.out.println(year+"년은 윤년이 아닙니다.");
				}
			
			String value = scanner.next();
			
			switch(value) {
			case "가위":
				System.out.println("이기기위해선 주먹을 내야합니ㅣ다.");
				break;
			case "보":
				System.out.println("이기기위해선 가위를 내야합니다.");
				break;
			case "바위":
				System.out.println("이기기위해선 보를 내야합니다.");
				break;
			}
		    
			String tree = "";
			for(int i=1; i<=5;i++) {
				tree+="*";
				System.out.println(tree);
			}
			int m= scanner.nextInt();
			int n= scanner.nextInt();
			
			for(int i=1 ; i<=n ; i++) {
			    System.out.println(m+"X"+i+"="+m*i);	
		}		
			
			
	}

}
