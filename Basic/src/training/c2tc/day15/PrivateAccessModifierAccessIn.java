package training.c2tc.day15;

class Test
{
	
	private int age=24;    // private variables
	private String name;  // private variables
	
		public void setAge(int age)   // initialize age
	{
		this.age = age;
	}
		public int getAge() // access age
	{
		return age;
	}

		public void setName(String name)
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	
}
public class PrivateAccessModifierAccessIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // create an object of Test
	    Test test = new Test();

	    // set value of private variables
	    test.setAge(24);
	    test.setName("Mohtasim");

	    // get value of private variables
	    System.out.println("Age: " + test.getAge());
	    System.out.println("Name: " + test.getName());
		

	}

}
