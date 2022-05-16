package training.c2tc.day58;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> a11 = new ArrayList<Employee>();
		a11.add(new Employee(12,50000,"Amar","Comp"));
		a11.add(new Employee(1,80000,"Akbar","IT"));
		a11.add(new Employee(2,67987,"Anthony","Mech"));
		a11.add(new Employee(8,0000,"AAA","EE"));

	
		
		System.out.println("sorting by employee id ");

		System.out.println("emp_id \t"+"salary \t"+"name \t"+"department");
		Collections.sort(a11);
		for(Employee t:a11)
		{
			System.out.println(t.emp_id+"\t"+t.salary+"\t"+t.name+"\t"+t.department);	
		}
	}

	}

