package Patterns.Command;

/**
 * Problem to solve: Need to issue requests to objects without 
 * knowing anything about the operation being requested or the 
 * receiver of the request.
 * 
 * 1. Command decouples the object that invokes the operation from 
 *    the one that knows how to perform it. To achieve this separation, 
 *    the designer creates an interface that maps a receiver (an object) 
 *    with an action (a pointer to a member function). The interface 
 *    contains an execute() method that simply calls the action on 
 *    the receiver.
 * 2. All clients of Command objects treat each command object as a 
 *    "black box" by simply invoking the command object's virtual execute() 
 *    method whenever the client requires the object's "service".
 * 3. A Command class holds some subset of the following: an object, 
 *    a method to be applied to the object, and the arguments to be 
 *    passed when the method is applied.
 * 4. Sequences of Command objects can be assembled into composite (or macro) commands.
 * 
 * Checklist:
 * 1. Define a Command interface with a method signature like execute().
 * 2. Create one or more derived classes that encapsulate some subset of 
 * 	  the following: a "receiver" object, the method to invoke, the arguments to pass.
 * 3. Instantiate a Command object for each deferred execution request.
 * 4. Pass the Command object from the creator (aka sender) to the invoker (aka receiver).
 * 5. The invoker decides when to execute().
 * 
 * Rules of thumb:
 * 1. Chain of Responsibility, Command, Mediator, and Observer, address how you can 
 *    decouple senders and receivers, but with different trade-offs. Command normally 
 *    specifies a sender-receiver connection with a subclass.
 * 2. Chain of Responsibility can use Command to represent requests as objects.
 * 3. Command and Memento act as magic tokens to be passed around and invoked at a 
 *    later time. In Command, the token represents a request; in Memento, it represents 
 *    the internal state of an object at a particular time. Polymorphism is important to 
 *    Command, but not to Memento because its interface is so narrow that a memento can 
 *    only be passed as a value.
 * 4. Command can use Memento to maintain the state required for an undo operation.
 * 5. MacroCommands can be implemented with Composite.
 * 6. A Command that must be copied before being placed on a history list acts as a Prototype.
 * 7. Two important aspects of the Command pattern: interface separation (the invoker is 
 *    isolated from the receiver), time separation (stores a ready-to-go processing request 
 *    that's to be stated later).
 * 
 * @author Xin
 *
 */
public class CommandPatternDemo {

	public static void main(String[] args) {
		Stock abcStock = new Stock();
		
		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);
		
		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);
		broker.placeOrders();

	}

}
