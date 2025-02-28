package package_Practice;

public class Maximum_Array_Value

{

	public static void main(String[] args)

	{
		int[] numbers = {11, 2, 3, 444};

        // Initialize max with the first element

        int max = numbers[0];

        // Iterate through the array
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        // Print the largest number
        System.out.println("The largest number in the array is: " + max);
	}
}
