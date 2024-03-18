import java.util.Scanner;

class Facto{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int i=1 ,fact=1;
        while(i<=num){
         fact=fact*i;
         i++;
       }
   System.out.println(fact);
    }
}