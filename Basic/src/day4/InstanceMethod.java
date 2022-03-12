package day4;

class InstanceMethodDemo 
	{
   static int a = 13;
	int b = 7800;           //instance variable
	void callme()           //instance method
	{
		System.out.println("The value of b = " + b);
	}
	}
public class InstanceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstanceMethodDemo id = new InstanceMethodDemo(); // create an object
		  id.callme();
		  //Instance method is being called using the object of the class
		  System.out.println("The value of a = " + InstanceMethodDemo.a);
		  //Static variable is accessed with the class name
		
	}

}
