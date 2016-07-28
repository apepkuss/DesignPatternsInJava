package Patterns.Singleton;

/**
 * The following class demonstrates the singleton pattern implemented in the way of "double checked locking".
 * This way can drastically reduce the overhead of calling the synchronized method every time.
 * @author Xin
 *
 */
public class SingleObjectThreadSafe {
	// volatile ensures that multiple threads offer the instance variable correctly 
	// when it is being initialized to Singleton instance
	private volatile static SingleObjectThreadSafe instance;
	
	private SingleObjectThreadSafe() {}
	
	public static SingleObjectThreadSafe getInstance() {
		// first check
		if (instance == null) {
			// to make the thread safe
			synchronized (SingleObjectThreadSafe.class) {
				// second check
				if (instance == null) {
					instance = new SingleObjectThreadSafe();
				}
			}
		}
		
		return instance;
	}
}
