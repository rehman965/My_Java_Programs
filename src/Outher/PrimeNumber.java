package Outher;

public class PrimeNumber
{
	public static void main(String[] args) 
	{
		int n=17;
		int count=0;
		for(int i=2; i<n-1; i++)
		{
		  if(n%i==0)
			{
				
				count++;
			}
		}
			if(count==0)
			{
				System.out.println("number is  prime");
			}
			else
			{
				System.out.println("number is not prime");
			}
		
	}

}
