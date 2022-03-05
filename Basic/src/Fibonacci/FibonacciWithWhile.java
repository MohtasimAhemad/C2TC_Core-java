package Fibonacci;

public class FibonacciWithWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3=0,i=0,n=10;
		System.out.print(n1+" "+n2);
		while(i<n)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			i++;
		}
	}

}
