package training.c2tc.day9;

/* now we take 3 classes such as A,B and C.
   The C class inherits A and B classes
   now we take same name method in our A and B class 
   then we create child class object and calling methods of class A and class B.
   There will be ambiguity to call the method of A or B class.
 
 if you want multiple Inheritance then you can do only through interface.
 
 checkout my Multiple inheritance program using Interface (JavaMultipleInheritance)
  */

/*
	class A
	{  
		void msg()
		{
			System.out.println("Hello");
		}  
	}  
	class B
	{  
		void msg()	
		{	
			System.out.println("Welcome");
		}  
	}  
class C extends A,B	  // show the compile time error
{	
   
}
public class JavaWhyNotPossibleMultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   C obj=new C();  
		   obj.msg();         //Now which msg() method would be invoked?  
	}

}
*/