package java_coding_assignment.in;

import java.util.Iterator;
import java.util.TreeSet;

/*Write a Java program to find the numbers less than 7 in a tree set.*/
public class Quest_20 {

	public static void main(String[] args) {
		TreeSet<Integer> num = new TreeSet<Integer>();
		
		TreeSet <Integer>treeheadset = new TreeSet<Integer>();
		num.add(2);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		num.add(10);
		num.add(15);
		num.add(20);
		
		treeheadset = (TreeSet<Integer>)num.headSet(7);  

		   
		   Iterator<Integer> iterator;
		   iterator = treeheadset.iterator();
		     
		   System.out.println("Tree set : ");     
		   while (iterator.hasNext()){
		   System.out.println(iterator.next() + " ");
		   }
	}

}
