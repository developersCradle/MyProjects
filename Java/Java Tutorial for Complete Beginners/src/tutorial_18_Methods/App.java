package tutorial_18_Methods;

class Person {

	//Instance variable (data or "state")
	String name;
	int age;
	//Classes can contains

	//1. Data
	//2. Subroutines (Methods)


	void speak()
	{
		for (int i = 0; i < 3; i++) {
			System.out.println("My name is:" + name + " and I am " + age + " years old");
			
		}
	}
	
	void sayHello()
	{
		System.out.println("Hello there!");
	}
}

/*
 * You can have one public class in a file, but can have many private classes in the file 
 */
public class App {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.name = "Joe Bloggs";
		person1.age = 37;
		person1.speak();
		person1.sayHello();

		Person person2 = new Person();
		person2.name = "Joe Bloggs 2";
		person2.age = 40;
		person2.speak();
		
		System.out.println(person1.name);

	}

}
