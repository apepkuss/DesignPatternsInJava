package Patterns.Singleton;

public class SingleObject {
	
	// keyword static can make instance field be the only one in eager way. 
	private static SingleObject instance = new SingleObject();
	
	// make the default constructor private so that this class cannot be instantiated
	private SingleObject() {}
	
	// This is not a thread-safe way
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hello from Singleton");
	}
}
