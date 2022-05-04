package training.c2tc.day54;
import java.util.*;
import java.util.Map.Entry;

public class TreeMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String , Integer> number = new TreeMap<>();
		number.put("one", 1);
		number.put("two", 2);
		number.put("three", 3);
		System.out.println("numbers "+number);
		System.out.println("numbers "+number.keySet());
		System.out.println("numbers "+number.values());
		System.out.println("numbers "+number.entrySet());
//		
//		int val1=number.remove("one");
//		System.out.println("numbers "+val1);
		System.out.println("numbers "+number.firstEntry());
		System.out.println("numbers "+number.lastEntry());
		
		      //this  for keySet
				for(String key:number.keySet())
				{
					System.out.println(key);
				}
				
				//this for values
				for(Integer value:number.values())
				{
					System.out.println(value);
				}
				//this for entry set
				for( Entry<String, Integer> value:number.entrySet())
				{
					System.out.println(value);
				}
		
	}

}

/* Difference btw comparable and comparator interface 


Comparable :-

1) Comparable provides a single sorting sequence. 
In other words, we can sort the collection on 
the basis of a single element such as id, name, and price.

2) Comparable affects the original class, i.e., 
the actual class is modified.

3) Comparable provides compareTo() method to sort elements.

4) Comparable is present in java.lang package.

5) We can sort the list elements of Comparable type by Collections.sort(List) method.

Comparator :-

1)The Comparator provides multiple sorting sequences. 
In other words, we can sort the collection on 
the basis of multiple elements such as id, name, and price etc.

2) Comparator doesn't affect the original class, i.e., 
the actual class is not modified.

3)Comparator provides compare() method to sort elements.

4) A Comparator is present in the java.util package

5)We can sort the list elements of Comparator type by Collections.sort(List, Comparator) method.
 
 */