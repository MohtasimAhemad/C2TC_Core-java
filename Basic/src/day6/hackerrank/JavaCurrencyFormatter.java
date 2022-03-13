package day6.hackerrank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);
		String german = NumberFormat.getCurrencyInstance(Locale.GERMAN).format(payment);
		String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
		String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);


		System.out.println("India: " + india);
		System.out.println("German: " + german);
		System.out.println("US: " + us);
		System.out.println("China: " + china);

	}

}
