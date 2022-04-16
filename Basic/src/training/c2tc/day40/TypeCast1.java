package training.c2tc.day40;

abstract class Car
{
	Car car;
	public void start()
	{
		System.out.println("Started");
	}
	public Car getId()
	{
		return car;
	}
	public void stop()
	{
		System.out.println("Stopped");
	}
}

class Maruti extends Car
{
	Maruti maruti;
	public void start()
	{
		System.out.println("maruti start");
	}
	public Maruti getCar1()
	{
		System.out.println(" Maruti Car");
		return maruti;
	}
}
class Duster extends Car
{
	Duster duster;
//	public void start()
//	{
//		System.out.println("duster start");
//	}
	public Duster getCar2()
	{
		System.out.println(" Maruti Car");
		return duster;
	}
}
public class TypeCast1 {

	public static void main(String[] args) {
//		Maruti m =new Maruti();//Upcasting
//		Car a = m;
		Car a = new Maruti();
		Maruti m = (Maruti)a; //Downcasting
		m.getCar1();
//		Car ax = new Duster();
//		a.start();
//		ax.start();
	}

}
