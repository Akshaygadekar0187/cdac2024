//3)Implement a simple calculator program that takes two numbers and an operator (+, -, *, /) as input and performs the operation using switch-case.

import java.util.Scanner;
class Cal{
    public static void main(String args[]){
	
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no");
        int n1 = sc.nextInt();
        System.out.println("Enter second no");
        int n2 = sc.nextInt();
        String operator =sc.next();
        sc.close();
        switch (operator)
       {
          case "+" :
              System.out.println("Addition is: "+(n1+n2));
              break;
          case "-":
              System.out.println(Substraction is: "+(n1-n2));
              break;
          case "*":
              System.out.println("Multiplication is: "+(n1*n2));
              break;
          case "/":
              System.out.println("Division is: "+(n1/n2));
              break;
        }
    }          
}
           
                
          
       
