package training.c2tc.day15;

public class PublicAccessModifier {

	public int b=100;
	public void Print()
	{
		System.out.println(" B is Equal : "+b);   // access within class
	}
}

class Ba extends PublicAccessModifier
{
	void print1()
	{
		System.out.println(" in sub class B is equal : "+b);  // access outside class
	} 
}