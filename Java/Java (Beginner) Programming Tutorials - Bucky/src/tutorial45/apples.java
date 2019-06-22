package tutorial45;

import java.util.EnumSet;

public class apples {

	public static void main(String[] args) {

		for(Tuna people: Tuna.values()) // values() Java made built in array from enum
			System.out.printf("%s\t%s\t%s\n", people, people.getDescription(), people.getYear());
		
		System.out.println("\nAnd now for the range of constants!!\n");
		
		for(Tuna people: EnumSet.range(Tuna.kelsey, Tuna.candy))
			System.out.printf("%s\t%s\t%s\n", people, people.getDescription(), people.getYear());
	}	

}
