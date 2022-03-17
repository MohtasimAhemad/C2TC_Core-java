package training.c2tc.day3;

public class ReturnWithNoParameter {
		
	 public static int CompareNum()   
	    {   
	        int x = 3;  
	        int y = 8;  
	        System.out.println("x = " + x + "\ny = " + y);  
	        if(x>y)  
	            return x;  
	        else  
	            return y;  
	    }  
	public static void main(String[] args)
	{
		 CompareNum();
	}

}
