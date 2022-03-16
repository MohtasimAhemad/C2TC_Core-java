package day10;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.BigInteger;

public class JavaScannerClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // creates an object of Scanner
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter a big integer: ");

	    // reads the big integer
	    BigInteger value1 = input.nextBigInteger();
	    System.out.println("Using nextBigInteger(): " + value1);

	    System.out.print("Enter a big decimal: ");

	    // reads the big decimal
	    BigDecimal value2 = input.nextBigDecimal();
	    System.out.println("Using nextBigDecimal(): " + value2);

	    input.close();  // close scanner
	}

}
