package com.yedam.java.ch0302;

public class OperatorExample {

	public static void main(String[] args) {
	
	    int m, n, total;
		m = n = 10;
		//1번 부호연산자를 이용하여 변수m의값을 음수로 변경 출력
		//단, 변수 m의값은 변하지 않습니다.
		//2번 변수m,n값을 더한 후 n의 값을 증가시키는 연산식을 한줄로작성
		//3번 변수m,n  값을 더한 값이 10이되도록 변수 m,n중하나의 변수에 증감연산자 사용
		//4번 변수m에서 변수n 을 나눈 후 몫과 나머지 출력
		
		total = -m;
		System.out.println(total);
		total= m+n;
//		n=n+1
		total = m + (n+1);
		total = m + n++;    
	    System.out.println(total);
	    //total= m + --n
	    total = m + --n;
	    System.out.println(total);
	   
	    System.out.printf("몫: %d, 나머지:%d \n",(m/n), (m%n));
	    
	    //비교연산자
	    int num1 = 10;
	    int num2 = 10;
	    boolean bResult1, bResult2, bResult3;
	    bResult1 = (num1== num2);
	    bResult2 = (num1 != num2);
	    bResult3 = (num1 <= num2);
	    System.out.println(bResult1);
	    System.out.println(bResult2);
	    System.out.println(bResult3);
	    
	    char char1 ='A';
	    char char2 ='B';
	    boolean bResult4 = (char1 < char2);
	    System.out.println(bResult4);
	    
	    int v3 =1;
	    double v4 = 1.0;
	    System.out.println(v3 == v4);
	    
	    double v5 = 0.1;
	    float v6 = 0.1f;
	    System.out.println(v5 == v6);
	    System.out.println((float)v5 == v6);
	    
	    int charCode = 'A';//65
	    //유니코드 중 65보다 크거나 같으며 90보다 작거나 같아야 대문자
	    if((charCode>=65) & (charCode<=90)){
	    	System.out.println("대문자");
	    	
	    }
	    //유니코드중 97보다 크거나 같으며 122보다 작거나 같으면 소문자
	    if((charCode>=97) & (charCode<=122)){
	    	System.out.println("소문자");
	    }
	    //유니코드 중 48보다 크고 57보다 작아야 숫자0~9
	    if((charCode>48) & (charCode<57)){
	        System.out.println("숫자0~9");
	    }
	    int numValue = 6;
	    //2의 배수 이거나 3의배수가 맞는지
	    if((numValue%2==0)|| (numValue%3==0)) {
	    	System.out.println("2또는 3의 배수군요");
	    //대입연산자 = +(사칙연산자.논리연산자.논리부정연산자)
	    int intResult = 0;
	    intResult +=10; //intResult + 10 = intResult
	    System.out.println(intResult);
	    intResult -=5;//intResult -5  = intResult
	    System.out.println(intResult);
	    intResult *=3;//intResult * 3 = intResult
	    System.out.println(intResult);
	    intResult /=5;//intResult /5 = intResult
	    System.out.println(intResult);
	    intResult %=3; //intResult %3 = intResult
	    System.out.println(intResult);
	    //삼항 연산자
	    int score = 95;
	   
//	    //점수가 90점보다 크면 등급 A라고 주고 90보다 작거나 같으면 등급B를 준다.
	    //char grade = '';
//	    if(score>90) {
//	    	grade = 'A';
//	    }else if (score<=90) {
//	    	grade = 'B';
//	    }
//	    System.out.printf("등급은 %c입니다.\n" ,grade);
	    char grade = (score >90)? 'A' : 'B';
	    System.out.printf("등급은 %c입니다.\n" ,grade);
	    }
	    int age =27;
	    String str = (age>20)? "성인" : "미성년";
	    System.out.printf ("나이는 %d이고 %s 입니다. \n",age,str);
	}

}
