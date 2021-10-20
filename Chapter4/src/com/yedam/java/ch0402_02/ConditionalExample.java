package com.yedam.java.ch0402_02;

public class ConditionalExample {

	public static void main(String[] args) {
		
		for(int i=2 ; i<=9 ; i++) {
		for(int j=1 ; j<=9 ; j++ ) {
			System.out.println(i+"X"+j+"="+i*j);
		}
	}
		int m=1;
		while(m<=10){
		    System.out.println(m);
		    m++;
		}
		//1~100까지 합을 출력
		int sum = 0;
		int i = 0;
		while (i<=100) {
			sum +=i;
			i++;  //sum = sum+i++;
		}
		System.out.println(sum);
		
		int index=1;
		while(index!=1) {
			System.out.println("while 반복문이"+index+"번 실행됩니다.");
		}
		do {
			System.out.println("do~while 반복문이"+ index+"번 실행됩니다.");
		}while (index!=1);
		
		while(true) {
			int num= (int)(Math.random()*6)+1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		One:for (char upper='A'; upper<='Z' ; upper++) {
			for(char lower ='a' ; lower <='z'; lower++) {
				System.out.println(upper+"-"+lower);
				if (lower=='g') {
					break One;
				}
			}
		}
		for(int j=1; j<=10; j++) {
			if(j%2 == 0) {
				continue; //짝수인경우
			}
			System.out.println(j);//홀수만출력
		}
  }
}
