package training.c2tc.day16;

abstract class Vehicle0  //abstract class
{  
    abstract void bike(); // we declare abstract method // we can't definig abstract class here 
      
    void car()            // Non abstract method
    {  
        System.out.println("Car is running");  
    }  
      
}  
class  Yamaha extends Vehicle0  // inheritance
{  
  
      
    void bike()  // Implement Abstract Method
    {  
        System.out.println("Bike is running");  
      
    }  
      
}  

public class AbstracClassWithAbstractAndNonAbstractMethod {

	public static void main(String[] args) {

		 Yamaha obj=new Yamaha();  
		    obj.bike();  
		    obj.car();  
	}

}
