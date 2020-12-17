package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sorting_Using_Arrays_And_Collections 
{
	public static void main(String[] args) 
	{
		
//		Sorting Using Arrays Sort
		
		int a [] = {3,5,4,-7,7,-7,1,2,3,3,5};
		
		Arrays.sort(a);
		System.out.println("Largest number Using Arrays : "+a[a.length-1]);

		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
		
//		Sorting using Collections sort

		ArrayList list = new ArrayList<>();
		
		for (int value : a) {
			
			list.add(value);
		}
		Collections.sort(list);
		
		System.out.println("Largest number Using collection : "+list.get(list.size()-1));
	}

}
