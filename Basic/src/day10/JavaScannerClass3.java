package day10;

import java.util.Scanner;

public class JavaScannerClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter a string: ");  
		String str= sc.nextLine();              //reads string  nextLine() method in java is present in the Scanner class and is used to get the input from the user. 
		System.out.print("You have entered: "+str); 
		
		System.out.println("\n");
		
		System.out.print("Enter a string: ");  
		String str1= sc.next();               //reads string before the space  
		System.out.print("You have entered: "+str1);   
	}

}
