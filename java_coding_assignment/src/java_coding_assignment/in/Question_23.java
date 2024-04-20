package java_coding_assignment.in;

import java.util.PriorityQueue;

/*Write a Java program to convert a priority queue to an array containing all of the elements of the queue*/
public class Question_23 {

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

		System.out.println("priorityQueue: " + queue);

		Integer[] arr = new Integer[queue.size()];
		queue.toArray(arr);

		for (int i = 0; i < queue.size(); i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
