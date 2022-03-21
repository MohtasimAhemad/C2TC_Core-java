package training.c2tc.day15.pack;
import training.c2tc.day15.ProtectedAccessModifier; // import package

public class ProtectedAccessModifier2 extends ProtectedAccessModifier
{
	public void Info()
	{
		System.out.println(" Name is "+ name); // we access data outside the packege by using protected but we only access within sub class
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProtectedAccessModifier2 obj = new ProtectedAccessModifier2();
		obj.Info();   // within same class in same package
		 
		obj.printInfo(); // this method declare in another class of other package
	}
	

}
