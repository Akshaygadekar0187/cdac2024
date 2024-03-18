import java.util.Scanner;

public class Student {
	
		public int rollno;
		public int Class;
		public float marks;
		
	public void aceeptdetail(){	
			    Scanner sc = new Scanner(System.in); 
				System.out.print("rollno	:	");
				this.rollno = sc.nextInt();
				System.out.print("Class	:	");
				this.Class = sc.nextInt();
				System.out.print("marks	:	");
				this.marks = sc.nextFloat();
				sc.close();
			}
	
	public void printdetail() {
		System.out.printf("%-20s%-10d%-10.2f\n", this.rollno, this.Class, this.marks);
	}
}
class School{
	public static void main(String[] args) {
		
		
		Student emp = new Student();	
		
		emp.aceeptdetail( );	
		
		emp.printdetail( );		
		
	}
}
		   