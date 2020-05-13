package Java_CollectionFrameWork.sets;

import java.util.HashSet;
import java.util.Set;

public class Set_Operations {

	public static void main(String[] args) {
		
		//UNION - OPERATION: - 
		Set<Integer> Set_1 = new HashSet<Integer>();
		
		Set_1.add(1024);
		Set_1.add(2048);
		Set_1.add(4096);
		
		Set<Integer> Set_2 = new HashSet<Integer>();
		
		Set_2.add(1024);
		Set_2.add(2048);
		Set_2.add(8000);
		
		Set_1.addAll(Set_2);
		
		System.out.println(Set_1);
		
		//INTERSECTION - OPERATION: - 
		
		Set_1.retainAll(Set_2);
		
		System.out.println(Set_1);
		
		//SUBSET OF OPERATION: - 
		
		Set<Integer> Set_3 = new HashSet<Integer>();
		
		Set_3.add(8000);
		//Set_3.add(1000);
		
		System.out.println(Set_1.containsAll(Set_3));
	}

}
