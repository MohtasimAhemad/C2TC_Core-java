package day5;

/* A non-static method can access a static variable  in Java */


class StaticTest
{
	public static int i = 10;  //static variable
	public void nonStatic()    // non static method
	{ 
		System.out.println("can access static variable inside non-static method : " + i); 
	}
}

public class NonStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Inside main method");
	}

}
