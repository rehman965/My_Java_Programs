package Array;

import java.util.Arrays;

public class SecondLargestNoInArray
{
	public static void main(String[] args) 
	{
		
		 int a[] = {10, 20, 25, 63, 96, 57};
		   
		    Arrays.sort(a);
		    
		    System.out.println("second highest no is : " +  a[a.length-2]);
		    
		    System.out.println("1st highest no in array is : " + a[a.length-1]);
			
		    System.out.println("lowest no in array is : " + a[0]);
		    
		    
	/* ==========================OR============================*/	
		
		
		
		int []x= {2,9,5,8,6,4,7,3,11};
		
		for (int i = 0; i < x.length; i++) 
		{
		for (int j = 0; j < x.length; j++)
		{
			if (x[i]<x[j]) 
			{
				int temp =x[i];
				x[i]=x[j];
				x[j]=temp;
			}
		}
	}
		System.out.println("second highest no is : " +x[x.length-2]);
		System.out.println("1st highest no in array is : " + a[a.length-1]);
		System.out.println("lowest no in array is : " + a[0]);
			
  }      

}



















