package package_Practice;

import java.util.Scanner;

public class Check_Vowel {

	public static void main(String[] args) 
	
	{
		System.out.println("Enter a Char");
		Scanner Take_Input = new Scanner(System.in);
		String chkVowel = Take_Input.nextLine();  
	
		String Vowel1 = "a";
		String Vowel2 = "e";
		String Vowel3 = "i";
		String Vowel4 = "o";
		String Vowel5 = "u";
		
		
	    if(chkVowel.equals(Vowel1)|| chkVowel.equals(Vowel2)||chkVowel.equals(Vowel3)||chkVowel.equals(Vowel4)||chkVowel.equals(Vowel5) )
	    {
	    	System.out.println("The Entered Char  is Vowel");
	    }
	    else 
	    {
	    	System.out.println("The Entered Char is Not _ Vowel");
	    }
		
				
		
		
		

	}

}
