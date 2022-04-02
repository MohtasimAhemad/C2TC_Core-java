package training.c2tc.day27;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result1 {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    //Logic Start
    	if (s.charAt(8) == 'A') {
            if (Integer.valueOf(s.substring(0,2)) == 12) {
                return "00" + s.substring(2, 8);
            }
        } else if (s.charAt(8) == 'P') {
            if (Integer.valueOf(s.substring(0,2)) != 12) {
                int hours = Integer.valueOf(s.substring(0,2)) + 12;
                return "" + hours + s.substring(2, 8);
            }
        }
        return s.substring(0, 8);

    } //Logic End

}
public class HackerrankTimeConversion {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
	}

}
