package training.c2tc.day5;

import java.util.Scanner;

public class StaticMethod1 {
	Scanner sc = new Scanner(System.in);
	int bid;
	int scc_no;
	static String bank_name="SBI";
	
	StaticMethod1(int i, int ano)
	{
		bid=i;
		scc_no=ano;
	}
	static void change()
	{
		bank_name="BOB";
		
	}
	void display()
	{
		System.out.println("bank id is "+bid);
		System.out.println("account number "+scc_no);
		System.out.println("bank name "+bank_name);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod1 s1 = new StaticMethod1(121, 6527414);
		StaticMethod1 s2 = new StaticMethod1(122, 6527987);
		s1.display();
		s2.display();
		StaticMethod1.change();
		s1.display();
		s2.display();
	}

}
