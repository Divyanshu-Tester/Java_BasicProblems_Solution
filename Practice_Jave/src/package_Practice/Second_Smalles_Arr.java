package package_Practice;

import java.util.Arrays;

public class Second_Smalles_Arr

{

	public static void main(String[] args)

	{
		int [] My_Array = {34,56,98,23};

		Arrays.sort(My_Array );
		Arrays.toString(My_Array );

		System.out.println("Current Array" +Arrays.toString(My_Array )+  "\nThe Second Shortest Number in Array is :   "+My_Array [1]);

	}



}
