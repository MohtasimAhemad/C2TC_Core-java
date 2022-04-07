package training.c2tc.day31;

public class EqualsWithBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boolean b1 = true;
        Boolean b2 = true;    
        Boolean b3 = false;
         
        System.out.println("b1 and b2 are equal : "+(b1.equals(b2)));  
        System.out.println("b1 and b3 are equal : "+(b1.equals(b3)));
        System.out.println("b2 and b3 are equal : "+(b2.equals(b3)));
	}

}
