package example01;

import java.util.Scanner;

public class Km2Mile extends Converter {
	
	Km2Mile(double ratio){
		
	}

	@Override
	protected double convert(double src) {
		
		return src / 1.6;
	}

	@Override
	protected String getSrcString() {
		
		return "km";
	}

	@Override
	protected String getDestString() {
		
		return "Mile";
	}
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
		System.out.print(getSrcString()+"을 입력하세요>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: "+res+getDestString()+"입니다");
		scanner.close();
	 }
	 public static void main(String args[]) {
			Km2Mile toMile = new Km2Mile(1.6); // 1마일은 1.6km
			toMile.run();
			}
			
		  /*- 실행결과
		  Km을 mile로 바꿉니다.
		  Km을 입력하세요>> 30
		  변환 결과: 18.75mile입니다*/

}
