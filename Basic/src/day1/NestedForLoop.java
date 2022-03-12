/*
 Java Nested for Loop
 If we have a for loop inside the another loop, it is known as nested for loop. 
 The inner loop executes completely whenever outer loop executes.
 */
package day1;

public class NestedForLoop {

	public static void main(String[] args) {
		  
		for(int i=1;i<=3;i++)  //loop of i
		{  
		                      
		for(int j=1;j<=3;j++)  //loop of j  
		{  
		        System.out.println(i+" "+j);  
		}
		}
	}

}
