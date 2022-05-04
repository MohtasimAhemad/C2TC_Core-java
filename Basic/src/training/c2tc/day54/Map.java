package training.c2tc.day54;

import java.util.HashMap;
import java.util.Map.Entry;

/* MAP is the data structure which store the element in memory key value format. 
  In java collection map is a interface which is implemented by follwing classes HashMap,LinkHashMap,TreeMap.
  
*/
public class Map {

	public static void main(String[] args) {

		HashMap<Integer , String> lang = new HashMap<>();
		lang.put(5, "five");
		lang.put(4, "four");
		lang.put(3, "three");
		System.out.println(lang);
		
		String val = lang.get(3);
		System.out.println("key related value : "+val);
		System.out.println("keys set value : "+lang.keySet());
		System.out.println("key related value : "+lang.values());
		System.out.println("key related value : "+lang.entrySet());
		
		lang.replace(3, "six");
		System.out.println(lang);
		
		String val1=lang.remove(3);
		System.out.println( "remove ele "+val1);
		System.out.println(lang);
		
		
		//this  for key
		for(Integer key:lang.keySet())
		{
			System.out.println(key);
		}
		
		//this for values
		for(String value:lang.values())
		{
			System.out.println(value);
		}
		//this for entry set
		for( Entry<Integer, String> value:lang.entrySet())
		{
			System.out.println(value);
		}
	}

}
