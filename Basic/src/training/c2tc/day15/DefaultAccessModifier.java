package training.c2tc.day15;

class AA
{
	String name="mohtasim";
	void Name()
	{
		System.out.println("Name is : "+name); // by using default access modifier we visible data in within class
	}
}

class BB extends AA
{
	void Name2()
	{
		System.out.println(" Other Name is "+name); // we access the data in sub class also
	}
	
}
public class DefaultAccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BB b = new BB();
		b.Name2();
	}

}
