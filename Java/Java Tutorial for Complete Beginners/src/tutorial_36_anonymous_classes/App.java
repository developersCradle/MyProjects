package tutorial_36_anonymous_classes;

/*
 * Extending old class or implementing interface in one short thing
 */


interface Plant{
	public void grow();
}

class Machine{
	public void start()
	{
		System.out.println("Starting machine ...");
	}
}
public class App {

	
	public static void main(String[] args) {
		
		Machine machine1 = new Machine() {
			@Override
			public void start() {
				System.out.println("Camera snapping...");
			}
		};// This thing is child class of machine, which extends Machine -> Anonymous class
		
		machine1.start();
		
		
		Plant plant1 = new Plant() { //One way to use anonymous class. This anonymous class implements Plant interface

			public void grow() {
				System.out.println("Plant growing");				
			}
		};
		
		plant1.grow();
	}
}
