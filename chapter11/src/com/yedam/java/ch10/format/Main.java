package com.yedam.java.ch10.format;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date now = new Date(); // 현재시점의 날짜와 시간

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));

		sdf = new SimpleDateFormat("yyyy.MM.d HH:mm:ss");
		System.out.println(sdf.format(now));

		System.out.println();

		String id = "java";
		String name = "신용권";
		String tel = "010-123-5678";
		// 회원 ID : java \n 회원 이름: 신용권 \n 회원 전화 :010-123-5678
		String text = "회원 ID : {0} \n회원 이름: {1} \n회원 전화 :{2}";
		String result1 = MessageFormat.format(text, id, name, tel); // format 문자형태로 만듬
		System.out.println(result1);
		System.out.println();

		String sql = "insert into member values({0},{1},{2})";
		String result2 = MessageFormat.format(sql, id, name, tel);
		System.out.println(result2);

	}

}
