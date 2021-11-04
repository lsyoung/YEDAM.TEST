package com.yedam.java.example;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<Student, String> hashMap = new HashMap<Student, String>();
		hashMap.put(new Student("1"), "95");
		
		String score = hashMap.get(new Student("1"));
		System.out.println(score);

		byte[] bytes = { 73, 32, 108, 111, 118, 101, 32, 121, 111, 117 };
		String str = new String(bytes);
		System.out.println(str);
		
		Member member = new Member("blue", "이파란");
		System.out.println();
		String string = "모든 프로그램은 자바 언어로 개발 될 수 있다.";
		int index= string.indexOf("자바");
		if(index == -1) {
			System.out.println("자바 문자열이 포함되어 있지 않습니다.");
		}else {
			System.out.println("자바 문자열이 포함되어 있습니다.");
			 String newstring = string.replace("자바","JAVA");
			 System.out.println(newstring);
		}
		
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1==obj2);
		System.out.println(obj3==obj4);
		
		String strData1 = "200";
		int intData1 = Integer.parseInt("200");
		System.out.println(intData1);
				
		int intData2 =150;
		String strData2 = String.valueOf(150);
		System.out.println(strData2);
				
	}
	

}
