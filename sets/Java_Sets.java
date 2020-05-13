package Java_CollectionFrameWork.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Java_Sets {

	public static void main(String[] args) {
		
		//HASHSET OF SET - INTERFACE: - 
		Set<String> fruits = new HashSet<String>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Kiwi");	
		
		//RANDOM - RESULTS: - 
		System.out.println(fruits);
		
		//LINKEDHASHSET OF SET - INTERFACE: - 
		Set<String> fruits1 = new LinkedHashSet<String>();
		
		fruits1.add("Guava");
		fruits1.add("Banana");
		fruits1.add("Kiwi");
		
		//ORDERD - RESULTS: - 
		System.out.println(fruits1);
		
		//TREEMAP OF SET - INTERFACE: - 
		Set<String> fruits2 = new TreeSet<String>();
		
		fruits2.add("Apple");
		fruits2.add("Guava");
		fruits2.add("Kiwi");
		fruits2.add("Banana");
		fruits2.add("Watermelon");
		
		//SORTED - RESULTS: - 
		System.out.println(fruits2);
		

	}

}
