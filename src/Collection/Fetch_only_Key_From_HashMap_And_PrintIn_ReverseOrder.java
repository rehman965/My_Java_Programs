package Collection;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Fetch_only_Key_From_HashMap_And_PrintIn_ReverseOrder 
{
	public static void main(String[] args)
	{
		HashMap<Integer,String > bangArea=new HashMap<Integer, String>();
	
		bangArea.put(01, "mg road");
		bangArea.put(05, "oar");
		bangArea.put(03, "btr");
		bangArea.put(55, "hebbal");
		bangArea.put(154, "oar");
		bangArea.put(02, "btr");
		bangArea.put(15, "hebbal");
		
		System.out.println(bangArea);
		
		System.out.println("=========Fetching only keys============");
		
		Set<Integer> keySet = bangArea.keySet();

		for(Integer k : keySet)
		{
			System.out.println(k);
		}
		
		TreeSet<Integer> t= new TreeSet<Integer>(keySet);
		
		System.out.println("========Printing assending order=============");
		
		System.out.println(t);
		
		System.out.println("========printing desending order=============");
		
		System.out.println( t.descendingSet());
		

}}
