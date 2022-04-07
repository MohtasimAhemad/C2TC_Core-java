package training.c2tc.day30;

abstract class Animal 
{
	  abstract void Sound();

	  public void eat()
	  {
	    System.out.println("I can eat.");
	  }
	}

	class Dog extends Animal {

	  // provide implementation of abstract method
	  public void Sound() {
	    System.out.println("Bark Bark Bark Bark Bark");
	  }
	}

	public class AbsractMain {
	  public static void main(String[] args) {

	    // create an object of Dog class
	    Dog d = new Dog();

	    d.Sound();
	    d.eat();
	  }
	}
