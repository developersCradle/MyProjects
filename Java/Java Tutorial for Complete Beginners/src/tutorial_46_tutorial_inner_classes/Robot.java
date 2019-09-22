package tutorial_46_tutorial_inner_classes;

public class Robot {
	
	private int id;
	
	
	//non-static inner class
	// most often used for logical grouping
	private class Brain{ //this class has access to instance data
		
		//Usage of inner class is in Iterable chapter
		public void think()
		{
			System.out.println("Robot " + id + " is thinking." );
		}
		
		//Accessing non-static data in outer class
	}
	
	
	//Static inner class
	//can be used to group with robot
	public static class Battery{
		public void charge()
		{
			System.out.println("Battery charging...");
		}
	}
	
	public Robot(int id) {
		super();
		this.id = id;
	}
	
	public void start()
	{
		System.out.println("Starting robot " + id);
		
		Brain brain = new Brain();
		brain.think();
		
		
		//We can define classes in methods
		String name = "Robert";
		class Temp { //this class cannot be referred outside of this class
			public void doSomething() {
				System.out.println("ID is: " + id );
				System.out.println("My name is " + name);
			}
		}
		
		Temp temp = new Temp();
		temp.doSomething();
	}

}
