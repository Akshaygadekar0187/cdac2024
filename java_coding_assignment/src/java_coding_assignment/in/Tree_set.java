package java_coding_assignment.in;
/*Write a Java program to create a new tree set, add some colors (string) and print out the tree set*/

import java.util.TreeSet;

public class Tree_set {

	public static void main(String[] args) {
		TreeSet<String> color = new TreeSet<String>();
		color.add("Red");
		color.add("Green");
		color.add("Orange");
		color.add("purple");
		color.add("yellow");
		color.add("pink");
		color.add("White");
		color.add("Black");
		System.out.println(" ");
		System.out.println(color);
	}

}
