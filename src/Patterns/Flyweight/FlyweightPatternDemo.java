package Patterns.Flyweight;

/**
 * Flyweight pattern is primarily used to reduce the number of objects created and to decrease 
 * memory footprint and increase performance. Flyweight pattern tries to reuse already existing 
 * similar kind objects by storing them and creates new object when no matching object is found.
 * Flyweights are stored in a Factory's repository. Each Flyweight cannot stand on its own. Any 
 * attributes (for example, color, x, y, and radius in the following code) that would make sharing 
 * impossible must be supplied by the client whenever a request is made of the Flyweight.
 * 
 * Rules of thumb:
 * 1. Whereas Flyweight shows how to make lots of little objects, Facade shows how to make a single 
 *    object represent an entire subsystem.
 * 2. Flyweight is often combined with Composite to implement shared leaf nodes.
 * 3. Flyweight explains when and how State objects can be shared.
 * 
 * @author Xin
 *
 */
public class FlyweightPatternDemo {
	// ShapeFactory has a cache for saving shape with different color (intrinsic state shared in Flyweight 
	// object). If the shape with a specific color to be created already exists in the cache, a flyweight
	// object is created, which has unique data of X, Y, Radius.
	private static final String[] colors = {"Red", "Green", "Blue", "White", "Black"};
	
	public static void main(String[] args) {
		
		for(int i=0; i<20; i++) {
			Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
		}
	}
	
	private static String getRandomColor() {
		return colors[(int)(Math.random()*colors.length)];
	}

	private static int getRandomX() {
		return (int)(Math.random() * 100);
	}
	
	private static int getRandomY() {
		return (int)(Math.random() * 100);
	}
}
