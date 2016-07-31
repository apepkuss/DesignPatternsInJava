package Pattern.Bridge;

public class Circle extends Shape {
	private int radius, x, y;
	
	public Circle(int radius, int x, int y, DrawAPI drawAPI) {
		super(drawAPI);
		
		this.radius = radius;
		this.x = x;
		this.y = y;
	}
	
	public void draw() {
		this.drawAPI.drawCircle(this.radius, this.x, this.y);
	}
}
