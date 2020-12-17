 
package Array;

public class Add_Alternative_numbers_inArry 
{
	
public static void main(String[] args) 
	{
		
	int[] i= {1,3,4,5,6,7,8,9};    //addition of alternative numbers in array
	int z=0;
	for(int j=1;j<i.length;j++)
	{
		if(j%2==0)
		{
			z=z+i[j];
		}
	}
		System.out.println(z);
		
		
		
		
		int[] k= {1,2,3,4,5,6,7,8,9,};     //ignore 1st element from 2nd element perform addition of alternative numbers
		int y=0;
		for(int m=1;m<k.length;m++)
		{
			if(m%2==0)
			{
				y=y+k[m];
			}
		}
		
		System.out.println(y);
		
		
		
		
		
		
	}

	
}