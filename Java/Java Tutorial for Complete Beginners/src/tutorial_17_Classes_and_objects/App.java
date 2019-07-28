package tutorial_17_Classes_and_objects;

class Person {

	//Instance variable (data or "state")
	String name;
	int age;
	//Classes can contains

	//1. Data
	//2. Subroutines (Methods)
}

/*
 * You can have one public class in a file, but can have many private classes in the file 
 */
public class App {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.name = "Joe Bloggs";
		person1.age = 37;

		Person person2 = new Person();
		person1.name = "Joe Bloggs 2";
		person1.age = 40;

		System.out.println(person1.name);

	}

}
