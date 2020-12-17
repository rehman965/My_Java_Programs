package String;

public class Reverse_String 
{
	public static void main(String[] args)
	{
		
        String s = "Hello";
        
		StringBuffer sb = new StringBuffer(s);
		
		StringBuffer sb1=sb.reverse();
		
		
		System.out.println(sb1);
		

		

		/*========================== OR ===============================*/

		
		
		
		String s1="rehman";
		String rev1="";
		
		for(int i=s1.length()-1; i>=0 ; i--)
		{
			rev1=rev1+s1.charAt(i);
			
			
		}
		
		
		System.out.println(rev1);
	}

}
