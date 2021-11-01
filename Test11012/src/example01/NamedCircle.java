package example01;

public class NamedCircle extends Circle {
	/*
	 *- 실행코드
			public static void main(String[] args) {
				NamedCircle w = new NamedCircle(5, "Waffle");
				w.show();
			}
			
			- 실행결과
			Waffle, 반지름 = 5
	
	 */
	String name;

	public NamedCircle(int radius,String name) {
		super(radius);
		this.name = name;
		
	}
	public void show() {
		System.out.print("실행결과 \n");
		System.out.println(this.name +", 반지름= "+super.getRadius());
	}
	
	public static void main(String[] args) {
		
		NamedCircle w = new NamedCircle(5, "Waffle");
		w.show();
	}

}
