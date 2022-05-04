package training.c2tc.day57;

import java.util.Iterator;
import java.util.Vector;

public class JavaVector1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/* //Create a vector  
        Vector<String> vec = new Vector<String>();  
        //Adding elements using add() method of List  
        vec.add("Tiger");  
        vec.add("Lion");  
        vec.add("Dog");  
        vec.add("Elephant");  
        //Adding elements using addElement() method of Vector  
        vec.addElement("Rat");  
        vec.addElement("Cat");  
        vec.addElement("Deer");  
          
        System.out.println("Elements are: "+vec);  
        */
        
      //Create an empty Vector        
        Vector<Integer> in = new Vector<>();  
        //Add elements in the vector  
        in.add(100);  
        in.add(200);  
        in.add(300);  
        in.add(200);  
        in.add(400);  
        in.add(500);  
        in.add(600);  
        in.add(700);  
        //Display the vector elements  
        System.out.println("Values in vector: " +in);  
        //use remove() method to delete the first occurrence of an element  
        System.out.println("Remove first occourence of element 200: "+in.remove((Integer)200));  
        //Display the vector elements after remove() method  
        System.out.println("Values in vector: " +in);  
        //Remove the element at index 4  
        System.out.println("Remove element at index 4: " +in.remove(4));  
        System.out.println("New Value list in vector: " +in);  
        //Remove an element  
        in.removeElementAt(5);        
        //Checking vector and displays the element  
        System.out.println("Vector element after removal: " +in);  
        //Get the hashcode for this vector  
        System.out.println("Hash code of this vector = "+in.hashCode());  
        //Get the element at specified index  
        System.out.println("Element at index 1 is = "+in.get(1));  
        Iterator itr = in.iterator();
        while(itr.hasNext())
        {
        	System.out.print(" ");
        	System.out.print(itr.next());
        }

	}

}
