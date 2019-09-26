package tutorial_52_passing_by_value;

public class App {

	public static void main(String[] args) {

		//Great way to start app
		App app = new App();
		
		//==========================================
		int value = 7;
		System.out.println("1. Value is: " + value);

		app.show(value);//we are copying 7 to method
		//this is called passing by value
		System.out.println("4. Value is: " + value);
		//==========================================
		System.out.println();
		
		
		//person reference
		Person person = new Person("Bob");
		System.out.println("1. Person is: " + person);
		
		/*
		 * Here we are copying the address to new variable
		 */
	
		app.show(person);
		
		System.out.println("4. Person is: " + person);
	}
	
	//value is copy of what is given
	public void show(int value)
	{
		System.out.println("2. Value is: " + value);
		
		value = 8;
		
		System.out.println("3. Value is: " + value);
	}
	
	/*
	 * Non-primitive class
	 * Big first letter
	 */
	
	public void show(Person person) //This person is not the same as in main()
	{
		System.out.println("2. Person is: " + person);
		
		person.setName("Sue");
		
		//We are overriding old address with address of Mike
		person = new Person("Mike");
		
		System.out.println("3. Person is: " + person);
	}

}
