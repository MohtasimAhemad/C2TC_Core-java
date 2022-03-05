
/*
  Operator in Java is a symbol that is used to perform operations.
  There are many types of operators in Java which are given below:
	- Unary Operator       :- ++    --
	- Arithmetic Operator  :- + - * / %
	- Shift Operator	   :- <<   >>    >>>
	- Relational Operator  :- <  >  <=  >=  ==  !=
	- Bitwise Operator     :- &   !  ^
	- Logical Operator     :- &&   ||
	- Ternary Operator     :- ?:
	- Assignment Operator  :- = += -= *= /= %= &= ^= |= <<= >>= >>>=
*/
package BasicJava;

public class JavaOperator {

	public static void main(String[] args) {
		//Unary Operator       :- ++    --
		int x=10;  
		System.out.println(x++);	//10 (11)  
		System.out.println(++x);	//12  
		System.out.println(x--);	//12 (11)  
		System.out.println(--x);	//10 
		System.out.println();
		
		int a=10;  
		int b=-10;  
		boolean c=true;  
		boolean d=false;  
		System.out.println(~a);      //-11 (minus of total positive value which starts from 0)  
		System.out.println(~b);      //9 (positive of total minus, positive starts from 0)  
		System.out.println(!c);      //false (opposite of boolean value)  
		System.out.println(!d);      //true  
		System.out.println();  
		
		//Arithmetic Operator  :- + - * / %
		int a1=10;  
		int b1=5;  
		System.out.println(a1+b1);     //15  
		System.out.println(a1-b1);     //5  
		System.out.println(a1*b1);     //50  
		System.out.println(a1/b1);     //2  
		System.out.println(a1%b1);     //0  
		System.out.println(); 
		
		//Shift Operator	   :- <<   >>    >>>
		System.out.println(10<<2);     //10*2^2=10*4=40  
		System.out.println(10<<3);     //10*2^3=10*8=80
		System.out.println(10>>2);     //10/2^2=10/4=2  
		System.out.println(20>>2);     //20/2^2=20/4=5
		System.out.println();
		
		//Relational Operator  :- <  >  <=  >=  ==  !=
		int a11=10;  
		int b11=5;  
		int c11=20;  
		System.out.println(a11<b11&&a11<c11);  
		System.out.println(a11<b11&a11<c11);
		System.out.println(a11>b11||a11<c11);  
		System.out.println(a11>b11||a11<c11);
		System.out.println();
		
		//Ternary Operator     :- ?:
		int min=(a<b)?a:b;  
		System.out.println(min); 
		System.out.println();
		
		//Assignment Operator  :- = += -= *= /= %= &= ^= |= <<= >>= >>>=
		a+=3;//10+3  
		System.out.println(a);  
		a-=4;//13-4  
		System.out.println(a);  
		a*=2;//9*2  
		System.out.println(a);  
		a/=2;//18/2  
		System.out.println(a);  
		
	}                                  

}
