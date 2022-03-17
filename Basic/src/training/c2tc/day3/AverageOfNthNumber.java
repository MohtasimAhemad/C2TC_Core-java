package training.c2tc.day3;

import java.util.Scanner;

public class AverageOfNthNumber {

	public static int CalAvg(int arr[],int n)
	{
		int res=0;
		for(int i=0;i<n;i++)
		{
			res=res+arr[i];
		}
		return res ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many Numbers to calculate  Avg :");
		int n = sc.nextInt();
		int arr[]= new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();	
			
		}
		
		
		int S=CalAvg(arr,n)/n;
		System.out.println(" The Average is "+S);
		
		
	    }

}
