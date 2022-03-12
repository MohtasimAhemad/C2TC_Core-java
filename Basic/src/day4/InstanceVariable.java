package day4;

public class InstanceVariable 
{
		int count; //instance level variable // non static variable
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariable ob1= new InstanceVariable(); //create object 1
		InstanceVariable ob2= new InstanceVariable();  //create object 2
		
		ob1.count++;  //change in object1's count
		
		System.out.println(ob1.count);
        System.out.println(ob2.count);

	}

}
