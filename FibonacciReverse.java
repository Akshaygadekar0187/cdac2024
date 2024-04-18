
// 10. Print Fibonacci Series in reverse order using Recursion

import java.util.Scanner;
class FibonacciReverse
{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int no=sc.nextInt();
		
		
		System.out.println("=========");
		print(no,0,1);
	}
	
	public static void print(int no,int a,int b)
	{
		if(no==0)
			return;
		else
		{
			int c=a+b;
			print(no-1,b,c);
			System.out.print(c+" ");
		}
			
		
	}
	
}