package training.c2tc.day5;

/* A non-static method can access a static variable  in Java */


class B {
	 
    // Static method
    public int sum(int a, int b)
    {
        // Simply returning the sum
        return a + b;
    }
}

public class NonStaticMethod {

	public static void main(String[] args) {
		
		
        int n = 12, m = 62;
    
        B g = new B();   // Creating object of above class
 
        int s = g.sum(n, m);   // Calling above method to compute sum // Calling the non-static method 
 
        System.out.print("sum is = " + s);
		

		
	}

}
