package String;

public class Occurance_Of_String_Vowels
{
	public static void main(String[] args)
	{
		String s = "daddyeeeiou";

		s = s.replace(" ", "");
		
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
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
					if (s.indexOf(s.charAt(i)) == i) 
					{
						System.out.println(s.charAt(i) + " Occurance is : " + count);
					}
			}
		
	}

	}}
