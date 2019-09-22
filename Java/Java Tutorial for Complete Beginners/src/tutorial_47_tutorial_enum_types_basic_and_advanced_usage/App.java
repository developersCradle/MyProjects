package tutorial_47_tutorial_enum_types_basic_and_advanced_usage;

public class App {
	
	/*
	 * Enums represents certain things, Enums are special objects
	 */
	
//	public static final int DOG = 0;
//	public static final int CAT = 1;
//	public static final int MOUSE = 2;
//	
	
	
	public static void main(String[] args) {
		
	/*
	 * ENUMS were to replace following scenario
	 */
		// 1. Problem, we have only fixed set what it can represent
		// - We could give animal number 100, what does it represents?
//		int animal = CAT;
		// 2. Problem, by looking int animal = CAT; 
		// We don't know what is being set into animal

		
		Animal animal = Animal.CAT;
		
		switch (animal) {
		case DOG:
			System.out.println("Dog");
			break;
		case CAT:
			System.out.println("Cat");
			break;
		case MOUSE:
			System.out.println("Mouse");
			break;

		}
		
		
		System.out.println(Animal.DOG);
		
		System.out.println(Animal.DOG.getClass());
		System.out.println(Animal.DOG instanceof Animal);
		System.out.println(Animal.DOG instanceof Enum);
		
		
		System.out.println(Animal.MOUSE.getName());
		
		
		System.out.println("===================");
		//Special method from Enum 
		System.out.println("Enums name as a string: " + Animal.DOG.name());
		//.name() return Enum with itself string
		
		Animal animal2 = Animal.valueOf("CAT");
		
		System.out.println(animal2);
	}
	
}