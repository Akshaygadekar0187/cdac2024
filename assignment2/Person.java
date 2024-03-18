class Vehicle
{
  private String company_name;
  private int color;
  private int model;
  
  void print(String name)
  {
	  System.out.println(name);
  }
 
  
  void print(int m,int c)
  {
	  System.out.println(m+" "+c);
  }
  
  
  void print(String name,int c,int m)
  {
	  System.out.println(m+" "+c+" "+name);
  }
}

public class Person {
	
	public static void main(String[] args)
	{
	 Vehicle v=new Vehicle();
	 v.print("BMW");
	 v.print(10,9999);
	 v.print("tata",8978);
	}
}
