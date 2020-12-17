package Collection;

import java.util.HashMap;

public class Printing_City_Area 

{
	public static void main(String[] args) 
	{
		System.out.println(getCity("Banglore", 1));
		
	}

	public static String getCity(String c ,Integer i)
	{
	
			HashMap<Integer,String > bangArea=new HashMap<Integer, String>();
			bangArea.put(01, "mg road");
			bangArea.put(02, "oar");
			bangArea.put(03, "btr");
			bangArea.put(04, "hebbal");
			
			 
			HashMap<Integer,String > MysoreArea=new HashMap<Integer, String>();
			MysoreArea.put(01, "mgr");
			MysoreArea.put(02, "myr");
			MysoreArea.put(03, "hdr");
			MysoreArea.put(04, "bs");
			
			
           //outer hashMAp
			HashMap<String,HashMap<Integer,String > > city=new HashMap<String, HashMap<Integer, String>>();
			 
			city.put("Banglore",bangArea);
			city.put("mysore",MysoreArea);
			
			return "city ==>" + c + "Area ===>" + city.get(c).get(i);
			
			
			
			
	}
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

