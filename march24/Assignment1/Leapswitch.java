import java.util.Scanner;
	
class Leapswitch
{
   public static void main(String[] args)
	{
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter a year to find its Leap OR Not");
	int yr=sc.nextInt();
	switch(yr)
	{
	case 1:
            if(yr%4==0)
	     {
	    if(yr%100==0)
		{
	         if(yr%400==0)
		    System.out.println("Leap year");
		 else
		System.out.println("Not leap year");
		}
		else{
		System.out.println("Leap year");
		}
	    }
	else 
	{
	      System.out.println("Not leap year");
	}
	     break;
	 default : System.out.println("Not leap year");
	   }
     }
}