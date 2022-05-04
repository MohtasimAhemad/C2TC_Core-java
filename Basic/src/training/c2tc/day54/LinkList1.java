package training.c2tc.day54;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkList1 {

	public static void main(String[] args) {

		LinkedList<String> l=new LinkedList<String>();  
		  l.add("Z");  
		  l.add("B");  
		  l.add("X");  
		  l.add("D"); 
		  System.out.println(l);
		  
		  System.out.println(l.remove(1));
		  System.out.println(l);
		  
		  Collections.sort(l);
		  System.out.println(l);
		  
		  l.addFirst("A");
		  System.out.println(l);
		  
		  l.addLast("ZZ");
		  System.out.println(l);
		  
		  
		  
		  Iterator<String> itr=l.iterator();  
		  
		  while(itr.hasNext())
		  {  
		   System.out.println(itr.next());  
		  }  

	}

}
