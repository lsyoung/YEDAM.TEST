package example01;

import java.util.Scanner;

public class Won2Dollar extends Converter {
    Won2Dollar(double ratio){
    	
    }

	@Override
	protected double convert(double src) {
		return src / 1200;
		
	}

	@Override
	protected String getSrcString() {
		return "원";
	}

	@Override
	protected String getDestString() {
		return "달러";
	}

	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
		System.out.print(getSrcString() + "을 입력하세요>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: " + res + getDestString() + "입니다");
		scanner.close();
	}

	public static void main(String args[]) {
		Won2Dollar toDollar = new Won2Dollar(1200); // 1달러는 1200원
		toDollar.run();
	}
	/*- 실행결과
	원을 달러로 바꿉니다.
	원을 입력하세요>> 24000
	변환 결과: 20.0달러입니다*/
}
