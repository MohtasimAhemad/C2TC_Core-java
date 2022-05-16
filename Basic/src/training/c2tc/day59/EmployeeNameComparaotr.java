package training.c2tc.day59;

import java.util.Comparator;

public class EmployeeNameComparaotr implements Comparator<Employee1>
{

	public int compare(Employee1 s1, Employee1 s2) {
		
		return s1.name.compareTo(s2.name);
	}
}

