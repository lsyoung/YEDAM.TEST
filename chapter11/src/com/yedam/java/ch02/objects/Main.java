package com.yedam.java.ch02.objects;

import java.util.Objects;

public class Main {

	public static void main(String[] args) {
		// objects.compare(객체1,객체2, interface Comparator) //객체1,2를 interface정의된 내용으로 값을
		// 비교
		Student s1 = new Student(1);
		Student s2 = new Student(2);
		Student s3 = new Student(3);

		int result = Objects.compare(s1, s2, new StudentComparator());
		System.out.println(result);
		result = Objects.compare(s1, s3, new StudentComparator());
		System.out.println(result);

		System.out.println();

		// objects.equals(객체1,객체2)->얇은복제에사용,  deep equals

		Integer o1 = 1000;
		Integer o2 = 1000;

		System.out.println(o1 == o2);
		System.out.println(Objects.equals(o1, o2));
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, o2));
		System.out.println(Objects.equals(null, null));
		System.out.println(Objects.deepEquals(o1, o2));

		System.out.println();

		Integer[] arr1 = { 1, 2 };
		Integer[] arr2 = { 1, 2 };
		System.out.println(arr1 == arr2);
		System.out.println(Objects.equals(arr1, arr2));
		System.out.println(Objects.deepEquals(arr1, arr2));//내부값을 비교
		System.out.println(Objects.deepEquals(arr1, null));
		System.out.println(Objects.deepEquals(null, arr2));
		System.out.println(Objects.deepEquals(null, null));
		
		System.out.println();
		//해시코드생성 hash(), hashCode()
		//- Objects.hashCode(객체):객체.hashCode();
		//- Objects.hash(필드1, 필드2,...):주어진 매개값들로 배열로 생성하고 
		//  Array.hashCode(Object[])로 호출
		
		Student s4 = new Student(1,"홍길동");
		Student s5 = new Student(1,"홍길동");
		System.out.println(s4==s5);
		System.out.println(s4.hashCode());
		System.out.println(Objects.hashCode(s5));//s5 s4 hashCode가같다
		
		System.out.println();
		
		//객체의 널 여부 조사: isNull, nonNull, requireNonNull
		String str1 ="홍길동";
		String str2 = null;
		
		System.out.println(Objects.isNull(str1));
		System.out.println(Objects.nonNull(str2));
		System.out.println(Objects.requireNonNull(str1));
		
		try {
		String strResult = Objects.requireNonNull(str2, "이름이없습니다.");
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		
		//Objects.toString(객체)
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2,"이름이 없습니다"));
	}

}
