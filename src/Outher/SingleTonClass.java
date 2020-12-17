package Outher;

public class SingleTonClass 
{
	private SingleTonClass()
	{
		
	}
	
	static SingleTonClass stn =new SingleTonClass();
	
	
	public static  SingleTonClass getSingleTonClassInstance()
	{
		return stn;
		
	}
	
	public static void main(String[] args) 
	{
        SingleTonClass singleTonClassInstance = SingleTonClass.getSingleTonClassInstance();
		System.out.println(singleTonClassInstance);
		
		SingleTonClass singleTonClassInstance1 = SingleTonClass.getSingleTonClassInstance();
		System.out.println(singleTonClassInstance1);
		
		SingleTonClass singleTonClassInstance2 =SingleTonClass.getSingleTonClassInstance();
		System.out.println(singleTonClassInstance2);

}

	
}

