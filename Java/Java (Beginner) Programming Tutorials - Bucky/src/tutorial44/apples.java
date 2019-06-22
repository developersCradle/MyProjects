package tutorial44;


public class apples {

	public static void main(String[] args) {

		for(Tuna people: Tuna.values()) // values() Java made built in array from enum
			System.out.printf("%s\t%s\t%s\n", people, people.getDescription(), people.getYear());
	}

}
