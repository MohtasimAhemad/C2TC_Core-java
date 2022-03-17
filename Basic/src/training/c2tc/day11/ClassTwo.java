package training.c2tc.day11;
import training.c2tc.day11.packageone.ClassOne;  // i am import this user define package to access the class is present in this package
public class ClassTwo {

	 public void methodClassTwo(){
	        System.out.println("Hello there i am ClassTwo");
	    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassTwo a = new ClassTwo();
        ClassOne b = new ClassOne();
        a.methodClassTwo();
        b.methodClassOne();
	}

}
