package java_coding.info;

import java.util.ArrayList;

public class First_postion {

	public static void main(String[] args) {
		ArrayList <Integer> obj = new ArrayList<>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(50);
		obj.add(60);
		obj.add(70);
		System.out.println(obj);
		obj.add(0,100);
		System.out.print(obj);

	}

}
