package java_coding_assignment.in;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {
		ArrayList <Integer> obj = new ArrayList<>();
		obj.add(1000);
		obj.add(200);
		obj.add(100);
		obj.add(750);
		obj.add(500);
		obj.add(410);
		obj.add(30);
		System.out.println(obj);
		Collections.sort(obj);
		System.out.println(obj);
	}

}
