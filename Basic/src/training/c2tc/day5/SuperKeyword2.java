package training.c2tc.day5;
/* Super can be used to invoke parent class method */


	class Human
	{  
			void eat()
	    {
		System.out.println("eating...");
		}  
	}  
	class Person1 extends Human
	{  
		void eat()
		{
			System.out.println("eating bread...");
		}  
		void talk()
		{
			System.out.println("talking...");
		}  
		void work()
		{  
			super.eat();  //To call the super class method, we need to use super keyword.
			talk();  
		}  
	}  

public class SuperKeyword2 {

	public static void main(String[] args) {

		Person1 p = new Person1();
		p.work();
		
		// Human and Person both classes have eat() method if we call eat() method from Person1 class,
		//it will call the eat() method of person class by default because priority is given to local.
	}

}
