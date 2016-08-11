package Patterns.Interpreter;

/**
 * Interpreter pattern provides a way to evaluate language grammar or expression.
 * This pattern involves implementing an expression interface which tells to interpret 
 * a particular context. This pattern is used in SQL parsing, symbol processing engine etc.
 * 
 * Intent:
 * 1. Given a language, define a representation for its grammar along with an interpreter 
 *    that uses the representation to interpret sentences in the language.
 * 2. Map a domain to a language, the language to a grammar, and the grammar to a hierarchical 
 *    object-oriented design.
 * 
 * The Interpreter pattern discusses: defining a domain language (i.e. problem characterization) 
 * as a simple language grammar, representing domain rules as language sentences, and interpreting 
 * these sentences to solve the problem. The pattern uses a class to represent each grammar rule. 
 * And since grammars are usually hierarchical in structure, an inheritance hierarchy of rule 
 * classes maps nicely.
 * 
 * Rules of thumb:
 * 1. Interpreter can use State to define parsing contexts.
 * 2. The abstract syntax tree of Interpreter is a Composite (therefore Iterator and Visitor are also applicable).
 * 3. Terminal symbols within Interpreter's abstract syntax tree can be shared with Flyweight.
 * 4. The pattern doesn't address parsing. When the grammar is very complex, other techniques (such as a parser) are more appropriate.
 * 
 * @author Xin
 *
 */
public class InterpreterPatternDemo {
	
	// Rule: Robert and John are male
	public static Expression getMaleExpression() {
		Expression robert = new TerminalExpression("Robert");
		Expression john = new TerminalExpression("John");
		return new OrExpression(robert, john);
	}
	
	// Rule: Julie is an married woman
	public static Expression getMarriedWomanExpression() {
		Expression julie = new TerminalExpression("Julie");
		Expression married = new TerminalExpression("Married");
		return new AndExpression(julie, married);
	}
	
	public static void main(String[] args) {
		Expression isMale = getMaleExpression();
		Expression isMarriedWoman = getMarriedWomanExpression();
		
		System.out.println("John is male? " + isMale.interpret("John"));
		System.out.println("Julie is a married woman? " + isMarriedWoman.interpret("Married Julie"));
	}

}
