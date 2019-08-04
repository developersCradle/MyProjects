package tutorial_30_polymorphism;

public class App {

	public static void main(String[] args) {
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		
		Plant plant2 = tree;
		
		
		plant2.grow();
		
		tree.shedLeaves();
		
		Plant plant3;
		//Type of variable decides what you can call
		
//		plant2.shedLeaves();
		
		doGrow(tree);
		
		
	}
	
	
	public static void doGrow(Plant plant)
	{
		plant.grow();
	}
	
}
