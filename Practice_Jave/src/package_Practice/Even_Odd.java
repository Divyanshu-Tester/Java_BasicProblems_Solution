package package_Practice;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args)

	{

		System.out.print("Enter a Number");

		try (Scanner EntrdNum = new Scanner(System.in))
		{
			String Num = EntrdNum.nextLine();

			int Digit = Integer.parseInt(Num);

			int Reminder = Digit%2;

			if (Reminder ==0)
			{
				System.out.print("Number is even");
			}
			else
			{
				System.out.print("Number is odd");
			}
		}


		catch (NumberFormatException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
