/* IMPLEMENTATION OF QUEUE(WITHOUT GENERICS) AS OUR OWN */

package Java_CollectionFrameWork.queue;

public class MyQueue {
	
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
	
		//HEAD(FRONT) AND REAR NODE OF QUEUE: - 
		private Node Head,Rear;
		
		//ENQUEUE() - METHOD: - 
		public void Enqueue(int Data) {
			
			Node toAdd = new Node(Data);
			
			//CHECK WHETHER INITIALLY OUR QUEUE IS EMPTY OR NOT?
			if(Head == null) {
				
				Head = Rear = toAdd;
				
				return;
			}
			//CORE - LOGIC OF ENQUEUE() - METHOD: - 
			Rear.Next = toAdd;
			
			Rear = Rear.Next;
		}
		
		//DEQUEUE() - METHOD: - 
		public int Dequeue() throws Exception {
			
			
			//CHECK WHETHER OUR QUEUE IS ALREADY EMPTY OR NOT?
			if(Head == null) {
				
				Rear = null;
				
				throw new Exception("Sorry! Our Queue is Already Empty:(");
				
			}
			
			//CORE - LOGIC OF DEQUEUE() - METHOD: - 
			Node Temp = Head;
			
			Head = Head.Next;
			
			return(Temp.Data);
			
		}
		
		//PEEK() - METHOD: - 
		public int Peek() throws Exception {
			
			if(Head == null) {
				
				throw new Exception("Sorry! Our Queue is Already Empty:(");
				
			}
			
			//CORE - LOGIC OF PEEK() - METHOD: - 
			Node Temp = Head;
			
			return(Temp.Data);
		}
}
