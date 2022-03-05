/*
Java Continue Statement
The continue statement is used in loop  when you need to jump to the next iteration of the loop immediately.
It can be used with for loop or while loop
 */
package BasicJava;
public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{  
	        if(i==5)
	        {  
	            
	        continue; // Using continue statement    it will skip the rest statement  
	        }  
	        System.out.println(i);  
	    }  
	}

}
