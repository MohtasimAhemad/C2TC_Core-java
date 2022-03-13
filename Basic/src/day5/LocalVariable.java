package day5;
class Person   // class one  
{
	int age=27; // outside  Local variable;
	void age()  // method
	{
		System.out.println(age);  //method body
	}
	
}
class LocalVariableDemo   //class second
{ 
	public void add()    // method
	{
		int num = 0;     // local method inside method
		num = num + 7;
		System.out.println("The number is : " + num);
	}
}

public class LocalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person a=new Person();   // instance of object a
		a.age();                 // method access with object a
		
		
		LocalVariableDemo obj = new LocalVariableDemo(); // instance of object obj
		obj.add();                                   // method access with object obj
	} 

}
