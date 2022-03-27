package training.c2tc.day21.hackerrank;
// Mathematics Find the Point  //

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

public class HackerrankFindThePoint {

	/*
     * Complete the 'findPoint' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER px
     *  2. INTEGER py
     *  3. INTEGER qx
     *  4. INTEGER qy
     */

    public static List<Integer> findPoint(int px, int py, int qx, int qy) {
    // Write your code here
    List<Integer> list = new ArrayList<Integer>();
    list.add((2*qx)-px);  //logic
    list.add((2*qy)-py);   //logic
    return list;            //logic
    }

    
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        for (int nItr = 0; nItr < n; nItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int px = Integer.parseInt(firstMultipleInput[0]);

            int py = Integer.parseInt(firstMultipleInput[1]);

            int qx = Integer.parseInt(firstMultipleInput[2]);

            int qy = Integer.parseInt(firstMultipleInput[3]);

            List<Integer> result = HackerrankFindThePoint.findPoint(px, py, qx, qy);

            for (int i = 0; i < result.size(); i++) {
                bufferedWriter.write(String.valueOf(result.get(i)));

                if (i != result.size() - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();

	}

}
