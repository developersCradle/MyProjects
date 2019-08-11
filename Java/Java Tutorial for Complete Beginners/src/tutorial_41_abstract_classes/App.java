package tutorial_41_abstract_classes;


/*
 * Abstract class acts as base for other classes
 * - When using Abstract class -> you are making strong argument how and what that class is for
 * - Parent class decides the class identity
 * - Abstract class can have code 

 */
public class App {

	public static void main(String[] args) {

		Camera cam1 = new Camera();
		
		cam1.setId(5);
		
		
		Car car1 = new Car();
		car1.setId(4);
		
		car1.run();
		
//		Machine mahine = new Machine();// WHAT THE HELL
		
	}

}
