package poly;




	class Animal

	{
	    public void makeSound()

	    {
	        System.out.println("Generic animal sound");
	    }
	}

	class Dog extends Animal

	{
	    @Override
	    public void makeSound()

	    {
	        System.out.println("Woof!");
	    }
	}



public class Pollly

{
    public static void main(String[] args)


    {

        Animal animal1 = new Dog();
        animal1.makeSound();

    }
}
