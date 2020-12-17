package String;

public class Superate_All_SetOf_Characters_in_String 
 {
	public static void main(String[] args) 
	  {
		  String s="123!@#$aghj1549^&*(WSDFsdAVF";
		  String num="";
		  String splChar="";
		  String lowCase="";
		  String upr="";
		   
		  for(int i=0;i<=s.length()-1;i++)
		  {
			  if(s.charAt(i)>=65 && s.charAt(i)<97)
			  {
				  upr+=s.charAt(i);
			  }
			  
			  else if(s.charAt(i)>=97 && s.charAt(i)<122)
			  {
				  lowCase+=s.charAt(i);
		       }
			  
			  else if(s.charAt(i)>=48 && s.charAt(i)<57)
			  {
				  num+=s.charAt(i);
				  
			  }
			  else
			  {
				  splChar+=s.charAt(i);
			  }
			  
			 }
		  System.out.println("lowercases r     " + lowCase + "--------" + lowCase.length());
		  System.out.println("upper cases r " + upr);
		  System.out.println("special char " + splChar);
		  System.out.println("numbers r "+ num);
	  }	  
	

}
