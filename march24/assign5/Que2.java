import java.util.Scanner;

class Que2{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the value of rows");
	int n = sc.nextInt();
       
        for(int i = 1; i<=n ; i++){
		for(int j = 0; j<=n-i ; j++){
			
		System.out.print(n-j + " ");
		}	
	System.out.println();
     }
  }
}