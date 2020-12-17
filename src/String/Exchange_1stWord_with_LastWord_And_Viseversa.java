package String;

public class Exchange_1stWord_with_LastWord_And_Viseversa 
 {
	
	//i/p == welcome to css in india
	
//	o/p =  india to css in welcome
	
	public static void main(String[] args)
	{
		
			String s="welcome to css in india";
			String[] split = s.split(" ");
			
			
			String temp=split[0];
			split[0]=split[split.length-1];
			split[split.length-1]=temp;
			
		
			
		for(String sa : split)
		{
			System.out.print(sa+ " ");
		}
	}


}
