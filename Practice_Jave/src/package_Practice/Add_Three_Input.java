package package_Practice;

import java.util.Scanner;

public class Add_Three_Input {

	public static void main(String[] args) 
	
	{
		System.out.println("Enter First Number ");
		Scanner First_Number = new Scanner(System.in);
		int FstNo = First_Number.nextInt();
		
		System.out.println("Enter Second Number ");
		Scanner Second_Number = new Scanner(System.in);
		int SndNo = First_Number.nextInt();
		
		System.out.println("Enter Third Number ");
		Scanner Third_Number = new Scanner(System.in);
		int TrdNo = First_Number.nextInt();
		
		
		
		int Total ;
		Total = FstNo + SndNo + TrdNo ;
		System.out.println("Addition of all three numbers are  "+Total);
		
		

	}

}
