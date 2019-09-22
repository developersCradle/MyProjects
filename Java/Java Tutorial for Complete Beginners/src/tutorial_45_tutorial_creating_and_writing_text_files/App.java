package tutorial_45_tutorial_creating_and_writing_text_files;

class Person {
	
	@Override
	public int hashCode() { //Mainly used if object is added to hash
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	private int id;
	private String name;
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	

}

public class App {

	public static void main(String[] args) {
		
		
		System.out.println(new Object());
		//returns java.lang.Object@15db9742
		/* toString() returns HASH code with package name
		 * Hash code tries to be unique ID
		 * 
		 */
		Person person1 = new Person(5, "Bob");
		Person person2 = new Person(5, "Bob");
		
		
		System.out.println(person1 == person2);
		/* NON primitive types
		 * == tells are two references to objects pointing to same object,
		 * hence person1 and person2
		 */
		/* PRIMITIVE types
		 *  == tells if have same value
		 */
		
		//.equals comes from Object
		// since we override our equals method
		// now person1 is equals person2 when they share same information
		System.out.println(person1.equals(person2));
				
		
		person1 = person2;
		//Now they are pointing to same object
		System.out.println(person1 == person2);
		
		
		
		
		System.out.println("==============================");
		
		Double value1 = 7.2;
		Double value2 = 7.2;
		
		System.out.println(value1 == value2);
		

		Integer value3 = 6;
		Integer value4 = 6;
		
		System.out.println(value3 == value4);
		
		
		
		String text1 = "Hello";//Java optimizes these two string to point one Object
		String text2 = "Hello";
		
		System.out.println(text1 == text2); //USE .equals when comparing non-primitives
		
		
	}
}

