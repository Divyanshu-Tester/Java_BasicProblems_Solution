package package_Practice;

public class dumm

{

	public static void main(String[] args)
	{
		
		//Swap_Numbers();
		Str();
		
	}
	
	
	//SWAP TWO NUMBERS 
	
	public static void Swap_Numbers()
	{
		int a = 2 ;
		int b = 9 ;
		
		System.out.println(" Number Before Swapping A= " +a);
		System.out.println(" Number Before Swapping B= " +b);
		
		a = a+b;
		b = a-b ;	
		a = a-b ;
		
		System.out.println(" Number After  Swapping A= " +a);
		System.out.println(" Number After  Swapping B= " +b);
		
	}
	
	
	
	//Write a Java program where the input string is "123 Alpha 789", and you have to extract and sum all the numbers in the string.
	// OUT PUT  Sum of numbers: 912
	
	
	public static void Str()
	{
		
		String Pull_Out = " 123 ALpha 789";
		
		String[] split = Pull_Out.split("\\D");
		
		
		System.out.println(" This is " +split);
		
		
		
		
		
	}

}
