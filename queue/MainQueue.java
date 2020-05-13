/* CUSTOME - QUEUE IN JAVA */

package Java_CollectionFrameWork.queue;

public class MainQueue {

	public static void main(String[] args) throws Exception {
		
		MyQueue Q1 = new MyQueue();
		
		//ADDING THE ELEMENTS IN QUEUE: - 
		Q1.Enqueue(1024);
		Q1.Enqueue(2048);
		Q1.Enqueue(4096);
		
		//REMOVE THE ELEMENTS FROM QUEUE: - 
		System.out.println(Q1.Dequeue());
		Q1.Dequeue();
		
		//PEEK() - METHOD: - 
		System.out.println(Q1.Peek());

	}

}
