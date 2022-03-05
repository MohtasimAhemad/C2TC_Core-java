/*
Java Break Statement :-
When a break statement is encountered inside a loop, 
the loop is immediately terminated and the program control resumes at the next statement,
The Java break statement is used to break  loop or switch
*/
package BasicJava;

public class Break {

	public static void main(String[] args) {
		 for(int i=1;i<=10;i++)
		 {  
		        if(i==5)
		        {        
		        break;    //breaking the loop  
		        }  
		        System.out.println(i);  
		 }  
	}

}
