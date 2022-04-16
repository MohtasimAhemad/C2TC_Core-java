package training.c2tc.day39;
/*
 The main difference between for loop, while loop, and do while loop is

			** While Loop **
While loop checks for the condition first.
 so it may not even enter into the loop, if the condition is false.
 
 			** Do While Loop **
do while loop, execute the statements in the loop first before checks for the condition.
 At least one iteration takes places, even if the condition is false.


			** For Loop **
for loop is similar to while loop except that
initialization statement, usually the counter variable initialization
a statement that will be executed after each and every iteration in the loop, 
usually counter variable increment or decrement

 */
public class DifferenceBTWLoops {

	public static void main(String[] args) {
		/* ** For Loop ** */
		int n = 5;
	      for (int i = 0; i < n; i++)
	      {
	         System.out.format("For Loop : %d\n", i);
	      }
	      int j = 0;
	      
	      /* ** While Loop ** */
	      
	      while (j < n)
	      {
	         System.out.format("While Loop : %d\n", j);
	         j++;
	      }

	 
	      /* ** Do While Loop ** */
	      int k = 0;
	      do
	      {
	         System.out.format("Do While Loop : %d\n", k);
	         k++;
	      } while (k < n);

	}

}
