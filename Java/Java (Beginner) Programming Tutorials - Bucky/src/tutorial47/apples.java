package tutorial47;


public class apples {

	public static void main(String[] args) {

		Tuna member1 = new Tuna("Megan", "Fox");
		Tuna member2 = new Tuna("Natalie", "Portman");
		Tuna member3 = new Tuna("Taylor", "Swift");
		
		System.out.println();
//		System.out.println(member1.getFirst());
//		System.out.println(member1.getLast());
//		System.out.println(member1.getMembers());
		
		System.out.println(Tuna.getMembers());
	}	

}
