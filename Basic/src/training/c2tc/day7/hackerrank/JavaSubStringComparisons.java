package training.c2tc.day7.hackerrank;

import java.util.Scanner;

public class JavaSubStringComparisons {

	public static void main(String[] args) {
	System.out.println(" ");	
		 Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        int k    = scan.nextInt();
	        scan.close();
	        
	        /* Create smallest and largest strings and initialize them */
	        String smallest = s.substring(0, k);
	        String largest  = s.substring(0, k);
	        
	        for (int i = 0; i <= s.length() - k; i++) 
	        {
	            String curr = s.substring(i, i + k);
	            if (smallest.compareTo(curr) > 0)
	            {
	                smallest = curr;
	            }
	            if (largest.compareTo(curr) < 0) {
	                largest = curr;
	            }
	        }
	        
	        
	        System.out.println(smallest);
	        System.out.println(largest);

	}

}
