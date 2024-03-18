public class Main{
 public static void main(String[] args){
int x = 5;
//double y = 10;error: incompatible types: possible lossy conversion from double to int
int y = 10;
int z = x + y;
System.out.println("Sum" + z);
} 
}