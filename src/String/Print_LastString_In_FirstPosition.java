package String;

/**
 * 
 * input -->hi this is rehman
 * output-->rehman is this hi
 *
 */
public class Print_LastString_In_FirstPosition
{
	public static void main(String[] args)
	{
		String s="hi this is rehman";
		String[] split = s.split(" ");
		StringBuffer sb=new StringBuffer();
		for(int i=split.length-1;i>=0;i--)
		{
			//System.out.print(split[i] + " ");
			     /*  (OR)*/
			String str = split[i].toString();
		    sb.append(str + " ");
	     }
	System.out.println(sb);

		
	}
}


