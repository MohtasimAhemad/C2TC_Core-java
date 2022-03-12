package day1;


class Car
{
	public int gear , speed,downspeed; // Here we Declare data or State
	                           // represent the objects State
	
	public void Start(int g, int s) // here we declare method 
	{
		gear=g;
		speed=s;
	}
	public void Stop(int dec)  // methods define its interaction with the outside world.
	{
		downspeed=dec;
		
	}
	public void acelrate(int inc) //Methods operate on an object state and perform some task and operation.
	{
		speed=inc;
	}
	void GetData() 
	{
        System.out.println(" gear: "+ gear + " speed: " + speed+ " downspeed: "+ downspeed);
   }

}
public class Day1InClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Car a = new Car();
		a.Start(2,100);
		a.Stop(0);
		a.acelrate(20);
		a.GetData();
	}

}