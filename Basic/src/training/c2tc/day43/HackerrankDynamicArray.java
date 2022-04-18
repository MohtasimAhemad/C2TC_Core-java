package training.c2tc.day43;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Result {

    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
    // Write your code here
     List<List<Integer>>  computation = new ArrayList<>();
    List<Integer>  result = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      computation.add(new ArrayList<>());
    }

    int lastAnswer = 0;
    for (int i = 0; i < queries.size(); i++) {
      List<Integer> q = queries.get(i);

      if (q.get(0) == 1) {
        computation.get((q.get(1) ^ lastAnswer) % n).add(q.get(2));
      } else {
        List<Integer> seq = computation.get((q.get(1) ^ lastAnswer) % n);
        lastAnswer = seq.get(q.get(2) % seq.size());
        result.add(lastAnswer);
      }
    }

    return result;

    }

}
public class HackerrankDynamicArray {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList()));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = Result.dynamicArray(n, queries);

        bufferedWriter.write(
            result.stream().map(Object::toString).collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
		// TODO Auto-generated method stub

	}

	private static Collector joining(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
