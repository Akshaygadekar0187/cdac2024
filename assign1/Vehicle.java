class Vehicle{
  int price;
  String color;
  String model;

  Vehicle(int a1, String b1, String c1){
	  price = a1;
          color = b1;
          model = c1;
  }
  
    public static void main(String args[]){
    
    Vehicle java = new Vehicle(6000,"blue","Meteor");
    
    System.out.println("price=" +java.price);
    System.out.println("color=" +java.color);
    System.out.println("model=" +java.model);
    java.display();
  }

  void display(){
  System.out.println("price="+ price);
  System.out.println("color="+ color);
  System.out.println("model="+ model);
  }

}