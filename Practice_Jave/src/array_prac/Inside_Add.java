package array_prac;

import java.util.Arrays;

public class Inside_Add 


{
	
	
		public static void main(String[] argument)
		{
			
			int [] Input_Array = {1,2,3,4};
			
			int [] Output_Array = new int [Input_Array.length];
			
			for(int i=0;i<Input_Array.length;i++)
			{
				if(i==0)
				{
					Output_Array[i]= Input_Array[i];
					
				}
				else
				{
					Output_Array[i] = Output_Array[i - 1] + Input_Array[i];
				}
				
					
				
			}
			
			String Output = Arrays.toString(Output_Array);
			
			System.out.println("The Output is "+Output);
			
		}
	

	

}
