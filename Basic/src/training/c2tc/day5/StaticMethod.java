package training.c2tc.day5;


class A {
	 
    // Static method
    public static int sum(int a, int b)
    {
        // Simply returning the sum
        return a + b;
    }
}
public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int n = 3, m = 6;
 
        // Calling the static method of above class and storing sum in integer variable
        int s = A.sum(n, m);
 
        
        System.out.print("sum is = " + s);
	}

}
