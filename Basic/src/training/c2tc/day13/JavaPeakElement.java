package training.c2tc.day13;

/* Peak an element in array. */

class Main
{
		
		public static int findPeakElement(int[] nums, int left, int right)   // Recursive function to find the peak element in an array
		{
        
        int mid = (left + right) / 2;  // find the middle element.
 
        
        if ((mid == 0 || nums[mid - 1] <= nums[mid]) &&
           (mid == nums.length - 1 || nums[mid + 1] <= nums[mid])) 
        {
            return mid;
        }
 
        
        if (mid - 1 >= 0 && nums[mid - 1] > nums[mid])          

        {
            return findPeakElement(nums, left, mid - 1);
        }
 
        // If the left neighbor of mid is greater than the middle element,find the peak element in the left sub array.
        return findPeakElement(nums, mid + 1, right);
}

		 public static int findPeakElement(int[] nums)
		    {
		        
		        if (nums == null || nums.length == 0)
		        {
		            System.exit(-1);
		        }
		 
		        int index = findPeakElement(nums, 0, nums.length - 1);
		        return nums[index];
		    }
public class JavaPeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 8, 9, 10, 2, 5, 6 };
        System.out.println("The peak element is " + findPeakElement(nums));
	}

}
}
