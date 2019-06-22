package tutorial49;


public class apples {

	public static void main(String[] args) {
		Tuna tunaObject = new Tuna();
		Potpie potObject = new Potpie();
		
		tunaObject.eat();
		//potObject.eat();//Private methods cannot be inherited
	}	

}
