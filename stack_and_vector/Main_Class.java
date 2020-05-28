package Java_CollectionFrameWork.stack_and_vector;

public class Main_Class {

	public static void main(String[] args) throws Exception {
		
		MyStack S1 = new MyStack();
		
		//PUSH THE ELEMENTS : - 
		S1.Push(1024);
		S1.Push(2048);
		S1.Push(4096);
		S1.Push(8000);
		
		//PRINT THE ELEMENTS: - 
		S1.Print();
		
		//POP THE ELEMENTS: - 
		System.out.println(S1.Pop() + "is Popped");
		
		//PEEK THE ELEMENTS: - 
		System.out.println(S1.Peek() + "is Peeked");
		

	}

}
