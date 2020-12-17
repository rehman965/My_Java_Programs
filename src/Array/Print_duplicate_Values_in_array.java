package Array;

public class Print_duplicate_Values_in_array 
{
	public static void main(String[] args) 
	{
		int [] arr = new int [] {2,9,5,8,6,4,7,3,8,6,4,2,3,11};  
		
        System.out.println("Duplicate elements in given array: ");  
  
        for(int i = 0; i < arr.length; i++)
        {  
            for(int j = i+1; j < arr.length; j++) 
            {  
                if(arr[i] == arr[j])  
                {
                	 System.out.println(arr[j]);  // OR   System.out.println(arr[i]);
                }
              


        }
      }
	}
}
