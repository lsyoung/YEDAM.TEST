package example01;

import java.util.Scanner;

public class StackApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("총 스택 저장공간의 크기 입력 >> ");
		
		int size = sc.nextInt();
		StringStack stack = new StringStack(size);
		while(true) {
			System.out.println("문자열입력>>");
			String val = sc.next();
			if(val.equals("그만"))
				break;
			if(!stack.push(val))
				System.out.println("스택이 가득 찼습니다.");
		}
		System.out.println("스택에 저장된 모든 문자열 꺼내옴 : ");
		int len = stack.length();
		for(int i = 0; i<len; i++) {
			String val= stack.pop();
			System.out.println(val);
		}
	}
	/*- 실행결과
	총 스택 저장 공간의 크기 입력 >> 3
	문자열 입력 >> hello
	문자열 입력 >> sunny
	문자열 입력 >> smile
	문자열 입력 >> happy
	스택이 꽉 차서 푸시 불가!
	문자열 입력 >> 그만
	스택에 저장된 모든 문자열 팝 : smile sunny hello */

	}
