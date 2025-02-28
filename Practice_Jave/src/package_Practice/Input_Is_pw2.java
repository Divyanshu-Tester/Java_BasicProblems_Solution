package package_Practice;

import java.util.Scanner;

public class Input_Is_pw2 {

	public static void main(String[] args) 
	
	{
		

		System.out.print("Enter the First Number");
		Scanner Take_Input = new Scanner (System.in);
		int n =  Take_Input.nextInt();
		isPowerOfTwo(n);
		System.out.print(" Number" +n);
	
		
	
}
	public static boolean isPowerOfTwo(int n) 
	{
        return (n > 0) && ((n & (n - 1)) == 0);
	}

}
