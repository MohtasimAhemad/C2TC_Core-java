package training.c2tc.day9;

class Hospital
{
//	we create constructor here for hospital class
	Hospital()
	{
		System.out.println("APPOLO HOSPITAL AT NASHIK");
	}
}
class Ward extends Hospital
{
	Ward()
	{
		System.out.println("Appolo has number of wards");
	}
}

class General extends Ward
{
	General()
	{
		System.out.println("This is general ward for all types of patient");
	}
}

class ICU extends General
{
	ICU()
	{
		System.out.println("This is ICU ward for seriou patient");
	}
}

public class JavaInheritance1 {

	public static void main(String[] args) {

		ICU i = new ICU();
		
	}

}
