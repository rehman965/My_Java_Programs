package Array;

public class Missing_No_In_Array
{
	public static void main(String[] args) 
	{
		int[] a= {11,22,33,55,66};
		for(int i=0;i<a.length;i++)
		{
			if(a[i] != (i+1)*11)
			{
				System.out.println((i+1)*11);
				break;
			}
		}
		
	}

}
