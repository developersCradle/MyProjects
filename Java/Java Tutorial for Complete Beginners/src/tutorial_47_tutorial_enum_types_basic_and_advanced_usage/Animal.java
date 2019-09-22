package tutorial_47_tutorial_enum_types_basic_and_advanced_usage;


//CAT, DOG and MOUSE are infact Objects of Animal
public enum Animal {
	CAT("Mirri"), DOG("Doggo"), MOUSE("Hiiruli");

	
	
	
	//We can give Enums instance data
	private String name;
	
	//We can give Enums constructor
	
	private Animal(String name)
	{
		this.name = name;
		
		
	}

	public String getName() {
		return name;
	}
	
	
	public String toString() {
		return "This animal is called: " + name;
	}
	
}
