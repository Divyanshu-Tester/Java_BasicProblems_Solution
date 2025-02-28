package package_Practice;

import java.util.Scanner;

public class Largets_Among {

	public static void main(String[] args)

	{
		System.out.print("Enter First Number");
		Scanner FstInNu = new Scanner(System.in);

		int Num1 = FstInNu.nextInt();


		System.out.print("Enter Second Number");
		Scanner SndInNu = new Scanner(System.in);

		int Num2 = SndInNu.nextInt();



		System.out.print("Enter ThirdNumber");
		Scanner TrdInNu = new Scanner(System.in);

		int Num3 = TrdInNu.nextInt();
		int Result1;

		if(Num1>=Num2 )
		{
			if(Num1>=Num3)
			{
				System.out.print("Biggest Number Num1\n"+Num1);
			}
			System.out.print("Biggest Number Num1\n"+Num3);
		}
		else
		{
			if(Num2>=Num3)
			{
				System.out.print("Biggest Number Num2\n"+Num2);
			}
			else

			{
				System.out.print("Biggest Number Num3\n"+Num3);
			}


		}


	}

}
