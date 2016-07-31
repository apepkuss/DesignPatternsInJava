package Pattern.Bridge;

/**
 * The motivation of Bridge pattern:
 * 1. Decouple an abstraction from its implementation so that the two can vary independently.
 * 2. Publish interface in an inheritance hierarchy, and bury implementation in its own inheritance hierarchy.
 * 3. Beyond encapsulation, to insulation.
 * 
 * Rules of thumb:
 * 1. Adapter makes things work after they're designed; Bridge makes them work before they are.
 * 2. Bridge is designed up-front to let the abstraction and the implementation vary independently. 
 *    Adapter is retrofitted to make unrelated classes work together.
 * 3. State, Strategy, Bridge (and to some degree Adapter) have similar solution structures. 
 *    They all share elements of the "handle/body" idiom. They differ in intent - that is, they solve different problems.
 * 4. If interface classes delegate the creation of their implementation classes (instead 
 *    of creating/coupling themselves directly), then the design usually uses the Abstract 
 *    Factory pattern to create the implementation objects.
 * 
 * Following demo code shows decoupling Circle abstraction and RedCircle and GreenCircle implementations, so that
 * they can vary independently.
 * 
 * @author Xin
 *
 */
public class BridgePatternDemo {

	public static void main(String[] args) {
		Circle redCircle = new Circle(100, 100, 10, new RedCircle());
		Circle greenCircle = new Circle(100, 100, 10, new GreenCircle());
		
		redCircle.draw();
		greenCircle.draw();
	}

}
