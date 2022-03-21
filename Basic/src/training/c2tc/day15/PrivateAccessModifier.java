package training.c2tc.day15;

class A
{
	private int age=20;   //if we  declare data as a private so that time we only access/visible within the class.
	private void age()
	{
		System.out.println(" Age is : "+age);
	}
	
}

public class PrivateAccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A o=new A();
		// o.age(); // its show error because we can not access private data outside the class.
		// A.age;  // with class name we can not access the data/variable  .
	}

}
