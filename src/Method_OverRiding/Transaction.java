package Method_OverRiding;

import java.util.Scanner;

public class Transaction 
{
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("welcome to amazon");
		System.out.println("enter payment options");
		String option = scan.next();
		Pay p = new Pay();
		Amazon ep = p.executePayment(option);
		ep.payment();
		
		
	}

}

