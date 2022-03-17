package training.c2tc.day4;

public class NamingConvention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		/* JAVA NAMING CONVENTION */  
		
		/* ----java Packages naming convention---- */
		/*
		    It should be a lowercase letter such as java, lang.
			If the name contains multiple words, it should be separated by dots (.) such as java.util, java.lang.
			
		
			package c2tc.day4;  	//package
			class Student
			{
			//code snippet
			}
			
		 */
		/* ----java classes naming convention---- */
		/*
		 
			In Java, class names generally should be nouns,
 			in title-case with the first letter of each separate word capitalized(Upper Case).
  
  			public class StudentInfo  //class
     		{
			//code snippet
			}
			
			
			/* ----java method Variable naming convention---- */
		/*
		 	It should start with lowercase letter.
			It should be a verb.
			If the name contains multiple words, 
			start it with a lowercase letter followed by an uppercase letter.
			
			class StudentInfo
			{
			
			void draw();          // method
			void info();          // method
			void myWork();        // method
			void useBook();       // method
			{
			//code snippet
			}
			}
			
		 */
		
		/* ----java Variable naming convention---- */
		/*
		 	It should start with a lowercase letter. 
			It should not start with the special characters like & (ampersand), $ (dollar), _ (underscore).
			class StudentInfo
			{
			     int id;
				 public Long id;

                 public EmployeeDao employeeDao;

                 private Properties properties;

                 for (int i = 0; i < list.size(); i++) {}

				
			}
			
		 */
		
		/* ----java Constant naming convention---- */
		/*
		    Java constants should be all UPPERCASE where words are separated by underscore character (“_”).
		    Make sure to use the final modifier with constant variables.
		  	
		  	 static final String SECURITY_TOKEN = "c2tc";

			 static final int INITIAL_SIZE = 16;

			 static final int MAX_SIZE = 18;
			 
		 */

	}

}
