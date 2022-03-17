package training.c2tc.day10;

import java.util.Scanner;

public class JavaScannerClass4 {

	public static void main(String[] args) {
		

		 System.out.print("Are you above 18 ? ");  
         Scanner sc = new Scanner(System.in);
         
         boolean bn = sc.nextBoolean();  // reads a boolean value from the user
         if (bn == true)
         {  
             System.out.println("You are over 18");  
         } 
         else if (bn == false)
         {  
             System.out.println("You are under 18");  
         }  
         // close the canner
         sc.close();      
	}

}
