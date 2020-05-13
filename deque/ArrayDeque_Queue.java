package Java_CollectionFrameWork.deque;

import java.util.ArrayDeque;

public class ArrayDeque_Queue {

	public static void main(String[] args) {

		//IMPLEMENTING AS A QUEUE: - 
				ArrayDeque<Integer> Q1 = new ArrayDeque<Integer>();
				
				Q1.addFirst(1024);
				Q1.addLast(2048);
				Q1.add(4096);
				Q1.addFirst(8000);
				
				System.out.println(Q1);
			
				System.out.println(Q1.removeLast());
				
				System.out.println(Q1.removeFirst());
				
				System.out.println(Q1.peekFirst());
				
				System.out.println(Q1.peekLast());

	}

}
