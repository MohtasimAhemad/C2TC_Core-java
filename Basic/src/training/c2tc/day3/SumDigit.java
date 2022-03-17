package training.c2tc.day3;

import java.util.Scanner;

public class SumDigit {

	public static int SumBTWDigits(int n)
	{
		int res=0;
		while(n>0)
		{
			res += n%10;
			n/=10;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int a = sc.nextInt();
		
		int sum=SumBTWDigits(a);
		System.out.println("sum is Equal of a Digit "+sum);
		
	}
	

}
