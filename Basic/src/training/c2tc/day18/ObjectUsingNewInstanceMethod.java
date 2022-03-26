package training.c2tc.day18;

public class ObjectUsingNewInstanceMethod {
	void show()    
	{    
	System.out.println("Create new Object.");    
	}    

	public static void main(String[] args) {

		try  
		{  
		//creating an instance of Class class  
		Class cls = Class.forName("ObjectUsingNewInstanceMethod");   
		ObjectUsingNewInstanceMethod obj = (ObjectUsingNewInstanceMethod) cls.newInstance();   		//creates an instance of the class using the newInstance() method  
  
		obj.show();   		//invoking the show() method  

		}   
		catch (ClassNotFoundException e)   
		{   
		e.printStackTrace();   
		}   
		catch (InstantiationException e)   
		{   
		e.printStackTrace();   
		}   
		catch (IllegalAccessException e)   
		{   
		e.printStackTrace();   
		}   
	}

}
