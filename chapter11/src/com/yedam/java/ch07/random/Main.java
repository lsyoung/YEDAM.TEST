package com.yedam.java.ch07.random;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		//선택번호
		int[]selectNumber =  new int[6];
		Random random = new Random(3);
		System.out.println("선택번호: ");
		for(int i = 0; i<6 ; i++) {
			selectNumber[i] =random.nextInt(45)+1;
			System.out.print(selectNumber[i]+" ");
		}
		System.out.println();
		//당첨번호
		int[] winningNumber =  new int[6];
		random = new Random(5);
		System.out.println("선택번호: ");
		for(int i = 0; i<6 ; i++) {
			winningNumber[i] =random.nextInt(45)+1;
			System.out.print(winningNumber[i]+" ");
	}
		System.out.println();
		
		//당첨여부
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);
		if(result) {
			System.out.println("1등에 당첨되셨습니다.");
		}else {
			System.out.println("당첨되지 않았습니다.");
		}

}
}