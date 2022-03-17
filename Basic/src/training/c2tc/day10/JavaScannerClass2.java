package training.c2tc.day10;

import java.util.Scanner;

public class JavaScannerClass2 {

	public static void main(String[] args) {
		String str = "Sum of 12 and 8 is equal 20 ";

        // Instantiate Scanner with the given str
        Scanner sc = new Scanner(str);

        // Loop for scanning the double
        // token input
        while (sc.hasNext()) {

            // if double then display it
            if (sc.hasNextDouble()) {
                System.out.println("Double Exists: " + sc.nextDouble());
            }
            sc.next();
        }

        // close the scanner
        sc.close();

	}

}
