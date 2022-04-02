package training.c2tc.day27.hackerrank;
/*
 * MIN - MAX SUM
 * find the minimum and maximum values that can be calculated by summing exactly four of the five integers
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        
    /* Logic Start	*/
    
     int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    long tSum = 0;
    for (int index = 0; index < arr.size(); index++ ) {
         
        if ( min > arr.get(index) )
           min = arr.get(index); 
        
        if ( max < arr.get(index) ) 
            max = arr.get(index);
        
        tSum += arr.get(index);
    }
    // remove max and minum in the last from total sum
    System.out.format("%d %d", tSum - max, tSum - min);
}
    /* Logic End */

	public static String timeConversion(String s) {
		// TODO Auto-generated method stub
		return null;
	}

}
public class HackerrankMinMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = null;
		try {
			arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        try {
			bufferedReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
