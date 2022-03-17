package training.c2tc.day6.hackerrank;

import java.util.Scanner;

public class JavaLoopI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for(int i = 1; i <= 10; i++){

            System.out.printf("%d x %d = %d%n", N, i, N*i);
        }
	}

}
