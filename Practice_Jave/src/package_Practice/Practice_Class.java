package package_Practice;

public class Practice_Class {

	public static void main(String[] args)


	{
		System.out.print("Practice String , String Builder , String Buffer\n");

		String greeting = "Hello" ;
		greeting = greeting +"World" ;
		System.out.println("\nOutput is " +greeting);

		StringBuilder builder  = new StringBuilder("Hello");
		builder.append(12);
		System.out.println("\nOutput for String Builder =  " +builder);

		final StringBuffer Buffer = new StringBuffer("hello");
		Buffer.append("All");
		System.out.println("\nOutput for String Buffer =  " +Buffer);


	}

}
