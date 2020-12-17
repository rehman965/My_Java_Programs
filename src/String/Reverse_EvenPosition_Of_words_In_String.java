package String;

//   i/p==    sun raises in east raa
//   o/p==sun sesiar in tsae raa
 
public class Reverse_EvenPosition_Of_words_In_String 
{
	public static void main(String[] args) 
	{
		String s="sun raises in east raa";
		String[] split = s.split(" ");
		StringBuffer sb =new StringBuffer();
		
		for(int i=0; i<split.length;i++)
		{
			if(i%2 !=0)
			{
				
		    	StringBuffer sb1=new StringBuffer(split[i]);
		    	StringBuffer reverse =sb1.reverse();	
			    sb.append(reverse + " ");
			
			}
		else
			{
				sb.append(split[i] +  " ");
			}
		
	}

	System.out.println(sb.toString());	
		
		
	}
}
