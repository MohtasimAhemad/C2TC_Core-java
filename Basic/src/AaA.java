import java.util.Scanner;

public class AaA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		/*
		    System.out.println("hello mohtasim  ahemad");
			int a=10;
			int b= 29;
			int c = a+b;
			System.out.println("sum of a+b is :-"+c);
			System.out.println("enter first number ");
			int e = a1.nextInt();
			System.out.println("enter second number");
			int d = a1.nextInt();
			int f=e*d;
			System.out.println("multi  "+f);
		for(int i=1; i<=n; i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
			else
			{
				System.out.println("");
			}
		}
		 */
		Scanner in =new Scanner(System.in);
		System.out.println("enter the n ");
		int n = in.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]= in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(" array elements "+arr[i]);
		}
		}

}
