package java_coding_assignment.in;

import java.util.HashMap;

/*Write a Java program to check whether a map contains key-value mappings (empty) or not*/
public class Question_24 {

	public static void main(String[] args) {
		HashMap<Integer, String> hash_map2 = new HashMap<Integer, String>();
		
		hash_map2.put(10, "A");
		hash_map2.put(15, "E");
		hash_map2.put(20, "B");
		hash_map2.put(25, "C");
		hash_map2.put(30, "D");

		System.out.println("Is the key '20' present? " + hash_map2.containsKey(20));
		
		System.out.println("Is the key '20' present? " + hash_map2.containsKey(50));
		
		System.out.println("Is the key '20' present? " + hash_map2.containsKey(15));
	}
}
