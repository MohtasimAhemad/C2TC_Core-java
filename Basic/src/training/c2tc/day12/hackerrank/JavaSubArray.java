package training.c2tc.day12.hackerrank;

import java.util.Scanner;

public class JavaSubArray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] arr= new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    int count=0;
	    for(int j=0;j<n;j++)
	    {
	        int sum=0;
	        for(int k=j;k<n;k++)
	        {
	            sum=arr[k]+sum;
	            if(sum<0)
	            {
	                count++;
	            }
	        }
	    }
	    System.out.println(count);

	}

}
