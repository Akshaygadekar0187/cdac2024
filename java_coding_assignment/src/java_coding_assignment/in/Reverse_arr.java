package java_coding_assignment.in;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;


public class Reverse_arr {

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
		Collections.reverse(obj);	
		System.out.println(obj);
		
       ListIterator<Integer> itr = obj.listIterator( obj.size() );
		
		Integer element = null;
		while( itr.hasNext( ) ) {
			element = itr.next();
			//System.out.print( element +" ");
		}
		System.out.println();
		while( itr.hasPrevious() ) {
			element = itr.previous();
			System.out.print( element +" ");
		}
	}

}


