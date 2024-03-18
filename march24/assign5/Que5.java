class Que5{

	public static void main(String args[]){
		
	/*
        int sum=0;
        System.out.println(sum);
	int arr[] = {1, 2, 3, 4, 5};
        for(int i= 5 ; i<arr.length ; i-- ){
         sum=arr[i];
      }
     }
}
*/

       /* int arr[] = {1, 2, 3, 4, 5};
 
        int arr1[] = {3, 4, 5, 6, 7};

        colect= 0;
       for( int i =0; i<5 ; i++){
       arr[i]==arr1[i];

       colect= colect+0;
}*/


int a[]={5, 3, 9, 7, 1};

int temp;  
for (int i = 0; i < a.length; i++)   
        {  
            for (int j = i + 1; j < a.length; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[];  
   }  
}
 