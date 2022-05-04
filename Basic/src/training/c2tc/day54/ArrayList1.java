package training.c2tc.day54;
import java.util.*;
public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("BMW"); // add() used to add elements 
		cars.add("THAR");
		cars.add("AUDI");
		cars.add("SWIFT");
		
		System.out.println(cars);
		
		cars.remove(1);  // remove() remove  elements via index
		
		System.out.println(cars);
		
		cars.get(2);
		System.out.println(cars);
		
		cars.set(1, "JAGUAR");
		System.out.println(cars);
		
		cars.indexOf("BMW");
//		System.out.println(cars);
		
		Iterator itr = cars.iterator();
		
		 while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		 
		/*
		for(String str:cars)
		{
			System.out.println(str);
		}
		*/
		
		
		
		
		
	}

}
