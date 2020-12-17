package String;


//  i/p == java is programing lang
//  o/p == avaj si gnimargorp gnal 


public class Reverse_String_word_Wise 
{
	public static void main(String[] args) 
	
	{
		
	String s="java is programing lang";
	String[] split = s.split(" ");
	
	StringBuffer sb=new StringBuffer();
	for(String st : split)
	{
		StringBuffer sb2 =new StringBuffer(st);
		sb2 = sb2.reverse();
		sb.append(sb2+" ");
		
	}
	
	
      System.out.println(sb);
      
      
    

}
}