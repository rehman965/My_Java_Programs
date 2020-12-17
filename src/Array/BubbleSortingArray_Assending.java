package Array;

public class BubbleSortingArray_Assending
  {
	public static void main(String[] args) 
	{
		
	int []x= {2,9,5,8,6,4,7,3,11};
	
	for (int i = 0; i < x.length; i++) 
	 {
	   for (int j = 0; j < x.length; j++)
	     {
	     	if (x[i]<x[j]) //Assending                   /* if (x[i]>x[j]) */  //for desending
				
	         {
			    int temp =x[i];
			    x[i]=x[j];
			    x[j]=temp;
		     }    
	    }	
     }
	for (int i : x)
	  {
		System.out.print(i+" ");
	  }

   }
}