package package_Practice;

import java.util.Scanner;

public class Bank


{
	public static int  Amount,UPAmount,DPAmount;


	public static void main(String[] args)


	{

		System.out.println("Current ammount\n"+Amount);
		deposite();
		withdraw();

	}


	public static void deposite()
	{
		System.out.println("Enter ammount you want to deposite\n");
		Scanner Damt = new Scanner(System.in);
		int DP = Damt.nextInt();
		int Update = DP+Amount;
		System.out.println("Current Balance is \n"+Update);
		UPAmount = Amount+Update;

	}

	public static void withdraw()
	{

		System.out.println("Enter ammount you want to Withdraw\n");
		Scanner Wamt = new Scanner(System.in);
		int WA = Wamt.nextInt();

		if(WA>=UPAmount)
		{
			System.out.println("Insufficiat Balance \n Current Balance is "+UPAmount);

		}
		else
		{
			int withdraw = UPAmount- WA;
			System.out.println("Withdraw Amount is \n"+WA);
			DPAmount=UPAmount-withdraw;
			System.out.println("Current Balance is \n"+withdraw);


		}
	}
}
