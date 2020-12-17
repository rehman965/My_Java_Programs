package Method_OverRiding;

public class Pay 
{
	public Amazon executePayment(String paymentOptions)
	{
		if(paymentOptions.equals("amazon"))
		{
			return new Amazon();
		}
		
		if(paymentOptions.equals("icici"))
		{
			return new Icici();
		}
		
		if(paymentOptions.equals("hdfc"))
		{
			return new Hdfc();
		}
		
		else 
		{
			return null;
		}
		
		
	}

}
