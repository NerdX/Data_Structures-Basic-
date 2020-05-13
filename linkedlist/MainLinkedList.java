package Java_CollectionFrameWork.linkedlist;

public class MainLinkedList {

	public static void main(String[] args) throws Exception {
		
		MyLinkedList L1 = new MyLinkedList();
		 
		 //ADDING THE ELEMENTS IN LINKEDLIST:-
		 L1.Add(1024);
		 L1.Add(2048);
		 L1.Add(4096);
		 System.out.println("AFTER INSERTING THE ELEMENTS IN LINKEDLIST:");
		 L1.print();
		 
		 //REMOVE THE LAST ELEMENT FROM LINKEDLIST:-
		 System.out.println("AFTER REMOVING THE LAST ELEMENT FROM LINKEDLIST:");
		 L1.remove();
		 L1.print();

	}

}
