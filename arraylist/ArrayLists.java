/* ARRAYLIST IN JAVA */ 

package Java_CollectionFrameWork.arraylist;

import java.util.ArrayList;
public class ArrayLists {

	public static void main(String[] args) {
		
		//CREATION OF ARRAYLIST: - 
		ArrayList<String> fruits = new ArrayList<String>();
		//OR:
	    //List<String> fruits = new ArrayList<String>();
		
		//METHODS OF ARRAYLIST - CLASS : - 

		//add(): - 
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Pineapple");
		fruits.add("Watermalon");
		fruits.add("Banana");
		//System.out.println(fruits);
		
		//get(): - 
		System.out.println(fruits.get(2));
		
		//set(): - 
		fruits.set(1, "Orange");
		System.out.println(fruits);
		
		//remove(): - 
		fruits.remove(2);
		System.out.println(fruits);
		
		//removeAll(): - 
		ArrayList<String> takeremoval = new ArrayList<String>();
		takeremoval.add("Pineapple");
		takeremoval.add("Mango");
		fruits.removeAll(takeremoval);
		
		System.out.println(fruits);
		System.out.println(takeremoval);
		
		//size(): - 
		System.out.println(takeremoval.size());
		
		//contains(): - 
		System.out.println(takeremoval.contains("Mango"));
		System.out.println(takeremoval.contains("Guava"));
		
		//isEmpty(): - 
		System.out.println(takeremoval.isEmpty());
		
		//toArray(): - 
		String Temp[] = new String[takeremoval.size()];
		
		takeremoval.toArray(Temp);
		
		for(int i = 0 ; i < Temp.length ; i++) {
			System.out.println(Temp[i]);
		}
		
		//clear(): - 
				fruits.clear();
				System.out.println(fruits);
	}

}
