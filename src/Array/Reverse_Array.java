package Array;

public class Reverse_Array {

	public static void main(String[] args) 
    {
		int[] x= {10,20,15,25,3};
		
		int[] rev=new int[x.length];
		
		int count =0;
		
		for(int i=x.length-1; i>=0; i--)
		{
			rev[count] = x[i];
			count++;
		}
		
		for(int j : rev)
		{
			System.out.println(j);
		}
			
			
			
	
		
	}

}
