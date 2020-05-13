package Java_CollectionFrameWork.queue;

import java.util.PriorityQueue;

public class PriorityQueues {

	public static void main(String[] args) {
		
		//CREATING PRIORITY_QUEUE OF STRING: - 
		PriorityQueue<String> Pq = new PriorityQueue<String>();
		
		//ADD THE ELEMENTS: - 
		Pq.add("Appple");
		Pq.add("Kiwi");
		Pq.add("Mango");
		Pq.add("Banana");
		
		//PRINT THE ELEMENTS: - 
		System.out.println(Pq);
		
		//REMOVE THE ELEMENTS: - 
		System.out.println(Pq.remove());
		System.out.println(Pq.remove());
		System.out.println(Pq.remove());
		System.out.println(Pq.remove());
		
		System.out.println();
		
		//CREATING PRIORITY_QUEUE OF INTEGERS: - 
		PriorityQueue<Integer> Pq1 = new PriorityQueue<Integer>();
		
		//ADD THE ELEMENTS: - 
		Pq1.add(1024);
		Pq1.add(4096);
		Pq1.add(2048);
		Pq1.add(8000);
		
		//PRINT THE ELEMENTS: - 
		System.out.println(Pq1);
		
		//REMOVE THE ELEMENTS: - 
		System.out.println(Pq1.remove());
		System.out.println(Pq1.remove());
		System.out.println(Pq1.remove());
		System.out.println(Pq1.remove());
		
	}

}
