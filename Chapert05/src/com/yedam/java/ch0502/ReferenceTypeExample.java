package com.yedam.java.ch0502;

public class ReferenceTypeExample {

	public static void main(String[] args) {
		// int[] scores = new int[3];// | 0 | 0 | 0 |
		int[] scores = { 83, 90, 87 }; // | 83| 90| 89|

		System.out.println("score[0] : " + scores[0]);
		System.out.println("score[1] : " + scores[1]);
		System.out.println("score[2] : " + scores[2]);

		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3;
		System.out.println("평균 : " + avg);

		int[] scores1;
		scores1 = new int[] { 83, 90, 87 };

		for (int i = 0; i < 3; i++) {
			System.out.println("scores1[" + i + "]=" + scores1[i]);
		}
//		int result = add(new int[] { 83, 90, 87 });
		System.out.println("=======================================");

		int[] arr1 = new int[3];
		for(int i=0; i<3 ; i++) {
			System.out.println("arr1["+i+"]=" +arr1[i]);
		}
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for(int i=0; i<3 ; i++) {
			System.out.println("arr1["+i+"]=" +arr1[i]);
		}
		System.out.println("=======================================");
		
		String[] arr3 =  new String[3];
		for (int i=0 ; i<3; i++) {
			System.out.println("arr3["+i+"]="+arr3[i]);
		}
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for (int i=0 ; i<3; i++){
			System.out.println("arr3["+i+"]="+arr3[i]);
		}
		System.out.println("=======================================");
		
		int[] scores3 = {83,90,87};
		int sum3=0;
		for(int i=0 ;i<scores.length; i++) {
	
			sum3 += scores[i];
		}
		double avg3 = (double)sum3 /3;
		System.out.println("총합 : "+ sum3);
		System.out.println("평균 : "+ avg3);
		
	    System.out.println("|=======================================|");
	    
		int max =0; 
		int sum1 =0;
		int[] array = {1,5,3,8,2};
		
		for (int i =0; i<array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			
			sum1+=array[i];
		}
		System.out.println(max);
		System.out.println(sum1);
		
		int count =0;
		while(true) {
		   int x = (int)(Math.random()*6)+1;
		   int y = (int)(Math.random()*6)+1;
		   count++;
		   int result = x+y;
		   if(result == 5) {
			   System.out.printf("(%d,%d)", x,y);
			   break;
		   }   
		} 
		System.out.println("주사위 던진횟수는 "+count+"번입니다.");
		  

	   
   }
		
 
//
//	public static int add(int[] scores) {
//		int sum = 0;
//		for (int i = 0; i < 3; i++) {
//			sum += scores[i];
//		}
//		return sum;
//	}
	
}
