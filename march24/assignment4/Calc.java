class Calc{

public static void main(String[] args){
   int array[]={5,4,3,9,1,7,9};
   int sum=0;
   for(int i= 0; i<array.length ;i++){
       sum = sum + array[i];
     }
System.out.println("sum=" + sum);
    float avg;
    avg=sum/array.length;
System.out.println("avg=" + avg);
     }
}