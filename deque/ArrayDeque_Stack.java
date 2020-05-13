package Java_CollectionFrameWork.deque;

import java.util.ArrayDeque;

public class ArrayDeque_Stack {

	public static void main(String[] args) {

		//IMPLEMENTING AS A STACK: - 
				ArrayDeque<String> S1 = new ArrayDeque<String>();
				
				S1.push("Anjaniy");
				S1.push("Jay");
				S1.add("Vraj");
				S1.push("Alex");
				
				System.out.println(S1);
				
				System.out.println(S1.pop());
				
				System.out.println(S1.removeLast());
				
				System.out.println(S1.peek());
				
				System.out.println(S1.peekLast());
				
	}

}
