package example01;

public class ColorPoint extends Point {

	String color;
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
		
	}
	public void setPoint(int x, int y) {
		this.move(x, y);
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public void show() {
		System.out.println(this.getColor()+"색으로("+this.getX()+","+this.getY()+")");
	}



	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setPoint(10, 20);
		cp.setColor("GREEN");
		cp.show();
	}
	
	/*- 실행결과
	GREEN색으로 (10,20)
	
*/
}
