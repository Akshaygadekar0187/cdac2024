package java_coding_assignment.in;

import java.util.HashSet;
/*Write a Java program to compare two sets and retain elements which are same on both sets.
*/

public class Same_set {

	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(100);
		set1.add(200);
		set1.add(300);
		set1.add(400);
		set1.add(500);
		set1.add(600);
		
		HashSet<Integer> set2 = new HashSet<>();
		set2.add(100);
		set2.add(200);
		set2.add(700);
		set2.add(800);
		set2.add(900);
		set2.add(600);
		
		set1.retainAll(set2);
        System.out.println("HashSet content:");
        System.out.println(set1);

	}

}
