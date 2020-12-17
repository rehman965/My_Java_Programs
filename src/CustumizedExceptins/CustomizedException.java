package CustumizedExceptins;

import java.util.Scanner;

public class CustomizedException 
{
	public static void main(String[] args) throws InvalidAgeException 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter age to check");
	    
		int age = s.nextInt();
	    
		if(age>18)
		{
			System.out.println("elegible for voting");
		}
		else 
		{
			throw new InvalidAgeException();
		}
	}
}
