package day10;

import java.util.Scanner;

/* Write a program to take two integer inputs from user and print sum of them. */

public class JavaScannerClass1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();  //nextInt used to scan the next token of the input as an int.
		int b = s.nextInt();  //nextInt used to scan the next token of the input as an int.
		System.out.println("sum of a and b is "+(a+b));

	}

}
