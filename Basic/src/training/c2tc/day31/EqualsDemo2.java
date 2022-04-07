package training.c2tc.day31;

public class EqualsDemo2 {

	public static void main(String[] args)
	{
		String s1 = new String("HELLO");
        String s2 = new String("HELLO");        
         
        System.out.println("s1 and s2 are equal : "+(s1==s2));      
        System.out.println("s1 and s2 are equal : "+(s1.equals(s2)));  // use equals method
 
        s1 = s2;
        System.out.println("s1 and s2 are equal : "+(s1==s2)); 

	}

}

/*
OUTPUT:-
s1 and s2 are equal : false  
s1 and s2 are equal : true
s1 and s2 are equal : true

s1 and s2 are equal : false ---->
This result is returning ‘false’ because the ‘==’ operator is 
comparing references of objects s1 and s2 i.e. comparing addresses of objects.


s1 and s2 are equal : true ---->
This is because the equals () method compares the content of objects s1 and s2.
 Both the String objects have the same content i.e. “HELLO”, which is why comparison returns a true value.
 */
