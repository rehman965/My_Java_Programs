package Collection;

import java.util.HashMap;

/*
 * input --->  s={'a' 100 ,'b' 200 , 'c' 300}
 *             g={'a' 300 ,'b' 200 , 'd' 400}
 * 
 *  output ----> {a=300, b=200, c=300, d=400}
 * */


public class HashMap_Proprerties 
{
	public static void main(String[] args)
	{
		HashMap<Character, Integer> hp1 =new HashMap<Character, Integer>();
		hp1.put('a', 100);
		hp1.put('b', 200);
		hp1.put('c', 300);
		

		HashMap<Character, Integer> hp2 =new HashMap<Character, Integer>();
		hp2.put('a', 300);
		hp2.put('b', 200);
		hp2.put('d', 400);
		
		hp1.putAll(hp2);
		System.out.println(hp1);
		
	}

}
