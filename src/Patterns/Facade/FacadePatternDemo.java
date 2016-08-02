package Patterns.Facade;

/**
 * Facade pattern hides the complexities of the system and provides an simpler interface 
 * to the client using which the client can access the system. This pattern involves a single 
 * class which provides simplified methods required by client and delegates calls to 
 * methods of existing system classes. It also promotes decoupling the subsystem from its 
 * potentially many clients. On the other hand, if the Facade is the only access point for 
 * the subsystem, it will limit the features and flexibility that "power users" may need.
 * 
 * Rules of thumb:
 * 1. Facade defines a new interface, whereas Adapter uses an old interface. The difference 
 *    between the two is not in terms of how many classes they "wrap", it is in their intent.
 * 2. Abstract Factory can be used as an alternative to Facade to hide platform-specific classes.
 * 3. Facade objects are often Singletons because only one Facade object is required.
 * 
 * @author Xin
 *
 */
public class FacadePatternDemo {
	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();
		
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}
