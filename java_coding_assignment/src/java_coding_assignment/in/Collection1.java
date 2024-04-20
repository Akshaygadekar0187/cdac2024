package java_coding_assignment.in;

import java.util.ArrayList;

public class Collection1 {

	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList<>();
		color.add("red");
		color.add("orange");
		color.add("blue");
		color.add("white");
		color.add("purple");
		color.add("black");
		color.add("yellow");
		color.add("brown");
		
		int count = color.size();
		System.out.println("Count	:	"+count);
		System.out.println("Count	:	"+color);
		
		String COLOUR;
		for(int index = 0; index< color.size();index++) {
			COLOUR = color.get(index);
			System.out.println("color :" + COLOUR);
		}
		
	}

}
