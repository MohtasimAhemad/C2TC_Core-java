package day7.hackerrank;

import java.util.Scanner;

public class JavaSubString {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
	        String S = in.next();
	        int start = in.nextInt();
	        int end = in.nextInt();
	        System.out.println(S.substring(start,end));

	}

}
