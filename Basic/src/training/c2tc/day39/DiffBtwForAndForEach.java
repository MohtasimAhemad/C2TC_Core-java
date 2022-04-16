package training.c2tc.day39;
/*
 					* ** For Loop **
  For loops are appropriate loops when you know exactly 
  how many times iteration you wants in statements within the loop.
  for loop is a general purpose control structure 
  
  					** For each Loop **
  For-each loop is used to iterate through the items in object collections, 
  List generic collections or array list collections.
  foreach loop is an enhanced for loop that is applicable only to arrays and collections.
 */

public class DiffBtwForAndForEach {

	public static void main(String[] args) {

		   
		   int arr[]={12,13,14,44};  
		   //traversing the array with for-each loop  
		   for(int i:arr)
		   {  
		     System.out.println(i);  
		   }  
	}

}
