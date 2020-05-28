/* IMPLEMENTATION OF LINKEDLIST(WITHOUT GENERICS) AS OUR OWN */

package Java_CollectionFrameWork.linkedlist;

public class MyLinkedList {
	
	//STATIC - CLASS NODE: - 
	public static class Node{
		
		  int Data;
		  Node Next;
		
		//CONSTRUCTOR: - 
		public Node(int Data){
			this.Data = Data;
			Next = null;
		}
	}
	
	//HEAD NODE OF LINKEDLIST:-
	Node Head;
	
	//ADD() - METHOD OF OUR LINKEDLIST: - 
	void Add(int data) {
		
		Node toAdd = new Node(data);
		
		//CHECK WHETHER INITIALLY OUR LINKEDLIST IS EMPTY OR NOT?
		if(isEmpty()) {
			
			Head = toAdd;
			return;
		}
		
		//CORE - LOGIC OF ADD() - METHOD: - 
		Node Temp = Head;
	
		while(Temp.Next != null) {
			
			Temp = Temp.Next;
		}
		
		Temp.Next = toAdd;
	}
	
	//ISEMPTY() - METHOD OF LINKEDLIST: - 
	boolean isEmpty() {
		
		if(Head == null) return(true);
		
		else return(false);
	}
	
	//PRINT() - METHOD OF LINKEDLIST: - 
	void print() throws Exception {
		
	//CHECK WHETHER OUR LINKEDLIST IS ALREADY EMPTY OR NOT?
			if(Head == null) {
					
				throw new Exception("Sorry! Our LinkedList is Already Empty:(");
					
			}
		
		Node Temp = Head;
		
		while(Temp != null) {
			
			System.out.println(Temp.Data + " ");
			
			Temp = Temp.Next;
		}
	}
	
	int remove() throws Exception {
		
		//CHECK WHETHER OUR LINKEDLIST IS ALREADY EMPTY OR NOT?
		if(Head == null) {
			
			throw new Exception("Sorry! Our LinkedList is Already Empty:(");
			
		}
		
		Node Temp = Head;
		
		//WHAT IF OUR LINKEDLIST HAS ONLY ONE(SINGLE) - ELEMENT?
		if(Temp.Next == null) {
			
			Node toRemove = Temp;
			
			Head = null;
			
			return(toRemove.Data);
			
		}
		
		//CORE - LOGIC OF REMOVE() - METHOD: - 
		while(Temp.Next.Next != null) {
			
			Temp = Temp.Next;
		}
		
		Node toRemove = Temp.Next;
		 
		Temp.Next = null;
	
		return(toRemove.Data);
	}

}
