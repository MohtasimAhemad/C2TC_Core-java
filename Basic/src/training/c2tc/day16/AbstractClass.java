package training.c2tc.day16;

abstract class M // An abstract keyword can only be used with class and method.
{
	abstract void m();
	
	void m1()
	{
		
	}
}

public class AbstractClass extends M {

	@Override
	void m() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// M obj = new M();   If a class is abstract, it cannot be instantiated.
	}

	

}
