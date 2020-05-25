package Java_CollectionFrameWork.hashmaps;

public class Custom_HashFunction {

	public static void main(String[] args) {
		
		System.out.println("BALL" + " " +  GetHash("BALL"));
		System.out.println("DOG"  + " " +  GetHash("DOG"));
		System.out.println("goat"  + " "  + GetHash("goat"));
		System.out.println("GOD" + " " + GetHash("GOD"));
		System.out.println("dog" + " "  + GetHash("dog"));
		
	}
	
	//CUSTOM - HASH_FUNCTION: - 
	public static int GetHash(String S) {
		
		int Hash = 0;
		
		for(int i = 0 ; i < S.length() ; i = i + 1) {
			Hash = Hash + S.charAt(i);
		}
		
		return(Hash);
	}

}
