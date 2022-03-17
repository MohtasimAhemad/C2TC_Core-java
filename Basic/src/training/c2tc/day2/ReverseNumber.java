package training.c2tc.day2;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 123456789, reverse = 0;  
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);
		
	}

}
