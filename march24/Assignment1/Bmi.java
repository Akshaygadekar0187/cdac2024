6)Implement a program that calculates the Body Mass Index (BMI) based on height and weight input using if-else to classify the BMI int categories (underweight, normal weight, overweight, etc.).

import java.util.Scanner;

class Bmi
{
    public static void main(String[] args)
       {
	  Scanner sc=new Scanner(System.in);
	        System.out.println("Enter ur weight ");
		double wt=sc.nextInt();

		System.out.println("Enter ur height ");
		double ht=sc.nextInt();
		
		double result=(wt/(ht*ht)) * 10000;
		
		if(result <=18)
		{
	            System.out.println("you are Underweight");
		}
		else if( result >18 && result <=25)
		{
		    System.out.println("you are Normal");
		}
		else if( result >25 && result <=40)
		{
		    System.out.println("you are Over Weighted");
		}
		else if( result >40)
		{
		    System.out.println("you are Over Obese");
		}
	}
}