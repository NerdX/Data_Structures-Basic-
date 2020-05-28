/* IMPLEMENTATION OF STACK(WITHOUT GENERICS) AS OUR OWN */

package Java_CollectionFrameWork.stack_and_vector;

public class MyStack {
	
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
		
		//HEAD NODE OF STACK:-
		Node Head;
		
		//PUSH() - METHOD OF OUR STACK: - 
		void Push(int data) {
			
			Node ToPush = new Node(data);
			
			//CHECK WHETHER INITIALLY OUR STACK IS EMPTY OR NOT?
			if(isEmpty()) {
				
				Head = ToPush;
				return;
			}
			
			//CORE - LOGIC OF PUSH() - METHOD: - 
			Node Temp = Head;
		
			while(Temp.Next != null) {
				
				Temp = Temp.Next;
			}
			
			Temp.Next = ToPush;
		}
		
		//ISEMPTY() - METHOD OF STACK: - 
		boolean isEmpty() {
			
			if(Head == null) return(true);
			
			else return(false);
		}
		
		//PRINT() - METHOD OF STACK: - 
		void Print() throws Exception {
			
			//CHECK WHETHER OUR LINKEDLIST IS ALREADY EMPTY OR NOT?
			if(Head == null) {
				
				throw new Exception("Sorry! Our Stack is Already Empty:(");
				
			}
			
			Node Temp = Head;
			
			while(Temp != null) {
				
				System.out.println(Temp.Data + " ");
				
				Temp = Temp.Next;
			}
		}
		
		int Pop() throws Exception {
			
			//CHECK WHETHER OUR STACK IS ALREADY EMPTY OR NOT?
			if(Head == null) {
				
				throw new Exception("Sorry! Our Stack is Already Empty:(");
				
			}
			
			Node Temp = Head;
			
			//WHAT IF OUR STACK HAS ONLY ONE(SINGLE) - ELEMENT?
			if(Temp.Next == null) {
				
				Node ToPop = Temp;
				
				Head = null;
				
				return(ToPop.Data);
				
			}
			
			//CORE - LOGIC OF POP() - METHOD: - 
			while(Temp.Next.Next != null) {
				
				Temp = Temp.Next;
			}
			
			Node ToPop = Temp.Next;
			 
			Temp.Next = null;
		
			return(ToPop.Data);
		}
		
		int Peek() throws Exception {
			
			//CHECK WHETHER OUR STACK IS ALREADY EMPTY OR NOT?
			if(isEmpty()) {
				throw new Exception("Sorry! Our Stack is Already Empty:(");
			}
			
			//CORE - LOGIC OF PEEK() - METHOD: - 
			Node Temp = Head;
			
			while(Temp.Next != null) {
				Temp = Temp.Next;
			}
			
			Node ToPeek = Temp;
			return(ToPeek.Data);
		}
}
