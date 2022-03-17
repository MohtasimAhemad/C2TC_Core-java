package training.c2tc.day9;

class Vehicle   // base super class
{ 

	  // Private Fields
	  private String make; 
	  private String color; 
	  private int year;      
	  private String model;   


	  // Parameterized Constructor
	  public Vehicle(String make, String color, int year, String model) {
	    this.make = make;       //refer current class instance variable
	    this.color = color;     //refer current class instance variable
	    this.year = year;       //refer current class instance variable
	    this.model = model;     //refer current class instance variable
	  }

	  // public method to print details
	  public void printDetails() {
	    System.out.println("Manufacturer: " + make);
	    System.out.println("Color: " + color);
	    System.out.println("Year: " + year);
	    System.out.println("Model: " + model);
	  }
	  
	}

//Derived / sub class Class Car
class Car extends Vehicle {

// Private field
private String bodyStyle;

// Parameterized Constructor
public Car(String make, String color, int year, String model, String bodyStyle)
{
 super(make, color, year, model);  //calling parent class constructor
 this.bodyStyle = bodyStyle;       
}

public void carDetails()   //details of car
{  
 printDetails();         //calling method from parent class
 System.out.println("Body Style: " + bodyStyle);
}

}
public class JavaInheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car nexoSedan = new Car("Hyundai", "Black", 2022, "Nexo", "Sedan"); //creation of car Object
	    nexoSedan.carDetails(); //calling method to print details
	}

}
