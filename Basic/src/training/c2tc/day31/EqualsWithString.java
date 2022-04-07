package training.c2tc.day31;

public class EqualsWithString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str1 = new String("HELLO");
	        String str2 = new String("hello");    
	        String str3 = null;
	        String str4 = "HELLO";
	 
	         
	        System.out.println("sampleStr1 and sampleStr2 are equal : "+(str1.equals(str2)));  
	        System.out.println("sampleStr1 and sampleStr4 are equal : "+(str1.equals(str4)));
	        System.out.println("sampleStr2 and sampleStr4 are equal : "+(str2.equals(str4)));
	        System.out.println("sampleStr4 and sampleStr3 are equal : "+(str4.equals(str3)));
	         
	}

}
