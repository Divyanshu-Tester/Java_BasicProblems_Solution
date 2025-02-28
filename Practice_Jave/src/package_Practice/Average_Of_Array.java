package package_Practice;

public class Average_Of_Array

{



	public static void main(String[] args)


	{

		int Arr[] = {1,2,3,4};
		int sum = 0 ;
		double average;

		for(int Store:Arr)
		{
			sum += Store;
		}

		average = sum / Arr.length;
		System.out.println("Average of the array: " + average);
	}


}
