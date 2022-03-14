package day5;

/* Super can be used to refer immediate parent class instance variable. */

	class Bird               //Super class 
	{  
		String color="white";     

		
		 
	}  
	class Sparrow extends Bird     // sub class  //Inheritance
	{  
		String color="black";  
		public void c()
		{  
			System.out.println(color);           // prints color of Sparrow class  
			System.out.println(super.color);     // prints color of Bird class  
		}  
	}  
public class SuperKeyword1 {

	public static void main(String[] args) {
		

		Sparrow s=new Sparrow();  // create an  object of sub class
		s.c();
	}

}
