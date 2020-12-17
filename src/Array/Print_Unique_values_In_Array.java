package Array;

public class Print_Unique_values_In_Array
{
		public static void main(String[] args) {
			int []x= {2,9,5,8,6,4,7,3,8,6,4,2,3,11};
			
			for (int i = 0; i < x.length; i++) 
			{
				int count =0;
				for (int j = 0; j < x.length; j++)
				{
					if (x[i]==x[j]) 
					{
					count++;
					}
				}	
				if (count==1)
				{
					System.out.print(x[i]+" ");
				}
			}
		
		}
}
