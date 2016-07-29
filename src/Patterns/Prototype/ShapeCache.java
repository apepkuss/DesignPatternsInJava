package Patterns.Prototype;

import java.util.HashMap;

public class ShapeCache {
	private static HashMap<String, Shape> shapeMap = new HashMap<>();
	
	public static Shape getShape(String shapeId) {
		Shape cachedShape = shapeMap.get(shapeId);
		return (Shape) cachedShape.clone();
	}
	
	// loadCache method mimics the load of objects from database
	public static void loadCache() {
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);
		
		Square square = new Square();
		square.setId("2");
		shapeMap.put(square.getId(), square);
		
		Rectangle rect = new Rectangle();
		rect.setId("3");
		shapeMap.put(rect.getId(), rect);
	}
}
