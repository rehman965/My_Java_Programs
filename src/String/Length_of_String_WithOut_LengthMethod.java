package String;

public class Length_of_String_WithOut_LengthMethod 
 {
	public static void main(String[] args) 
	
   	  {
		String s = "qspiders";
		int length =0;
		char[] array = s.toCharArray();
		for(char c:array)
		{
			length++;
			System.out.print(c);

		}
		System.out.println();
		System.out.println("Length of String : "+length);
		
		
		
		
		
		
		//lenth of each word
		
		String s1="ho this is rehman";
		String[] split = s1.split(" ");
		for(String a :split)
		{
			System.out.println(a + "======="+a.length());
		}
		
		
	}

}
