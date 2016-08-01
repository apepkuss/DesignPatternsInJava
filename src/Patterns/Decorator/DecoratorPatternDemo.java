package Patterns.Decorator;

/**
 * Decorators provide a flexible alternative to subclassing for extending functionality. It Attaches 
 * additional responsibilities to an object dynamically. Client-specified embellishment of a core object 
 * by recursively wrapping it.
 * 
 * You want to add behavior or state to individual objects at run-time. Inheritance is not feasible 
 * because it is static and applies to an entire class.
 * 
 * Rules of thumb
 * 1. Adapter provides a different interface to its subject. Proxy provides the same interface. 
 *    Decorator provides an enhanced interface.
 * 2. Adapter changes an object's interface, Decorator enhances an object's responsibilities. 
 *    Decorator is thus more transparent to the client. As a consequence, Decorator supports 
 *    recursive composition, which isn't possible with pure Adapters.
 * 3. Decorator is designed to let you add responsibilities to objects without subclassing. 
 *    Composite's focus is not on embellishment but on representation. These intents are distinct 
 *    but complementary. Consequently, Composite and Decorator are often used in concert.
 * 4. Decorator lets you change the skin of an object. Strategy lets you change the guts.
 * 
 * @author Xin
 *
 */
public class DecoratorPatternDemo {

	public static void main(String[] args) {
		Shape circle = new Circle();
		System.out.println("Circle with normal border");
		circle.draw();
		
		Shape redCircle = new RedShapeDecorator(new Circle());
		System.out.println("\nCircle of red border");
		redCircle.draw();
		
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		System.out.println("\nRectangle of red border");
		redRectangle.draw();
	}

}
