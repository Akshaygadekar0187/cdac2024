//1)Write a program that takes a numerical grade as input and outputs the corresponding letter grade using if-else statements.  

import java.util.Scanner;

public class Grade
{
	public static void main(String[] args)

	{
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter marks to get grade");
	int gr=sc.nextInt();
	
	if(gr>=85)
	{
		System.out.println("A+ Grade");
	}
	else if(gr<85 && gr>=70)
	{
		System.out.println("A Grade");
	}
	else if(gr<70 && gr>=60)
	{
		System.out.println("B Grade");
	}
	else if(gr<60 && gr>=50)
	{
		System.out.println("C Grade");
	}
	else if(gr<50 && gr>=35)
	{
		System.out.println("D Grade");
	}
	else 
	{
		System.out.println("Fail");
	}
     }
}