package Patterns.Proxy;

/**
 * Four common situations in which the Proxy pattern is applicable:
 * 1. A virtual proxy is a placeholder for "expensive to create" objects. 
 *    The real object is only created when a client first requests/accesses the object.
 * 2. A remote proxy provides a local representative for an object that resides in a 
 *    different address space. This is what the "stub" code in RPC and CORBA provides.
 * 3. A protective proxy controls access to a sensitive master object. The "surrogate" 
 * 	  object checks that the caller has the access permissions required prior to forwarding 
 *    the request.
 * 4. A smart proxy interposes additional actions when an object is accessed. Typical uses include:
 *		1) Counting the number of references to the real object so that it can be freed automatically 
 *		   when there are no more references (aka smart pointer)
 *      2) Loading a persistent object into memory when it's first referenced
 *      3) Checking that the real object is locked before it is accessed to ensure that no other 
 *         object can change it
 * 
 * Rules of thumb:
 * 1. Adapter provides a different interface to its subject. Proxy provides the same interface. 
 *    Decorator provides an enhanced interface.
 * 2. Decorator and Proxy have different purposes but similar structures. Both describe how to 
 *    provide a level of indirection to another object, and the implementations keep a reference 
 *    to the object to which they forward requests.
 * 
 * @author Xin
 *
 */
public class ProxyPatternDemo {

	public static void main(String[] args) {
		
		Image image = new ProxyImage("test_10mb.jpg");
		
		// image will be loaded from disk
		image.display();
		System.out.println("");
		
		// image will not be loaded from disk
		image.display();
	}

}
