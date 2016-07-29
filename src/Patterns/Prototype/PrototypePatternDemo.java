package Patterns.Prototype;


/**
 * This pattern involves implementing a prototype interface which tells 
 * to create a clone of the current object. This pattern is used when 
 * creation of object directly is costly. For example, an object is to be 
 * created after a costly database operation. We can cache the object, 
 * returns its clone on next request and update the database as and when 
 * needed thus reducing database calls.
 * @author Xin
 *
 */
public class PrototypePatternDemo {

	public static void main(String[] args) {
		
		// mimic the process of reading from database and loading objects
		ShapeCache.loadCache();
		
		Shape clonedShape1 = (Shape) ShapeCache.getShape("1");
		System.out.println("Shape " + clonedShape1.getType());
		
		Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
		System.out.println("Shape " + clonedShape2.getType());
		
		Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
		System.out.println("Shape " + clonedShape3.getType());
	}

}
