package java_coding_assignment.in;

import java.util.HashSet;

public class Hashset_to_arr {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(400);
		set.add(500);
		set.add(600);
		Integer arr[] = new Integer[set.size()];
		set.toArray(arr);
		/*
		 * for (int i = 0; i < set.size(); i++) {
		 *  System.out.print(arr[i] + " "); 
		 *  }
		 */

		for (int ele : arr) {
			System.out.println(ele);
		}
	}

}
