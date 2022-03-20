package training.c2tc.day13;

/* Find the minimum and maximum element in an array */
public class JavaMaxNMinNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 5, 7, 2, 4, 9, 6 };
		 
        // find the minimum and maximum element.
        findMaxAndMin(nums);

	}

	private static void findMaxAndMin(int[] nums)
	{
		// TODO Auto-generated method stub
		// initialize minimum and maximum element with the first element
	    int max = nums[0];
	    int min = nums[0];

	    // do for each array element
	    for (int i = 1; i < nums.length; i++)
	    {
	        // if the current element is greater than the maximum 
	        if (nums[i] > max) 
	        {
	            max = nums[i];
	        }

	        // if the current element is smaller than the minimum 
	        else if (nums[i] < min) 
	        {
	            min = nums[i];
	        }
	    }

	    System.out.println("The minimum array element is " + min);
	    System.out.println("The maximum array element is " + max);
		
	}
}

	