package Outher;



/*
 * input ----> x=12.3-40+50-60;
 * 
 * output ----> 37 Or 37.7
 *  */
public class ComplexAddition 
{
	public static void main(String[] args) 
	{
		double x=12.3-40+50-60;
		
		System.out.println("With double: "+x);     //37.7
		System.out.println("With int :"+(int)x);   //37
		

}
}