package java_coding_assignment.in;

import java.util.HashSet;
import java.util.Iterator;

public class Hahing_iterat {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();

		set.add(100);
		set.add(200);
		set.add(300);
		set.add(400);
		set.add(500);
		set.add(600);
		Iterator<Integer> p = set.iterator();

		while (p.hasNext()) {
			System.out.println(p.next());
		}

		for (Integer element : set) {

			System.out.print(element + " ");
		}
	}
}
