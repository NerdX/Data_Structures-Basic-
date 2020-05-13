/* IMPLEMENTATION OF DEQUE(DOUBLE - ENDED - QUEUE)(WITHOUT GENERICS) AS OUR OWN */

package Java_CollectionFrameWork.deque;

public class MyDeque {

	//STATIC - CLASS NODE: - 
	public static class Node{
		
		int Data;
		Node Next;
		Node Back;
		
		//CONSTRUCTOR: - 
		public Node(int Data){
			this.Data = Data;
			Next = null;
			Back = null;
		}
	}
	
	//HEAD NODE + TAIL NODE OF DEQUE:-
	Node Head;
	Node Tail;
	
	/* ADD() - METHODS: - */
	
	public void toAddHead(int data) {
		
		Node toAdd = new Node(data);
		
		//CHECK WHETHER INITIALLY OUR DEQUE IS EMPTY OR NOT?
		if(Head == null) {
			Head = Tail = toAdd;
			return;
		}
		
		//CORE - LOGIC OF TO_ADD_HEAD() - METHOD: - 
		Head.Next = toAdd;
		toAdd.Back = Head;
		Head = toAdd;
	}
	
	public void toAddTail(int data) {
		
		Node toAdd = new Node(data);
		
		//CHECK WHETHER INITIALLY OUR DEQUE IS EMPTY OR NOT?
		if(Head == null) {
			Head = Tail = toAdd;
			return;
		}
		
		//CORE - LOGIC OF TO_ADD_TAIL() - METHOD: - 
		Tail.Back = toAdd;
		toAdd.Next = Tail;
		toAdd.Back = null;
		Tail = toAdd;
		
	}
	
	/* REMOVE() - METHODS: - */
	
	public int toRemoveTail() throws Exception {
		
		//CHECK WHETHER INITIALLY OUR DEQUE IS EMPTY OR NOT?
		if(Head == null) {
			throw new Exception("Sorry! Our Double-Ended-Queue Is Already Empty:(");
		}
		
		//CORE - LOGIC OF TO_REMOVE_TAIL() - METHOD: - 
		Node toRemove = Tail;
		Tail = Tail.Next;
		Tail.Back = null;
		
		if(Tail == null) {
			Head = null;
		}
		
		return(toRemove.Data);
	}
	
	public int toRemoveHead() throws Exception {
		
		//CHECK WHETHER INITIALLY OUR DEQUE IS EMPTY OR NOT?
		if(Head == null) {
			throw new Exception("Sorry! Our Double-Ended-Queue Is Already Empty:(");
		}
		
		//CORE - LOGIC OF TO_REMOVE_HEAD() - METHOD: - 
		Node toRemove = Head;
		Head = Head.Back;
		Head.Next = null;
		
		if(Tail == null) {
			Head = null;
		}
		
		return(toRemove.Data);
	}
	
	/* PEEK() - METHODS: - */
	
	public int peekHead() throws Exception {
		
		//CHECK WHETHER INITIALLY OUR DEQUE IS EMPTY OR NOT?
		if(Head == null) {
			throw new Exception("Sorry! Our Double-Ended-Queue Is Already Empty:(");
		}
		
		//CORE - LOGIC OF TO_PEEK_HEAD() - METHOD: - 
		Node toPeek = Head;
		return(toPeek.Data);
	}
	
	public int peekTail() throws Exception {
		
		//CHECK WHETHER INITIALLY OUR DEQUE IS EMPTY OR NOT?
		if(Head == null) {
			throw new Exception("Sorry! Our Double-Ended-Queue Is Already Empty:(");
		}
		
		//CORE - LOGIC OF TO_PEEK_TAIL() - METHOD: - 
		Node toPeek = Tail;
		return(toPeek.Data);
	}
	
	/* PRINT() - METHOD: - */
	
	public void print() throws Exception {
		
		//CHECK WHETHER INITIALLY OUR DEQUE IS EMPTY OR NOT?
		if(Head == null) {
			throw new Exception("Sorry! Our Double-Ended-Queue Is Already Empty:(");
		}
		
		//CORE - LOGIC OF PRINT() - METHOD: - 
		Node Temp = Head;
		
		while(Temp != null) {
			System.out.print(Temp.Data + ",");
			Temp = Temp.Back;
		}
	}
	
	/* ISEMPTY() - METHOD: - */
	
	boolean isEmpty() {
		
		//CORE - LOGIC OF ISEMPTY() - METHOD: - 
		if(Head == null) {
			return true;
		}
		else {
			return false;
		}
	}

}
