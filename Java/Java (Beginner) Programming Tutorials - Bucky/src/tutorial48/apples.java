package tutorial48;


public class apples {

	public static void main(String[] args) {
		Tuna tunaObject = new Tuna(10);
		
		for (int i = 0; i < 5; i++) {
			tunaObject.add();
			System.out.printf("%s",	tunaObject);
		}
	}	

}
