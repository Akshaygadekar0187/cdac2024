import java.util.Scanner;
class Book{
    int bookId;
    int title;
    int author; 
    int isAvailable;

 public  Book(){
    bookId = 101;
    title = 5555 ;
    author = 99; 
    isAvailable = 190;
          }

   void Display(){
		System.out.println(bookId+" " +title+ " " +author+ " " + isAvailable);
	}


}

class User{
    int userId;
    int name;
    int booksborrowed; 

    User(){
    userId = 59781;
    name = 566688;
    booksborrowed = 11111;
   }
  
    public static void main(String args[]){
     Book obj = new Book();
     obj.Display();
      //scanner sc = new Scanner(System.in)
      //int choice = sc.nextInt();

  System.out.println("Welcome to the Virtual Library Management System!");

  for(int i = 0 ; i< 5 ; i++){
      
      Scanner sc = new Scanner(System.in);
      int choice = sc.nextInt();
    
switch(choice){
	
	case 1:
                System.out.println("Borrow a Book");
		break;

	case 2:
		System.out.println("Return a Book ");
		break;

	case 3:
		System.out.println("Display Available Books");
		break;

        case 4:
		System.out.println("Display Borrowed Books");
		break;

        case 5:
		System.out.println("Exit");
		break;

	      }
           }

                   }
}

