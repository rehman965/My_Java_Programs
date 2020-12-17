package Collection;

import java.util.TreeSet;

public class Sorting_RemovedDuplicates_Using_Treeset_IntData
{
	public static void main(String[] args)
	{		
		System.out.println("==========sorting single array int ===========");
		System.out.println();
		int [] a= {11,15,2,5,4,1};
		TreeSet<Object> t= new TreeSet<>();
		for(int s : a)
		{
			t.add(s);
		}
		
		System.out.println(t);
		System.out.println(t.descendingSet());
		System.out.println();
        System.out.println("==============new jagged array program ========================");
		
		  int[] aint = {1,2,3,4,5,6,7,8,9,10,10};
		  int[] bint= {10,11,12,13,3,14,4,11};
		  int[] cint= {7,8,9,10,0,3,4,7};
		  
		  System.out.println();
		  System.out.println("============Without Duplicates By Using Jagged Array and collection ================");

		  int [][] jarray = new int[3][];
		  jarray[0]=aint;
		  jarray[1]=bint;
		  jarray[2]=cint;
		  
		  TreeSet<Integer> treeSet = new TreeSet<>();
		  
		  for (int[] i : jarray) 
		  {
			for (int j : i) 
			{
				treeSet.add(j);
			}
		  }
		  System.out.println();
		  System.out.println(treeSet); 
		  System.out.println();
		  System.out.println("======================== for dessending order ====================");
		  System.out.println();
		  
		
		  System.out.println(treeSet.descendingSet());
		  
		  System.out.println();
		  
		  TreeSet<Integer> lst1 = convert(aint);
		  TreeSet<Integer> lst2 = convert(bint);
		  TreeSet<Integer> lst3 = convert(cint);
		  
		  lst1.addAll(lst2);
		  lst1.addAll(lst3);
		  
		  System.out.println("============Without Duplicates Using Collection================");
		  System.out.println();
		  System.out.println(lst1);
		  System.out.println();
		  
		     lst1.retainAll(lst2);
		     lst1.retainAll(lst3);
		     
		     System.out.println("============Only Duplicates Using Collection================");
		     System.out.println();
		     System.out.println(lst1);
		     System.out.println();
		 }
		 
		 public static TreeSet<Integer> convert(int[] arr) 
		 {
		  TreeSet<Integer> set = new TreeSet<Integer>();
		  
		  for(int i=0; i<arr.length ; i++) 
		  {
		   set.add(arr[i]);
		  }
		  return set;
		 }
	
        
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
}
