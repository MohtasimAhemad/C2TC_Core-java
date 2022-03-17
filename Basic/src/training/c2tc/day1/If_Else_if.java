/*
Java if-else-if ladder Statement:-
The if-else-if ladder statement executes one condition from multiple statements.
*/
		 
package training.c2tc.day1;

public class If_Else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=98;  
	      
	    if(marks<50)
	    {  
	        System.out.println("fail");  
	    }  
	    else if(marks>=50 && marks<60)
	    {  
	        System.out.println("D grade");  
	    }  
	    else if(marks>=60 && marks<70)
	    {  
	        System.out.println("C grade");  
	    }  
	    else if(marks>=70 && marks<80)
	    {  
	        System.out.println("B grade");  
	    }  
	    else if(marks>=80 && marks<90)
	    {  
	        System.out.println("A grade");  
	    }
	    else if(marks>=90 && marks<100)
	    {  
	        System.out.println("A+ grade");  
	    }
	    else
	    {  
	        System.out.println("Invalid!");  
	    }  
	}

}
