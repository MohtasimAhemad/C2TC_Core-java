package training.c2tc.day18;

public class ObjectUsingCloneMethod implements Cloneable
{

	protected Object clone() throws CloneNotSupportedException   
	{   
	//invokes the clone() method of the super class      
	return super.clone();   
	}   
	String s = " new object created";   
	
	public static void main(String[] args) {

		//creating an object of the class     
		ObjectUsingCloneMethod o1 = new ObjectUsingCloneMethod();   
		//try catch block to catch the exception thrown by the method  
		try  
		{  
		//creating a new object of the obj1 suing the clone() method  
			ObjectUsingCloneMethod o2 = (ObjectUsingCloneMethod) o1.clone();   
		System.out.println(o2.s);   
		}   
		catch (CloneNotSupportedException e)   
		{   
		e.printStackTrace();   
		}   
		}   
		
	}


