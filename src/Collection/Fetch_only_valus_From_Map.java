package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Fetch_only_valus_From_Map 
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
	

	Collection<String> values = bangArea.values();
	System.out.println("=========Fetching only values============");
	for(String s : values)
	{
		System.out.println(s);
	}
	
	TreeSet<String> t= new TreeSet<String>(values);
	
	System.out.println("========Printing assending order=============");
	
	System.out.println(t);
	
	NavigableSet<String> descendingSet = t.descendingSet();
	
	System.out.println("========printing desending order=============");
	
	System.out.println(descendingSet);
	
	
	
	
	
	}
}
