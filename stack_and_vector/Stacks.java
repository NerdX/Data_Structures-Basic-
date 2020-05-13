/* STACK IN JAVA */

package Java_CollectionFrameWork.stack_and_vector;

import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		   
		//CREATING A STACK: - 
		Stack<Integer> S1 = new Stack<Integer>();
		
		//push(): - OPERATION
		S1.push(1024);
		S1.push(2048);
		S1.push(4096);
		S1.push(8000);
		
		System.out.println(S1);
		
		//pop(): - OPERATION
		int Popped = S1.pop();
		Popped = S1.pop();
		System.out.println(Popped);
		
		System.out.println(S1);
		
		//peek(): - OPERATION
		int peek = S1.peek();
		System.out.println(peek);
		

	}

}
