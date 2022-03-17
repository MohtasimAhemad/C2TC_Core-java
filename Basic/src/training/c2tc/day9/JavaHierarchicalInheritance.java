package training.c2tc.day9;
class Animal   // This is super class
{
	void eat()
	{
		System.out.println(" Eating... ");
	}
}

class Dog extends Animal    // This is Sub class of Animal class
{
	void bark()
	{
		System.out.println(" Barking... ");
	}
}

class Cat extends Animal    // This is also Sub class Of Animal class
{
	void meow()
	{
		System.out.println(" meowing... ");
	}
}

public class JavaHierarchicalInheritance {

	public static void main(String[] args) {
		Cat c = new Cat();
		
		c.eat();
		c.meow();  
		// c.bark();   // this line show the error because bark() method is property of dog class and here we perform hierarchy 
	}

}
