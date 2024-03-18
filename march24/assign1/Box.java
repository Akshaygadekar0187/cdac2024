class Box{
int height ;
int weight ;
int breadth;
int volume;
int area;

  Box(int a1, int b1, int c1){
		height = a1;
		weight = b1;
		breadth = c1;
	}

 public static void main(String[] args) {
       Box r = new Box(5 ,6 ,7);
        
        int volume = r.getVolume();
        System.out.println("volume=" + volume);
       
        int area = r.getArea();
        System.out.println("area=" + area);
   }

  int getVolume(){
  volume = height*weight*breadth;
  return volume;
  }

  int getArea(){
   area=height*breadth;
   return area;
  }

}