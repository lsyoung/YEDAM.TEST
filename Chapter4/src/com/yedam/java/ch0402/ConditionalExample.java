package com.yedam.java.ch0402;

public class ConditionalExample {

	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
		 System.out.println(i);
		}
		//
        int sum = 0;
        for(int i=1; i<=100; i++) {
        	System.out.println(i);
        	sum +=i;
        }
        System.out.println(sum);
//        int i = 0;
//        for(; i<=100;) {
//        	sum +=1;
//        	i++;
//        	System.out.println(sum);
//        }
        for (int i = 0, j = 100; i <=50 && j>=50; i++,j--) {}
        
        
        
	}

}
