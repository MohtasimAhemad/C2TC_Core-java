package training.c2tc.day18;

import java.lang.reflect.Constructor;

public class ObjectUsingNewInstanceMethodWithConstructor {

	private String str;   
	ObjectUsingNewInstanceMethodWithConstructor()   
	{   
	}   
	public void setName(String str)   
	{   
	this.str = str;   
	}   
	public static void main(String[] args) {

		
		try  
		{   
		Constructor<ObjectUsingNewInstanceMethodWithConstructor> constructor = ObjectUsingNewInstanceMethodWithConstructor.class.getDeclaredConstructor();   
		ObjectUsingNewInstanceMethodWithConstructor r = constructor.newInstance();   
		r.setName("tech Industry");   
		System.out.println(r.str);   
		}   
		catch (Exception e)   
		{   
		e.printStackTrace();   
		}   
	}

}
