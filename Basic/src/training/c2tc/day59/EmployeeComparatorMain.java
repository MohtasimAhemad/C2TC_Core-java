package training.c2tc.day59;

import java.util.ArrayList;
import java.util.Collections;

import training.c2tc.day59.EmployeeNameComparaotr;
import training.c2tc.day59.EmployeeSortAgeIdComparator;

public class EmployeeComparatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		ArrayList<Employee1> a1 = new ArrayList<Employee1>();
		a1.add(new Employee1(1,"John",23000,23));
		a1.add(new Employee1(4,"Sahil",98000,32));
		a1.add(new Employee1(2,"Subash",8008,22));
		
		System.out.println("sorting by Id ");
		Collections.sort(a1,new EmployeeSortAgeIdComparator());
		for(Employee1 s1:a1)
		{
			System.out.println(s1.id+"  "+s1.name+"  "+s1.salary+" "+s1.age);
		}
		
		System.out.println("sorting by name ");
		Collections.sort(a1,new EmployeeNameComparaotr());
		for(Employee1 s1:a1)
		{
			System.out.println(s1.id+"  "+s1.name+"  "+s1.salary+" "+s1.age);
		}
	}

}
