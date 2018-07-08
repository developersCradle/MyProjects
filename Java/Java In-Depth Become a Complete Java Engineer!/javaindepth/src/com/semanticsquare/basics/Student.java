class Student{
	int id; // Default 0 ,  coz int
	String name; // Default of null, coz name is object referencee
	String gender = "male";
	char[] grades;

	
	Student(int id, String name){
		this(name); // This needs to be first statement
		this.id = id;
	}
	Student(String name){
		this.name = name;
	}
	
	boolean updateProfile(String name)
	{
		this.name = name;
		return true;
	}
	
	/*
	String updateProfile(String name)
	{
		String oldVal = this.name;
		
		this.name = name;
		return oldVal;
	}
	*/
}