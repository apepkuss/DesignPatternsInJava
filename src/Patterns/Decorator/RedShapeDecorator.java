package Patterns.Decorator;

public class RedShapeDecorator extends ShapeDecorator {
	
	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}
	
	@Override
	public void draw() {
		this.decoratedShape.draw();
		this.setRedBorder(this.decoratedShape);
	}
	
	private void setRedBorder(Shape decoratedShape) {
		System.out.println("Border Color: Red");
	}
}
