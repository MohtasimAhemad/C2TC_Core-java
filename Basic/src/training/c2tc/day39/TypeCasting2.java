package training.c2tc.day39;
/* Type Casting
The process of converting the value of one data type 
(int, float, double, etc.) into another data type is known as typecasting.


2.Narrowing Type Casting
In Narrowing Type Casting, we manually convert one data type into another using the parenthesis.
*/
public class TypeCasting2 {

	public static void main(String[] args) {

		// create double type variable
	    double num = 13.99;
	    System.out.println("The double value: " + num);

	    // convert into int type
	    int data = (int)num;
	    System.out.println("The integer value: " + data);
	}

}
