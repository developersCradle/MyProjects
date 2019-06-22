package tutorial55;

public class apples {

	public static void main(String[] args) {
		//we can assign objects to reference variable as long its super type
//		Tuna bucky = new Tuna();
//		Food bucky2 = new Tuna();
		Food bucky [] = new Food[2]; //Can hold objects Tuna and Potpie
		bucky[0] = new Potpie();
		bucky[1] = new Tuna();
		
		//1. Reason to use POLYMORPHISIM is to use polymorphic arrays
		// No need to create Tuna tuna = new Tuna() tuna.eat()
		for (int x = 0; x < 2; x++) {
			bucky[x].eat();
		}
		
	}	

}
