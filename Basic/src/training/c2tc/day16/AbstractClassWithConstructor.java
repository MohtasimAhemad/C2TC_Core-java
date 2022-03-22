package training.c2tc.day16;

abstract class Vehicles  
{  
    String msg;  
      
    Vehicles(String msg)  
    {  
    this.msg=msg;  
    }  
      
    void display()  
    {  
        System.out.println(msg);  
    }  
      
}  
class Bjaj extends Vehicles 
{  
  
    Bjaj(String msg) 
    {  
        super(msg); // use super keyword to class super method or constructor 
          
    }  
  
}  

public class AbstractClassWithConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Bjaj obj=new Bjaj("Constructor is invoked");  
		 obj.display();  

	}

}
