package day9;

class Pen
{
	String color="black";

	void isPen()
	{
		System.out.println("pen color is "+color);
	}
}

class BallPen extends Pen
{
	int price = 10;
	void isBallPen()
	{
		System.out.println("price of ball pen is "+price);
	}
}
public class JavaSingleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BallPen b = new BallPen();
		b.isPen();  // access super class method 
		b.isBallPen();
		
	}

}
