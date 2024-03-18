/* -----que1--------------------------------------------------------------------------------
public class Main{
 public static void main(String[] args){
int x = 5;
//double y = 10;error: incompatible types: possible lossy conversion from double to int
int y = 10;
int z = x + y;
System.out.println("Sum=" + z);
   } 
}
-------------------------------------------------------------------------------------------*/

/*-----que2---------------------------------------------------------------------------------
public class Main {
public static void main(String[] args) {
for (int i = 1; i <= 5 ; i++) {     //correction i<5
System.out.println("Number: " + i);
     }   
  }
}
----------------------------------------------------------------------------------------*/
/*  -----que3--------------------------------------------------------------------------
public class Main {
public static void main(String[] args) {
int x = 10;
//if (x == System.out.println("x is 10")) error : void type is not allowed System.out.println( System.out.println("x is 10"));
if (x == 10) {
       System.out.println("x is 10");
       } 
  else 
      {
       System.out.println("x is not 10");
      }
   }
}
------------que4---------------------------------------------------------------------------*//*
public class Main {

public static void main(String[] args) {
int[] numbers = {1,2,3,4,5};
for(int i =0 ; i<numbers.length ; i++){
System.out.println("numbers" + numbers[i]);

   }
  }
}
-----------que5--------------------------------------------------------------------------------*//*
public class Main {
public static void main(String[] args) {
int[] numbers= {1, 2, 3, 4, 5};
for (int i = 0; i < numbers.length; i++) {

System.out.println("Number: " + numbers[5]);
        }
      }
}
-----------que6-------------------------------------------------------------------------------*/

public class Main {
public static void main(String[] args) {
float x = 5;
float y = 10;
float z = x + y;
System.out.println(z);
    }
}