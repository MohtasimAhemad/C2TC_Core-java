package training.c2tc.day30;

abstract class A1 {
	 
    // Constructor of class 1
    A1()
    {
        // Print statement
        System.out.println("A1 Constructor Called");
    }
 
    // Abstract method inside class1
    abstract void run();
}
 
// Class 2
class B1 extends A1 {
 
    // Constructor of class2
    B1()
    {
        System.out.println("B1 Constructor Called");
    }
 
    // Method of class2
    void run()
    {
        System.out.println("B1 run() called");
    }

	
}
 
public class AbstractWithConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B1 d = new B1();
	}

}
