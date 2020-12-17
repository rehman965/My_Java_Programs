package Collection;

import java.util.TreeSet;

public class Sorting_RemovingDuplicates_using_TreeSet_StringData 

 {
	public static void main(String[] args) 
	 {
	    String s="assfdjchvbasd";
	    
		TreeSet<Character> t= new TreeSet<Character>();
		
		char[] charArray = s.toCharArray();	
	        
	        for(Character c : charArray)
	        {
	        	
	        	t.add(c);
	        	
	        	
	        }
		
		System.out.println(t);  // for assending order
		
	   System.out.println(t.descendingSet());   //for desending order
}
	}
