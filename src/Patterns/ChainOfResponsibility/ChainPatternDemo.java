package Patterns.ChainOfResponsibility;

/**
 * 1. This pattern decouples sender and receiver of a request based on type of request.
 * 2. The pattern chains the receiving objects together, and then passes any request 
 *    messages from object to object until it reaches an object capable of handling the message. 
 * 3. The number and type of handler objects isn't known a priori, they can be configured dynamically. 
 * 4. The chaining mechanism uses recursive composition to allow an unlimited number of handlers 
 *    to be linked. 
 * 5. Do not use Chain of Responsibility when each request is only handled by one handler, 
 *    or, when the client object knows which service object should handle the request.
 * 
 * Rules of thumb:
 * 1. Chain of Responsibility, Command, Mediator, and Observer, address how 
 *    you can decouple senders and receivers, but with different trade-offs.
 * 2. Chain of Responsibility can use Command to represent requests as objects.
 * 3. Chain of Responsibility is often applied in conjunction with Composite. 
 *    There, a component's parent can act as its successor.
 * 
 * @author Xin
 *
 */
public class ChainPatternDemo {
	
	private static AbstractLogger getChainOfLoggers() {
		
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		
		return errorLogger;
	}
	
	public static void main(String[] args) {
		AbstractLogger loggerChain = getChainOfLoggers();
		
		loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
		loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information");
		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information");
	}

}
