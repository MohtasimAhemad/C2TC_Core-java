package day4;  // package name with lower case

class Person       //Class first Letter Uppercase
{
	String name="John";  //variable lowercase
	int age=25;          //variable lowercase
	static int days_in_week=7;   //constant variable
	
	void eat()           					//method lowercase
	{
		System.out.println("Eat");
	}
	
	void playPerson()						//method lowercase
	{
		System.out.println("Method Body");
	}
}

public class NamingConventionExample   //Class First letter of  first word Uppercase then First latter of second word.
{  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person();  // create object p of Person class 
				
		p.eat();                  
		p.playPerson();
		
		System.out.println(Person.days_in_week); // constant  access by class
	}

}
