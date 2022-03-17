package training.c2tc.day9;


class X
{
	void methodX()
	{
		System.out.println(" class X method");
	}
}

class Y extends X
{
	void methodY()
	{
		System.out.println(" class Y method");
	}
}

class Z extends Y
{
	void methodZ()
	{
		System.out.println(" class Z method");
	}
}


public class JavaMultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Z obj = new Z();
		obj.methodX();  //calling super class method
		obj.methodY();  //calling sub class method
		obj.methodZ();  //calling child/local class method
		
		
	}

}
