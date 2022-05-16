package training.c2tc.day59;

import java.util.Comparator;

public class EmployeeSortAgeIdComparator implements Comparator<Employee1> {

	
	

	@Override
	public int compare(Employee1 s1, Employee1 s2) {
		// TODO Auto-generated method stub
		if(s1.age==s2.age)
		{
			return 0;
		}
		else if(s1.age>s2.age)
		{
			return 1;
		}
		else 
		return -1;
	}
	

}
