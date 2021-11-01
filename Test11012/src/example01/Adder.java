package example01;

public class Adder extends Calculator {

	@Override
	protected int calc() {
	
		return super.a+super.b;
	}
	public void run() {
		input();
		int res = calc();
		System.out.println("계산된 값은 " + res);
	}
	
	public static void main(String args[]) {
		
		Adder ad = new Adder();
		ad.run();
	}

}
