package package_Practice;

import java.util.Scanner;

public class Celsius_to_Fahrenhei {

	public static void main(String[] args)

	{
		System.out.print("Enter The Celestial");

		Scanner Take_Input = new Scanner(System.in);

		String Store_Input = Take_Input.nextLine();

		int convert__int_and_Store = Integer.parseInt(Store_Input);

		double Formula = (convert__int_and_Store * (9.0/5.0)) + 32;

		System.out.print("The Farehn is  "+Formula+"Print");

		Take_Input.close();

	}

}
