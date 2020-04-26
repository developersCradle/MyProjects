package tutorial_61_queues;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

class App{
	public static void main(String[] args) {
	
		// (head) <- 000000000000000000000 <- (tail) FIFO
	
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);//Max 3 items
		
		q1.add(10);
		q1.add(20);
		q1.add(30);
		
		
		System.out.println("Head of the queue is " + q1.element());
		try {
			q1.add(40);
			
		} catch (IllegalStateException e) {
			System.out.println("Tried to add too many items to the queque");
		}
	
		
		
		for(Integer value :q1)
		{
			System.out.println("Queque value: " + value);
		}
		
//		Integer value = q1.remove(); //removes from head and returns it

		System.out.println("Removed from queue: " + q1.remove()); //removes from head and returns it
		System.out.println("Removed from queue: " + q1.remove());
		System.out.println("Removed from queue: " + q1.remove());
		

		try {
			System.out.println("Removed from queue: " + q1.remove());
			
		} catch (Exception e) {
			System.out.println("Tried to remove too many items from queue");
		}
		
		
		////////////////////////////////////////////////
		
		
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);//Max 2 items
		

		q2.offer(10);
		q2.offer(20);
		//13:00
		for (Integer value : q2) {
			System.out.println("Queque 2 pull");
		}
		
	}

}