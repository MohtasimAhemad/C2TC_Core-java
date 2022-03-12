package day4;

class StaticMethodDemo 
	{
	static int a = 121;
	static int b = 2222;
	static void callme() 
	{
		System.out.println("The value of a = " + a);
	}
	}

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  StaticMethodDemo.callme();
		  //Static method is being called using the name of the class
		  System.out.println("The value of b = " + StaticMethodDemo.b);
		  //Static variable is accessed with the class name
		
	}

}
