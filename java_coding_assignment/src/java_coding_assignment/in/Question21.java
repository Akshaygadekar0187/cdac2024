package java_coding_assignment.in;

import java.util.PriorityQueue;

/*Write a Java program to remove all the elements from a priority queue*/
public class Question21 {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

		queue.add(10);
		queue.add(15);
		queue.add(30);
		queue.add(20);
		queue.add(25);
		queue.add(45);
		queue.add(35);
		queue.add(50);
		queue.add(15);
		queue.add(85);

		System.out.println("before priorityQueue: " + queue);

		queue.remove(30);
		queue.remove(5);
		queue.remove(35);
		queue.remove(50);
		queue.remove(15);
		

		System.out.println("PriorityQueue after removing elements: " + queue);
	}

}
