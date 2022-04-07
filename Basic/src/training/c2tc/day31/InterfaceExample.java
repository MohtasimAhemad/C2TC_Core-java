package training.c2tc.day31;

interface Candidate  // First candidate interface
{	
	void learn(String str); //declare learn method
	void work();             //declare work method
}
interface Recruitment // Second Recruitment Interface
{
	boolean screening(int score);    //declare
	boolean interview(boolean selected);//declare
}
class Programmer implements Candidate, Recruitment 
{
	public void learn(String str)   // implements the method in Programmer class
	{
		System.out.println("Learn using " + str);
	}
	public boolean screening(int score)  //implements
	{
		System.out.println("Attend screening test"); // implements
		int thresold = 20;
		if(score > thresold)
			return true;
		return false;
	}
	public boolean interview(boolean selected)  //implements
	{
		System.out.println("Attend interview");
		if(selected)
			return true;
		return false;
	} 
	public void work()  //implements
	{
		System.out.println("Develop project");
	}
}
public class InterfaceExample 
{

	public static void main(String[] args) 
	{
		Programmer trainee = new Programmer();
		trainee.learn("Java Coding videos");
		trainee.screening(30);
		trainee.interview(true);
		trainee.work();
	}

}
