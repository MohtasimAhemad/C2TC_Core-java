package training.c2tc.day53;
class A
{
	void voting(int age)
	{
		if(age<18)
		{
			if(age<=0)
			{
				throw new ArithmeticException("Negetive Value not Allowed");
			}
			throw new ArithmeticException("less than 18 not allowed");
			
		}
		else
		{
			System.out.println("you are eligible for voting");
		}
	}
}

public class DiffThrowAndThrowa {

	public static void main(String[] args) {

		A a= new A();
		a.voting(-8);
	}

}
/*		
THROW
1.Java throw keyword is used throw an exception explicitly in the code.
2.we can only handle unchecked exception  Using throw keyword.
3.The throw keyword is followed by an instance of Exception to be thrown.
4.throw is used within the method.	
5.We are allowed to throw only one exception at a time i.e. we cannot throw multiple exceptions.

THROWS
1.Java throws keyword is used in the method signature to declare an exception which might be thrown by the function while the execution of the code.
2.Using throws keyword, we can declare both checked and unchecked exceptions
3.The throws keyword is followed by class names of Exceptions to be thrown.
4.Throws is used with the method signature.
5.We can declare multiple exceptions using throws keyword that can be thrown by the method.
*/