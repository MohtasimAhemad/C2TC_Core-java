package training.c2tc.day15;


class CC extends AA
{
	void Name3()
	{
		System.out.println("Name3 is " +name);  // we also access another sub class and the class also present within same package.
	}
}

public class DefaultAccessModifier1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CC c = new CC();
		c.Name3();
	}

}
