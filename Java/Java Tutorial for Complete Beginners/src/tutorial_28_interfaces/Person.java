package tutorial_28_interfaces;


/*
 * Class can implement any number of interfaces
 */

/*
 * Class can only extend one parent class
 */

public class Person implements Info{
	
	private String name;
	
	public void greet()
	{
		System.out.println("Hello There.");
	}

	public Person(String name) {
		super(); //this would call Objects constructor, all classes inherits Object
		this.name = name;
	}

	@Override
	public void showInfo() {
		System.out.println("Person name is: " + name);		
	}
	

}
