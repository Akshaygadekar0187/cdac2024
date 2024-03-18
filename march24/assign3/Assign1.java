class Assign{
public static void main(String args[]){

int i = getnumber();
  while(i<10)
{
    i++;
   int j = getnumber();
  if(j==0)
   {break;}
  else if(j==1)
    {continue;}
System.out.println(i);
}
System.out.println("finished");
}
static int getnumber(){
   return 5;
  }
}