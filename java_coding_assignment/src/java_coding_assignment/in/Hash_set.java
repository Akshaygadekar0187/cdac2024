package java_coding_assignment.in;

import java.util.HashSet;

public class Hash_set {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();

		set.add("Red");
		set.add("orange");
		set.add("Black");
		set.add("White");
		set.add("brown");
		set.add("Yellow");
		System.out.println("Hash Set: " + set);
		
		set.clear();
		//set.removeAll(set);
		System.out.println("Hash Set after removing elements " + set);

	}

}
