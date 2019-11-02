package tutorial_70_lambda_expression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * lambda expressions are always with associated with Interfaces which have single method
 */

/*
 * Runnable interface
 */
interface Executable { // Functional interface, has single methods
	int execute(int a, int b);
}
interface StringExecutable { // Functional interface, has single methods
	int execute(String a);
}

class Runner {
	public void run(Executable e) { // Block of code in previous versions of java 8
		System.out.println("Executing code block ...");
		int value = e.execute(12, 13);
		System.out.println("Return value is: " + value);

	}
	
	public void run(StringExecutable e) { // Block of code in previous versions of java 8
		System.out.println("Executing code block ...");
		int value = e.execute("Hello");
		System.out.println("Return value is: " + value);

	}
}

/*
 * runner.run(() -> {
 * System.out.println("this is code passed in lambda expression");
 * System.out.println("Hello there");//now this is statement return 8;
 * 
 */
/*
 * () -> { return 8; });
 */

// () -> 8

//(int a) -> 8);


/*
 (int a) -> {
			System.out.println("Hello there.");
			return 7 + a;
		}
 */
class App {
	
	public static void main(String[] args) {

		
		int c = 100; // We can use local variables as long they are final or effectively final
		// Mustn't do this c = 8;
		
		int d = 77;
		
		Runner runner = new Runner();
		// block of code with anonymous classes
		runner.run(new Executable() {

			@Override
			public int execute(int a, int b) {
				
//				int d = 77; can do this in methods of anonymous classes in d = 8
				System.out.println("Hello there.");
				return c + b + a;
			} // OLD WAY TO PASS BLOCK OF CODE
		});

		///////////////////////////////////////// NEW
		///////////////////////////////////////// WAY/////////////////////////////////
		// LAMPDA EXPRESSION COMES FROM MATHEMATICS
		System.out.println("==================================================");

//		runner.run(() -> System.out.println("Hello there")); 
		runner.run((a,b) -> {
			System.out.println("Hello there.");
//			int d = 99; We cannot do this in lambda expression
			return b + a + c;
		});
		
		System.out.println("==================================================");
		
		Executable ex = (a,b) -> {
			System.out.println("Hello there.");
//			int d = 99; We cannot do this in lambda expression
			return b + a + c;
		};
		
		runner.run(ex);

		
		Object codeblock = (Executable)(a,b) -> {
			System.out.println("Hello there.");
//			int d = 99; We cannot do this in lambda expression
			return b + a + c;
		};
	}
	
	
	
	
	
	
}