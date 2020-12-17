package String;

import java.util.Arrays;

public class Check_TheGiven_2_Strings_R_Anagram_OR_Not 
{
	public static void main(String[] args)
	{
		//convert strings into small r capital letters
		String s1="Jaav".toLowerCase();
		String s2="JvAa".toLowerCase();
		
		//convert string to char
		char[] charArray1 = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();
	
		//sort characters in array
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		//compare the characterArrays
	if(	Arrays.equals(charArray1 ,charArray2))
	{
		System.out.println("2 strings r anagram");
	}
	else
	{
		System.out.println("not");
	}
		
	}

}
