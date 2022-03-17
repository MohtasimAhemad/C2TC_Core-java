package training.c2tc.day6.hackerrank;

import java.util.Scanner;

public class JavaStdinAndStdoutII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		double d = sc.nextDouble();
		sc.nextLine();
		String s = sc.nextLine();
		sc.close();
		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
	}

}
