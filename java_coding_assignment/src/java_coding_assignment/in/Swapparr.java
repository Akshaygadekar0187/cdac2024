package java_coding_assignment.in;

import java.util.ArrayList;
import java.util.Collections;

public class Swapparr {

	public static void main(String[] args) {
		ArrayList <Integer> obj = new ArrayList<>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(50);
		obj.add(60);
		obj.add(70);
		Collections.swap(obj, 0, 1);
		System.out.println(obj);
		Collections.swap(obj, 1, 2);
		System.out.println(obj);
		Collections.swap(obj, 4, 6);
		System.out.println(obj);
	}

}
