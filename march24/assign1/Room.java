class Room {
    int height=24;
    int weight=84;
    int breadth=20;
    int volume;
    
    public static void main(String[] args){
        Room r = new Room();
        int a = r.volume1(7,5,2);
        System.out.println(a);
        int b = r.volume2();
        System.out.println(b);
    }

    int volume1(int height, int weight, int breadth){
    volume=height*weight*breadth;
    return volume;
    }
    
    int volume2(){
    volume=height*weight*breadth;
    return volume ;
   }

}