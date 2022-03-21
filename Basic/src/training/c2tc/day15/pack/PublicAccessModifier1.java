package training.c2tc.day15.pack;

import training.c2tc.day15.PublicAccessModifier; // import package

class Bc extends PublicAccessModifier
{
	public void print2()
	{
		System.out.println(" Value B is :"+b); // access in sub class of other outside package
	}
}

public class PublicAccessModifier1 extends  PublicAccessModifier 
{

	public void print3()
	{
		System.out.println(" B is "+b); //access outside package in non sub class
	}
	public static void main(String[] args) {
		

		PublicAccessModifier1 o = new PublicAccessModifier1();
		o.print3();
		o.Print();
		
		Bc oj = new Bc();
		oj.print2();
		oj.Print();
	}

}
