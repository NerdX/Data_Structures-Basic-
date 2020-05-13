/* VECTORS IN JAVA */

package Java_CollectionFrameWork.stack_and_vector;

import java.util.Vector;

public class Vectors {

	public static void main(String[] args) {
		
		//CREATING A VECTOR: - 
		Vector<Integer> V1 = new Vector<Integer>();
		
		//add(): - 
		V1.add(1024);
		V1.add(2048);
		V1.add(4096);
		V1.add(8000);
		
		System.out.println(V1);
		
		//remove(): - 
		V1.remove(3);
		
		System.out.println(V1);

	}

}
