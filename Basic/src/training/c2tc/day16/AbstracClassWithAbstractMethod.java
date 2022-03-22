package training.c2tc.day16;

abstract class Vehicle  // abstract class
{  
    abstract void bike();   // we declare abstract method // we can't definig abstract class here
      
}  
class Hero extends Vehicle  // inheritance
{  
  
    
    void bike()  // abstract unimplemented method defining  here
    {  
        System.out.println("Bike is running");  
      
    }  
      
}  

public class AbstracClassWithAbstractMethod {

	public static void main(String[] args) {
		
		   Hero obj=new Hero();  
		   obj.bike();  

	}

}
