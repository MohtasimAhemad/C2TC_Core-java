package training.c2tc.day30;

//Class 1
//Abstract class
abstract class A {
 abstract void run(); // only declare here
}

//Class 2
class B extends A {
 void run()
 {
     System.out.println("called fun() method "); //define here
 }
}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // We can have references of Base type.
        A b = new B();
        b.run();
	}

}
