package tutorial_28_interfaces;

public class App {

	public static void main(String[] args) {

		Machine mach1 = new Machine();
		mach1.start(); 
		
		Person person1 = new Person("Bob");
		person1.greet();
		
		System.out.println();
		/*
		 * Since Machine implements Interface Info we can do this
		 */
		Info info1 = new Machine();
		//info1.start(); We cannot invoke Machine's other methods since variable is Info interface
		info1.showInfo(); //Methods specified by interface can be called from this Machine

		Info info2 = person1;
		info2.showInfo();
		
		
		System.out.println();
		/*
		 * We can input classes which implements Info
		 */
		outputInfo(mach1);
		outputInfo(person1);
	}
	
	private static void outputInfo(Info info)
	{
		info.showInfo();
	}

	/*
	 * Example of interface usages Collection packages in Java
	 */
	
	
}
