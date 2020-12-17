package String;

public class Convert_lowerCasesLetters_into_higherCasesLetters_inA_String 
 {

	//  i/p==Welcome
	//  o/p==wELCoMe
	
	public static void main(String[] args)
	{
		String s="Welcome";
		
		char charAt = s.toLowerCase().charAt(0);
		
		String lc = s.toLowerCase();
		
System.out.println(charAt + lc.substring(1,4).toUpperCase() + lc.substring(4, 5) + lc.substring(5, 6).toUpperCase() + lc.substring(6, 7));
		
		
	}
 }
 