package day9;

interface HumanEat    // Interface
	{
	   void eat();       // declare Method
	}
	interface HumanTravel    // Interface
	{
	   void travel();    // declare Method
	}
	
	
	class Human implements HumanEat, HumanTravel   // implements
	{
	   public void eat()    //define The method
	   {
	      System.out.println("Human  is eating");
	   }
	   public void travel() // define the method
	   {
	      System.out.println("Human is travelling");
	   }
	}

public class JavaMultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human a = new Human(); 
	      a.eat();    // calling method
	      a.travel();  // calling method

	}

}
