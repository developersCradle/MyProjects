package tutorial_54_linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		/*
		 * ArrayLists manage arrays internally.
		 * [0][1][2][3][4][5][6][7]......
		 */
		
		/*
		 * 	LinkedLists consist of elements where each element
		 * 	has a reference to the previous and next element
		 * 	[0]->[1]->[2]->......
		 * 
		 * - Getting particular element from LinkedList than Arrays list is bit slower
		 * 		- Need to start from first element and then go next trough the link		 
		 * - LinkedList is good when adding in middle of list, we just link behind one and front one to reference next elements	
		 */
		
		
		List<Integer> arrayList = new ArrayList<Integer>();
		/*
		 * If you want add or remove items in end your list use ARRAYLIST
		 */
		List<Integer> linkedList = new LinkedList<Integer>();
		/*
		 * If you want add or remove items in ANYWHERE in your list use LINKEDLIST
		 */
		
		
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
	}
	
	/*
	 * We can point List<> in parameter with ArrayList or LinkedList. This is what interfaces is used for
	 */
	private static void doTimings(String type, List<Integer> list) //I can pass anything what implements List interface
	{
		// Add items at end of List
		/*
		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}
		*/
		
		long start = System.currentTimeMillis();
		
		/*
		 * Its bit slower to add to end of linked list
		 */
		//Add items elsewhere to list
		for (int i = 0; i <1E5; i++) {
			list.add(0, i); //add items to beginning of list
			/*
				Time taken: 912 ms for ArrayList
				Time taken: 4 ms for LinkedList
			
			Adding items to beginning of array list, takes time

			 */
		}
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken: " + (end - start) + " ms for " + type);
	}
	 

}
