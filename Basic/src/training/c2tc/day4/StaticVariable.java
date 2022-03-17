package training.c2tc.day4;

public class StaticVariable // is also known as class variable

{
	static int count;       //class level variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVariable ob1 = new StaticVariable();
		StaticVariable ob2 = new StaticVariable();
		ob1.count=5;
		ob2.count=5;
        
        ob1.count++;       //change in object1's count

        System.out.println(ob1.count);
        System.out.println(ob2.count);
	}

}
