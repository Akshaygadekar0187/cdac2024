class Employee
{
	 private String name;
	  private int id;
	  private double sal;
	  
	  void print(String name)
	  {
		  System.out.println(name);
	  }
	 
	  
	  void print(int id,double sal)
	  {
		  System.out.println(id+" "+sal);
	  }
	  
	  
	  void print(String name,int id,int sal)
	  {
		  System.out.println(name+" "+id+" "+sal);
	  }
}

public class Person {
	public static void main(String[] args)
	{
		Employee emp1=new Employee();
		emp1.print("sushank");
		emp1.print(788,722);
		emp1.print("akshy",422,595);
	}

}
