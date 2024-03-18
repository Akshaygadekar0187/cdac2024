import java.util.Scanner;
class Multi{

public static void main(String[] args){
 Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
        int sum = 3*n;
   for(int i = 1; i<n ; i++){
       int t = 2*(i-1);
       System.out.println(t);
if(t%3==0){

System.out.println(sum);

}
     }
  }
}