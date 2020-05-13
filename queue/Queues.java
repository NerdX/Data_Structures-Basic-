package Java_CollectionFrameWork.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

	public static void main(String[] args) {
		
		Queue<Integer> Q1 = new LinkedList<Integer>();
		
		//ADDING THE ELEMENTS IN QUEUE:
		Q1.add(21);
		Q1.add(22);
		Q1.add(94);
		Q1.add(1024);
		System.out.println(Q1);
		
		//REMOVE THE ELEMENTS FROM QUEUE:
		System.out.println(Q1.remove());
		System.out.println(Q1.remove());
		
		//GET THE ELEMENT WHICH WILL BE REMOVED NEXT:
		System.out.println(Q1.element());
		
		Queue<Integer> Q2 = new LinkedList<Integer>();
		
		//OFFER() - METHOD: - 
		Q2.offer(1024);
		Q2.offer(2048);
		Q2.offer(4096);
		System.out.println(Q2);
		
		//POLL() - METHOD: - 
		System.out.println(Q2.poll());
		System.out.println(Q2.poll());
		System.out.println(Q2.poll());
		
		//PEEK() - METHOD: - 
		System.out.println(Q2.peek());

	}

}
