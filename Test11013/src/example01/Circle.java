package example01;

public class Circle implements Shape {

	int Radius;
	
	Circle(int Radius){
		this.Radius = Radius;
	}
	@Override
	public void draw() {
		System.out.print("반지름"+this.Radius);
		}

	@Override
	public double getArea() {
		
		return Radius* Radius * Math.PI;
	}

	public static void main(String[] args) {
		Shape coin = new Circle(10);
		coin.redraw();
		System.out.println(" 코인의 면적은 " + coin.getArea());
	}
	
	/*- 실행결과
	--- 다시 그립니다 ---
	반지름10 코인의 면적은 314.0*/
}
