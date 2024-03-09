class Person{
  int age;
  float height;
  int weight;
 
  Person(){ 
           age = 100;
           height = 200.0f;
	   weight = 300;
	}

    Person(int a1, float b1, int c1){
	  age = a1;
          height= b1;
          weight = c1;
  }
  
    public static void main(String args[]){
    Person akshay1 = new Person();
    Person akshay = new Person(24, 6.2f ,70);
    
    System.out.println("age=" + akshay1.age);
    System.out.println("height=" + akshay1.height);
    System.out.println("weight=" + akshay1.weight);
    akshay1.display();
    System.out.println("age=" + akshay.age);
    System.out.println("height=" + akshay.height);
    System.out.println("weight=" + akshay.weight);
    akshay.display();
  }

  void display(){
  System.out.println("age=" +age);
  System.out.println("height="+ height);
  System.out.println("weight="+ weight);
  }

}  