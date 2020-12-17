package String;

import java.util.HashSet;

public class Occurance_Of_String 
{
	public static void main(String[] args)
	
	{
//==================================logic 1==========================================================
		
		
		String s7 = "monny monny monny";        // occurance of string
		
		System.out.println("===========occurance of Each character============");
		System.out.println();
	   
		
		String s = s7.replace(" ", "");
		
		for (int i = 0; i <= s.length() - 1; i++) 
		  {
			
			int count = 0;
			for (int j = 0; j <= s.length() - 1; j++) 
			 {
				if (s.charAt(i) == s.charAt(j)) 
				{
					count++;
				}
			}
			
			if (s.indexOf(s.charAt(i)) == i) 
			{
				
				System.out.println(s.charAt(i) + " Occurance is : " + count);
			}
			
		}
		
		
		
		
//==============logic 2================================================================		
		
		

		String s1="welcome to java";
		
		HashSet<Character> hs=new HashSet<Character>();
		for(int i=0;i<=s1.length()-1;i++)
		{
			hs.add(s1.charAt(i));
		}
		
		
		System.out.println(hs);
		
		for(Character c : hs)
		{
		
		int count=0;
		for( int j=0; j<=s1.length()-1; j++)
		{
			if(c==s1.charAt(j))
			{
				count++;
			}
			
		}
		
		System.out.println(count);
		
		
		
		
		
		
		
		}
		
		
	}

}