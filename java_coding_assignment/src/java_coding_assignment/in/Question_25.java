package java_coding_assignment.in;

import java.util.HashMap;

/*Write a Java program to get the value of a specified key in a map
*/
public class Question_25 {

	public static void main(String[] args) {
		HashMap<Integer, String> hash_map2 = new HashMap<Integer, String>();

		hash_map2.put(10, "A");
		hash_map2.put(15, "E");
		hash_map2.put(20, "B");
		hash_map2.put(25, "C");
		hash_map2.put(30, "D");

		System.out.println("The Value is: " + hash_map2.get(10));
		System.out.println("The Value is: " + hash_map2.get(15));
		System.out.println("The Value is: " + hash_map2.get(20));
		System.out.println("The Value is: " + hash_map2.get(25));
		System.out.println("The Value is: " + hash_map2.get(30));
	}

}
