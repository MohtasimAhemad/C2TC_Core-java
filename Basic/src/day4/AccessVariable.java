package day4;
//creating a class named City
class City
{
	//declaring class variables
	public String name;
	public long population;
	//defining the method of the class
	public void display()
	{
	System.out.println("City name: " +name);
	System.out.println("Population: " +population);
	}
}	
public class AccessVariable {

	public static void main(String[] args) {
		
		//declaring the objects of the class City
	    City metro1,metro2;
	    //Instantiating the objects of the class using the new keyword
	    metro1 = new City();
	    metro2 = new City();
	    
	    metro1.name ="Mumbai";         //access variable  by instance of object
	    metro1.population = 1000000;
	    System.out.println("Details of metro city 1:");
	    metro1.display(); //access method display() method is being invoked for the object metro1
	    
	    metro2.name ="Pune";
	    metro2.population = 500000;
	    System.out.println("Details of metro city 2:");
	    metro2.display(); //access method display() method is being invoked for the object metro2

	}
}
