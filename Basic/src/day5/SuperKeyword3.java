package day5;
/* Super is used to invoke parent class constructor. */

	class Animal //super class
	{  
		Animal()  // Constructor
		{
			System.out.println("animal is created");
		}  
	}  
	class Dog extends Animal    //sub class 
	{  
		Dog()
		{  
			super();     // super method
			System.out.println("dog is created");  
		}  
	}  


public class SuperKeyword3 {

	public static void main(String[] args) {

		Dog d=new Dog();  
	}

}
