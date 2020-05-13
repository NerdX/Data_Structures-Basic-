package Java_CollectionFrameWork.hashmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main_Map {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		Map<String,Integer> Number = new HashMap<String,Integer>();
		
		Number.put("One", 1);
		Number.put("Two", 2);
		Number.put("Five", 5);
		
		//UPDATE THE VALUE OF EXISTING KEY: - 
		Number.put("One", 10);
		
		//PUTIFABSENT(): - 
		Number.putIfAbsent("Two", 25);
		Number.putIfAbsent("Eleven", 11);
		
		System.out.println(Number);
		
		//GET(): - 
		System.out.println(Number.get("Five"));
		System.out.println(Number.get("Three"));
		
		//CONTAINSKEY(): - 
		System.out.println(Number.containsKey("Two"));
		System.out.println(Number.containsKey("Twelve"));
		
		//CONATINSVALUE(): - 
		System.out.println(Number.containsValue(11));
		System.out.println(Number.containsKey(100));
		
		//REPLACE(K,V): - 
		Number.replace("Two", 200);
		System.out.println(Number);
		
		//REPLACE(K,OLD_VALUE,NEW_VALUE): - 
		Number.replace("Five", 5, 500);
		System.out.println(Number);
		
		//REMOVE(K): - 
		Number.remove("Two");
		System.out.println(Number);
		
		//REMOVE(K,V): - 
		Number.remove("Five", 5);
		Number.remove("One", 200);
		System.out.println(Number);
		
		//KEYSET(): - 
		System.out.println(Number.keySet());
		
		//VALUES(): - 
		System.out.println(Number.values());
		
		//ENTRYSET(): - 
		System.out.println(Number.entrySet());
		
		//HOW TO ITERATE THROUGH EACH ENTRIES IN GIVEN MAP(M.I.M.P): - 
		Set<Entry<String,Integer>> entries =  Number.entrySet();
		
		for(Entry<String, Integer> entry : entries) {
			entry.setValue(entry.getValue() * 10);
		}
		System.out.println(Number);
	}

}
