package java_coding_assignment.in;

import java.util.ArrayList;
import java.util.Scanner;

public class Specific_index {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> obj =new ArrayList<>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(50);
		obj.add(60);
		obj.add(70);
		System.out.print("enter specified position and element");
		int pos= sc.nextInt();
		int ele = sc.nextInt();
		obj.add(pos,ele);
		
		//obj.add(sc.nextInt(),100);
		//System.out.print(obj);

		System.out.println(obj);
		sc.close();

	}

}
