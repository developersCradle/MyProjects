class StudentTest {
	


	public static void main(String[] args)
	{
		int[] studentIds = new int[] {1001,1002,1003};
		
		Student student1 = new Student(studentIds[0], "joan");
		student1.gender = "male";
		
		Student student2 = new Student(studentIds[1], "Heidi");
		student2.gender = "female";

		Student student3 = new Student(studentIds[2], "Seppo");
		student3.gender = "male";
		
		System.out.println("Name of student1: " + student1.name);
		System.out.println("Name of student2: " + student2.name);
		System.out.println("Name of student3: " + student3.name);
		
		student1.updateProfile("John");
		System.out.println("Name of student1: " + student1.name);
	}
		
		 
		
}
