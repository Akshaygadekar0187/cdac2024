package java_coding_assignment.in;

import java.util.HashMap;

/*Write a Java program to count the number of key-value (size) mappings in a map*/

public class Question22 {

	public static void main(String[] args) {
		 
        HashMap<String, Integer> hash_map = new HashMap<String, Integer>(); 
        HashMap<Integer, String> hash_map2 = new HashMap<Integer, String>(); 
        
        hash_map.put("A", 10); 
        hash_map.put("4", 20); 
        hash_map.put("B", 30); 
        hash_map.put("C", 40); 
        hash_map.put("D", 50); 
  
        System.out.println("Initial Mappings are: " + hash_map); 
        System.out.println("The size of the map is " + hash_map.size()); 	
        
        hash_map2.put(10, "A"); 
        hash_map2.put(15, "4"); 
        hash_map2.put(20, "B"); 
        hash_map2.put(25, "C"); 
        hash_map2.put(30, "D"); 
  
        System.out.println("Initial Mappings are: " + hash_map2); 
        System.out.println("The size of the map is " + hash_map2.size()); 

	}

}
