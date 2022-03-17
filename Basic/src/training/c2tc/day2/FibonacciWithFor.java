package training.c2tc.day2;

public class FibonacciWithFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3=0,i,n=10;
		System.out.print(n1+" "+n2);
		for(i=2;i<n;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		
		
	}

}
