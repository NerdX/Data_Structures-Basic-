/* CUSTOME - DEQUE(DOUBLE - ENDED - QUEUE) IN JAVA */

package Java_CollectionFrameWork.deque;

public class MainDeque {

	public static void main(String[] args) throws Exception {
		
		MyDeque Q1 = new MyDeque();
		
		//ADDING THE ELEMENTS FROM HEAD IN DEQUE:-
		Q1.toAddHead(1024);
		Q1.toAddHead(2048);
		Q1.toAddHead(4096);
		
		//ADDING THE ELEMENTS FROM TAIL IN DEQUE:-
		Q1.toAddTail(8000);
		Q1.toAddTail(1600);
		
		//REMOVE THE ELEMENT FROM HEAD IN DEQUE: - 
		System.out.println(Q1.toRemoveHead());
		
		//PEEKING THE ELEMENT FROM HEAD IN DEQUE: - 
		System.out.println(Q1.peekHead());
		
		//PRINT THE WHOLE DEQUE: - 
		Q1.print();

	}

}
