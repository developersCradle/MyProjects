package chapter5;


public class ClothItem {
	
	public String type; // No static, then it is instance variable
	
	public static void main(String[] args)
	{
		ClothItem item = new ClothItem(); //instantiation
		item.type = "Hat";
		item.displayItem();
	

		String s1 = "This is a String!";// These two mean same thing
		System.out.println(s1);
		
		String s2 = new String("This is also a String!");// These two mean same thing
		System.out.println(s2);
	}

	private void displayItem()
	{
		System.out.println("This is a " + this.type);
	}
	
	
}
