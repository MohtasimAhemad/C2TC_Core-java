package training.c2tc.day10;
/* how to read integer data from the user using the BufferedReader class. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Employee{
	   String name;
	   int id;
	   int age;
	   Employee(String name, int age, int id)
	   {
	      this.name = name;
	      this.age = age;
	      this.id = id;
	   }
	   public void displayData()
	   {
	      System.out.println("Name: "+this.name);
	      System.out.println("Age: "+this.age);
	      System.out.println("Id: "+this.id);
	   }
	}
public class BufferReaderClass1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		
	      System.out.println("Enter your name: ");
	      String name = reader.readLine();  // method is used to Reads a line of text.
	      
	      System.out.println("Enter your age: ");
	      int age = Integer.parseInt(reader.readLine()); // convert into integer value
	      
	      System.out.println("Enter your Id: ");
	      int id = Integer.parseInt(reader.readLine());
	      Employee std = new Employee(name, age, id);
	      std.displayData();
		

	}

}
