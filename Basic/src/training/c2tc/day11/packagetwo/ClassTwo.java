package training.c2tc.day11.packagetwo;
import training.c2tc.day11.packageone.ClassOne;  // i am import this user define package to access the class is present in this package
public class ClassTwo {

	 public void methodClassTwo(){
	        System.out.println(" ClassTwo  ");
	    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassTwo a = new ClassTwo();
        ClassOne b = new ClassOne();
        a.methodClassTwo();
        b.methodClassOne();
	}

}
