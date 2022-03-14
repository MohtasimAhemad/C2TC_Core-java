package day8;
/*  hackerrank solution  - java inheritance 1 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Animal              //super class
{
	void walk()           
	{
		System.out.println("I am walking");
	}
}

class Bird extends Animal           //sub class
{
	void fly()
	{
		System.out.println("I am flying");
	}
    void sing()
    {
        System.out.println("I am singing");
    }
}

public class JavaInheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Bird bird = new Bird();
		  bird.walk();
		  bird.fly();
	      bird.sing();

	}

}
