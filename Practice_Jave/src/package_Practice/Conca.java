package package_Practice;

import java.util.Arrays;

public class Conca 

{
	
	public static void main (String [] argument) throws InterruptedException
	{
		 
		int [] First_ArraySt = {1,2,1};
		int [] Concatenated = new int[First_ArraySt.length*2];	
		
		for(int i = 0; i<First_ArraySt.length; i++)
		{
			Concatenated[i] = 	First_ArraySt[i];
			Concatenated[i+First_ArraySt.length] = First_ArraySt[i];
			String Convert = Arrays.toString(Concatenated);
			System.out.println("This "+Convert);
			
			Thread.sleep(1000);		
			
		}
		
			
		
		
		
		
		
		
		
		
		
		
	}

}
