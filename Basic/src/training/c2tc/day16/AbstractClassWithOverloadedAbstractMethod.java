package training.c2tc.day16;

abstract class AAA  
{  
      
        abstract void display();  
        abstract void display(String msg);  
      
}  
class Z extends AAA  
{  
  
    @Override  
    void display() 
    {  
          
        System.out.println("abstract method is invoked");  
    }  
  
    @Override  
    void display(String msg) 
    {  
          
        System.out.println(msg);  
    }  
      
}  

public class AbstractClassWithOverloadedAbstractMethod {

	public static void main(String[] args) {
		 Z obj=new Z();  
	     obj.display();  
	     obj.display("overloaded abstract method is invoked");

	}

}
