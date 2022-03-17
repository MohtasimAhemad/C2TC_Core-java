package training.c2tc.day10;

/* Perform Addtion operation */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderClass2 {

	public static void main(String[] args) throws NumberFormatException, IOException  {
		// TODO Auto-generated method stub

		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		
	      System.out.println("Enter value of a :");
	      int a = Integer.parseInt(reader.readLine());  // convert into integer value
	      
	      System.out.println("Enter value of b : ");
	      int b = Integer.parseInt(reader.readLine()); // convert into integer value
	      
	      System.out.println("Enter your Id: "+(a+b));
	}

}
